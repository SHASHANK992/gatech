# ----------
# Part Four
#
# Again, you'll track down and recover the runaway Traxbot.
# But this time, your speed will be about the same as the runaway bot.
# This may require more careful planning than you used last time.
#
# ----------
# YOUR JOB
#
# Complete the next_move function, similar to how you did last time.
#
# ----------
# GRADING
#
# Same as part 3. Again, try to catch the target in as few steps as possible.

#*******************************************************************
# Developer comments
# This is where I will record the progression of this code.
'''
Iteration 1 - I created a Kalman filter that had three state variables (x position,
y position, and heading). The results were fair enough, usually taking 500+ steps
to capture the robot

Iteration 2 - I wanted to improve the performance from iteration 1. I found that
my implentation of the Kalman filter was faulty. I took my state directly from the
current measurements. This meant that the noise present in the measurements I was
adding right back into my filter! I was able to make significant improvements on
parts 2 and 3 with these changes. However, I couldn't get this part (part 4) to pass.
When it captured the robot, it took less than 200 steps, but often times it couldn't
catch the robot.

Iteration 3 - I think the problem with my corrected Kalman filter is that
it is highly susceptible to biases in the initial conditions. I think what I need to
do is not start using the EKF right away but to take a few iterations and build up
the initial conditions. Then seed the filter with these values and start using it.
UPDATE: I implemented this and now I got the test to pass once. The number of steps
when the robot does catch it is still fairly small, usually less than 100 now. However,
when I submit it, there is still one test that virtually never passes.

Iteration 4 - Found the bug that was causing the error in the third run when submitting.
I was failing to properly update the previous measurement field when creating the initial
conditions.

'''
#*********************************************************************


from robot import *
from math import *
from matrix import *
import random

def next_move(hunter_position, hunter_heading, target_measurement, max_distance, OTHER = None):
    # This function will be called after each time the target moves.

    # Since we are moving the same speed as the target, we need a way to determine
    # 1) If we are able to capture the robot
    # 2) If we can't capture the target, a way to find a cut-off point to
    #    intercept the target

    # Find the estimated next position
    [destination, OTHER] = estimate_next_pos(target_measurement, OTHER)

    # If we can't capture the target, find an intercept point
    if not can_be_captured(destination, hunter_position, max_distance) and OTHER['iter'] > 5:
        destination = find_intercept_point(hunter_position, target_measurement, max_distance, OTHER)
    # Otherwise we can navigate to the estimated target position no problem
    #end if

    # Find the angle from the current hunter position to the estimated next position
    desired_angle = atan2(destination[1] - hunter_position[1], destination[0] - hunter_position[0])

    # Set turning as the difference between the desired heading and the current heading
    # of the hunter
    turning = angle_trunc(desired_angle) - hunter_heading

    # Set speed (i.e., distance) relative to distance between the hunter and the target
    distance = distance_between(destination, hunter_position)

    # The OTHER variable is a place for you to store any historical information about
    # the progress of the hunt (or maybe some localization information). Your return format
    # must be as follows in order to be graded properly.
    return turning, distance, OTHER
# end next_move

def find_intercept_point(hunter_pos, target_pos, max_distance, OTHER):
    # Keep track of the number of steps it would take to reach the position
    steps = 1

    # Take a copy of OTHER
    O_copy = OTHER
    h_est = OTHER['state'].value[2][0]
    h_diff = OTHER['state'].value[4][0]
    distance = OTHER['state'].value[3][0]

    # Create a test robot
    test_robot = robot(target_pos[0], target_pos[1], h_est, h_diff, distance)

    # Move robot once
    test_robot.move_in_circle()
    target_pos = test_robot.sense()

    # It sounds like a lot of work, but I think that I can create a test robot and use that to
    # predict a few steps ahead
    # Use the move_in_circle() function and sense()
    while True:
        # If we can navigate to the estimated position within the number
        # of steps, estimate one more position and navigate to halfway between
        # those two
        if distance_between(target_pos, hunter_pos)/max_distance < steps:
            test_robot.move_in_circle()
            next_target_pos = test_robot.sense()

            destination = [ (next_target_pos[0]+target_pos[0])/2, (next_target_pos[1]+target_pos[1])/2 ]
            break
        # Otherwise, estimate one time step next
        else:
            steps += 1
            test_robot.move_in_circle()
            target_pos = test_robot.sense()

    return destination
#end find_intercept_point

def can_be_captured(target_pos, hunter_pos, max_distance):
    return distance_between(target_pos, hunter_pos) < max_distance

