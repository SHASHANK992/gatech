# ----------
# Part Three
#
# Now you'll actually track down and recover the runaway Traxbot.
# In this step, your speed will be about twice as fast the runaway bot,
# which means that your bot's distance parameter will be about twice that
# of the runaway. You can move less than this parameter if you'd
# like to slow down your bot near the end of the chase.
#
# ----------
# YOUR JOB
#
# Complete the next_move function. This function will give you access to
# the position and heading of your bot (the hunter); the most recent
# measurement received from the runaway bot (the target), the max distance
# your bot can move in a given timestep, and another variable, called
# OTHER, which you can use to keep track of information.
#
# Your function will return the amount you want your bot to turn, the
# distance you want your bot to move, and the OTHER variable, with any
# information you want to keep track of.
#
# ----------
# GRADING
#
# We will make repeated calls to your next_move function. After
# each call, we will move the hunter bot according to your instructions
# and compare its position to the target bot's true position
# As soon as the hunter is within 0.01 stepsizes of the target,
# you will be marked correct and we will tell you how many steps it took
# before your function successfully located the target bot.
#
# As an added challenge, try to get to the target bot as quickly as
# possible.

from robot import *
from math import *
from matrix import *
import random

def next_move(hunter_position, hunter_heading, target_measurement, max_distance, OTHER = None):
    # This function will be called after each time the target moves.

    # Since we are moving twice as fast as the other robot,
    # we can just navigate to the estimated next position of the
    # target robot.

    # Find the estimated next position of the target bot
    [target_nextXY, OTHER] = estimate_next_pos(target_measurement, OTHER)

    # OTHER contains xy_measurement, heading estimate, matrix P

    # Find the angle from the current hunter position to the estimated next position
    desired_angle = atan2(target_nextXY[1]-hunter_position[1], target_nextXY[0]-hunter_position[0])

    # Set turning as the difference between the desired heading and the current heading
    # of the hunter
    turning = angle_trunc(desired_angle) - hunter_heading

    # Set speed (i.e., distance) relative to distance between the hunter and the target
    distance = distance_between(target_nextXY, hunter_position)

    # The OTHER variable is a place for you to store any historical information about
    # the progress of the hunt (or maybe some localization information). Your return format
    # must be as follows in order to be graded properly.
    return turning, distance, OTHER
# end next_move

def estimate_next_pos(measurement, OTHER = None):
    """Estimate the next (x, y) position of the wandering Traxbot
    based on noisy (x, y) measurements."""

    # If OTHER is None, we have nothing to go off of (This is the
    # first time it is called.) So just return the measurement
    if OTHER == None:
        xy_estimate = measurement
        P = matrix([[1000., 0., 0., 0., 0.],
                    [0., 1000., 0., 0., 0.],
                    [0., 0., 1000., 0., 0.],
                    [0., 0., 0., 1000., 0.],
                    [0., 0., 0., 0., 1000.]])
        OTHER = {'measurement': measurement, 'h_est': 1.0, 'P': P, 'distance': 1.0, 'h_diff': 0.5, 'iter': 1}
    else:
        P = OTHER['P']
        iteration = OTHER['iter']
        # Use filter
        [state, P] = kalman_filter( measurement, OTHER, P )

        # Store for next iteration. Note that this is only the last of each of these. I don't
        # think that keeping a history is necessary
        OTHER = {'measurement': measurement, 'P': P, 'state': state}
        OTHER['iter'] = iteration + 1

        # Format
        xy_estimate = [state.value[0][0], state.value[1][0]]

    # You must return xy_estimate (x, y), and OTHER (even if it is None)
    # in this order for grading purposes.
    return xy_estimate, OTHER