def estimate_next_pos(measurement, OTHER = None):
    """Estimate the next (x, y) position of the wandering Traxbot
    based on noisy (x, y) measurements."""
    xy_estimate = []

    # If OTHER is None, we have nothing to go off of (This is the
    # first time it is called.) So just return the measurement
    # Don't produce an estimate for heading, etc.
    if OTHER == None:
        xy_estimate = measurement
        P = matrix([[1000., 0., 0., 0., 0.],
                    [0., 1000., 0., 0., 0.],
                    [0., 0., 1000., 0., 0.],
                    [0., 0., 0., 1000., 0.],
                    [0., 0., 0., 0., 1000.]])
        OTHER = {'measurement': measurement, 'iter': 1, 'P': P}
        #OTHER = {'measurement': measurement, 'h_est': 1.0, 'P': P, 'distance': 1.0, 'h_diff': 0.5, 'iter': 1}

    # This is the second time
    # We can produce estimate of heading
    # Still just return measurement for xy position
    elif OTHER['iter'] == 2:
        x_diff = measurement[0] - OTHER['measurement'][0]
        y_diff = measurement[1] - OTHER['measurement'][1]
        h_est = atan2(y_diff, x_diff)

        OTHER['measurement'] = measurement
        OTHER['h_est'] = h_est

        xy_estimate = measurement
    # This is the third time
    # We can produce estimate of heading difference
    # Still just return measurement for xy position
    elif OTHER['iter'] == 3:
        x_diff = measurement[0] - OTHER['measurement'][0]
        y_diff = measurement[1] - OTHER['measurement'][1]
        h_est = atan2(y_diff, x_diff)
        h_diff = h_est - OTHER['h_est']

        d = distance_between(OTHER['measurement'], measurement)

        OTHER['h_diff'] = h_diff
        OTHER['distance'] = d
        OTHER['measurement'] = measurement

        xy_estimate = measurement
    # Otherwise we have set up the initial conditions and we can use
    # the EKF
    else:
        P = OTHER['P']
        iteration = OTHER['iter']
        iteration += 1
        # Use filter
        [state, P] = kalman_filter( measurement, OTHER, P )

        # Store for next iteration. Note that this is only the last of each of these. I don't
        # think that keeping a history is necessary
        OTHER = {'measurement': measurement, 'P': P, 'state': state, 'iter': iteration}

        # Format
        xy_estimate = [state.value[0][0], state.value[1][0]]
 
    # Keep track of the number of iterations
    if OTHER['iter'] < 4:
        iteration = OTHER['iter']
        iteration += 1
        OTHER['iter'] = iteration
    
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
    max_distance = 0.98 * target_bot.distance # 0.98 is an example. It will change.
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


''' Test cases
case 0:
0.0 10.0 3.14159265359 0.209439510239 2.5
-10.0 -10.0 0.0 0.628318530718 1.0

case 1
5.3 6.2 0.0 0.314159265359 2.3
-2.8 -10.2 0.0 0.628318530718 1.0

case 2
-3.9 9.5 -2.09439510239 0.202683397006 1.45
-5.7 3.2 2.0 0.628318530718 1.0

case 3
-10.2 -11.8 0.785398163397 0.483321946706 4.8
0.0 3.2 -1.0 0.628318530718 1.0
'''

# Case 0
'''
target = robot(0.0, 10.0, pi, .2*pi/30, 2.5)
measurement_noise = .05*target.distance
target.set_noise(0.0, 0.0, measurement_noise)

hunter = robot(-10.0, -10.0, 0.0, 0.628, 1.0)

# Case 1

target = robot(5.3, 6.2, 0.0, 0.314, 2.3)
measurement_noise = .05*target.distance
target.set_noise(0.0, 0.0, measurement_noise)

hunter = robot(-2.8, -10.2, 0.0, 0.628, 1.0)

# Case 2
target = robot(-3.9, 9.5, -2.094, 0.203, 1.45)
measurement_noise = .05*target.distance
target.set_noise(0.0, 0.0, measurement_noise)

hunter = robot(-5.7, 3.2, 2.0, 0.628, 1.0)
'''
#case 3
target = robot(-10.2, -11.8, .785, .483, 4.8)
measurement_noise = .05*target.distance
target.set_noise(0.0, 0.0, measurement_noise)

hunter = robot(0.0, 3.2, -1.0, 0.628, 1.0)

print demo_grading(hunter, target, next_move)