def kalman_filter(measurement, OTHER, P):
    # My state vector consists of the estimated x,y, heading, the distance
    # each time step and the difference between subsequent headings.

    # Variables
    I = matrix([[1.,0.,0.,0.,0.],
                [0.,1.,0.,0.,0.],
                [0.,0.,1.,0.,0.],
                [0.,0.,0.,1.,0.],
                [0.,0.,0.,0.,1.]])
    # The measurement function is constant. We observe x and y, but not heading,
    # distance, or the heading difference
    H = matrix([[1., 0., 0.,0.,0.],
                [0., 1., 0.,0.,0.]])
    # Measurement uncertainty. Based on global variable.
    R = matrix([[measurement_noise,0.],
                [0.,measurement_noise]])

    #***************************************
    # measurement step
    #***************************************
    # Measurement will be coming in as a row vector, which is just awkward to
    # work with. Change it to a column vector for ease
    z = matrix([[measurement[0]],
                [measurement[1]]])

    # State vector
    # I found that if I used the state vector from iteration to iteration,
    # I could reduce the running time significantly.
    # This is also why I had to include 5 state variables so I could generate
    # estimates for all the state variables
    if 'state' not in OTHER:
        X = matrix([[measurement[0]], # X
                    [measurement[1]], # Y
                    [OTHER['h_est']], # heading
                    [OTHER['distance']], # distance
                    [OTHER['h_diff']]   ])      # Heading difference
    else:
        X = OTHER['state']


    # Kalman equations for measurement step
    error = z - H*X
    S = H*P*H.transpose() + R
    K = P*H.transpose()*S.inverse()
    X = X + K*error
    P = (I - K*H)*P

    #********************************************************
    # prediction/motion update
    #********************************************************
    x = X.value[0][0]
    y = X.value[1][0]
    h_est = X.value[2][0]
    d = X.value[3][0]
    h_diff = X.value[4][0]


    # Update the state vector. Notice the nonlinear equations
    x_estimate = X.value[0][0] + d*cos(h_est + h_diff)
    y_estimate = X.value[1][0] + d*sin(h_est + h_diff)
    X = matrix([[x_estimate],
                [y_estimate],
                [h_est+h_diff],
                [d],
                [h_diff]])



    # The kalman filter assumes a linear motion update. This motion update is
    # nonlinear, so we have to do a first order Taylor expansion. See
    # textbook, specifically EKF localization, for a good example
    # [ dx/dx        dx/dy        dx/d(theta)       dx/d(dist)       dx/d(hdiff)]
    # [ dy/dx        dy/dy        dy/d(theta)       dy/d(dist)       dy/d(hdiff) ]
    # [ d(h_est)/dx  d(h_est)/dy  d(h_est)/d(h_est) d(h_est)/d(dist) d(h_est)/d(hdiff) ]
    # [ d(dist)/dx   d(dist)/dy   d(dist)/d(theta)  d(dist)/d(dist)  d(dist)/d(hdiff) ]
    # [ d(hdiff)dx   d(hdiff)/dy  d(hdiff)/d(theta) d(hdiff)/d(dist) d(hdiff)/d(hdiff)]

    # Derivative of update equation for x following above matrix
    g1 = [ 1, 0, -d*sin(h_est + h_diff), cos(h_est + h_diff), -d*sin(h_est + h_diff) ]
    # Derivative of update equation for y
    g2 = [ 0, 1,  d*cos(h_est + h_diff), sin(h_est + h_diff), d*cos(h_est + h_diff) ]
    # Derivative of update equation for theta
    g3 = [ 0, 0, 1, 0, 1]
    # Derivative of update equation for distance
    g4 = [ 0, 0, 0, 1, 0 ]
    # Derivative of update equation for heading difference
    g5 = [ 0, 0, 0, 0, 1 ]

    G = matrix([ g1,
                 g2,
                 g3,
                 g4,
                 g5 ])

    # Update uncertainty
    P = G*P*G.transpose()

    estimate = [ X.value[0][0], X.value[1][0] ]

    return X, P
#end kalman_filter

def distance_between(point1, point2):
    """Computes distance between point1 and point2. Points are (x, y) pairs."""
    x1, y1 = point1
    x2, y2 = point2
    return sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)

def demo_grading(hunter_bot, target_bot, next_move_fcn, OTHER = None):
    """Returns True if your next_move_fcn successfully guides the hunter_bot
    to the target_bot. This function is here to help you understand how we
    will grade your submission."""
    max_distance = 1.94 * target_bot.distance # 1.94 is an example. It will change.
    separation_tolerance = 0.02 * target_bot.distance # hunter must be within 0.02 step size to catch target
    caught = False
    ctr = 0

    # We will use your next_move_fcn until we catch the target or time expires.
    while not caught and ctr < 1000:

        # Check to see if the hunter has caught the target.
        hunter_position = (hunter_bot.x, hunter_bot.y)
        target_position = (target_bot.x, target_bot.y)
        separation = distance_between(hunter_position, target_position)
        if separation < separation_tolerance:
            print "You got it right! It took you ", ctr, " steps to catch the target."
            caught = True

        # The target broadcasts its noisy measurement
        target_measurement = target_bot.sense()

        # This is where YOUR function will be called.
        turning, distance, OTHER = next_move_fcn(hunter_position, hunter_bot.heading, target_measurement, max_distance, OTHER)

        # Don't try to move faster than allowed!
        if distance > max_distance:
            distance = max_distance

        # We move the hunter according to your instructions
        hunter_bot.move(turning, distance)

        # The target continues its (nearly) circular motion.
        target_bot.move_in_circle()

        ctr += 1
        if ctr >= 1000:
            print "It took too many steps to catch the target."
    return caught

def angle_trunc(a):
    """This maps all angles to a domain of [-pi, pi]"""
    while a < 0.0:
        a += pi * 2
    return ((a + pi) % (pi * 2)) - pi

def get_heading(hunter_position, target_position):
    """Returns the angle, in radians, between the target and hunter positions"""
    hunter_x, hunter_y = hunter_position
    target_x, target_y = target_position
    heading = atan2(target_y - hunter_y, target_x - hunter_x)
    heading = angle_trunc(heading)
    return heading

def naive_next_move(hunter_position, hunter_heading, target_measurement, max_distance, OTHER):
    """This strategy always tries to steer the hunter directly towards where the target last
    said it was and then moves forwards at full speed. This strategy also keeps track of all
    the target measurements, hunter positions, and hunter headings over time, but it doesn't
    do anything with that information."""
    if not OTHER: # first time calling this function, set up my OTHER variables.
        measurements = [target_measurement]
        hunter_positions = [hunter_position]
        hunter_headings = [hunter_heading]
        OTHER = (measurements, hunter_positions, hunter_headings) # now I can keep track of history
    else: # not the first time, update my history
        OTHER[0].append(target_measurement)
        OTHER[1].append(hunter_position)
        OTHER[2].append(hunter_heading)
        measurements, hunter_positions, hunter_headings = OTHER # now I can always refer to these variables

    heading_to_target = get_heading(hunter_position, target_measurement)
    heading_difference = heading_to_target - hunter_heading
    turning =  heading_difference # turn towards the target
    distance = max_distance # full speed ahead!
    return turning, distance, OTHER

target = robot(0.0, 10.0, 0.0, 2*pi / 30, 1.5)
measurement_noise = .05*target.distance
target.set_noise(0.0, 0.0, measurement_noise)

hunter = robot(-10.0, -10.0, 0.0)

#print demo_grading(hunter, target, naive_next_move)
