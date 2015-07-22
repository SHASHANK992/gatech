# ----------
# Part Five
#
# This time, the sensor measurements from the runaway Traxbot will be VERY 
# noisy (about twice the target's stepsize). You will use this noisy stream
# of measurements to localize and catch the target.
#
# ----------
# YOUR JOB
#
# Complete the next_move function, similar to how you did last time. 
#
# ----------
# GRADING
# 
# Same as part 3 and 4. Again, try to catch the target in as few steps as possible.

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
    
    # Create a test robot
    test_robot = robot(target_pos[0], target_pos[1], O_copy['h_est'], O_copy['h_diff'], O_copy['distance'])
    
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

    # If OTHER is None, we have nothing to go off of (This is the 
    # first time it is called.) So just return the measurement
    if OTHER == None:
        xy_estimate = measurement
        P = matrix([[1000., 0., 0.],
                    [0., 1000., 0.],
                    [0., 0., 1000.]])
        OTHER = {'measurement': measurement, 'h_est': 0.0, 'P': P, 'distance': 1.0, 'h_diff': 0.5, 'iter': 1}
    else:        
        P = OTHER['P']
        iteration = OTHER['iter']
        # Use filter
        [estimate, h_est, P, distance, h_diff] = kalman_filter( measurement, OTHER, P )
        
        # Store for next iteration. Note that this is only the last of each of these. I don't
        # think that keeping a history is necessary
        OTHER = {'measurement': measurement, 'h_est': h_est, 'P': P, 'distance': distance, 'h_diff': h_diff}
        OTHER['iter'] = iteration + 1
        
        # Format
        xy_estimate = [estimate[0], estimate[1]]
        
    # You must return xy_estimate (x, y), and OTHER (even if it is None) 
    # in this order for grading purposes.
    return xy_estimate, OTHER
    
def kalman_filter(measurement, OTHER, P):
    # Currently my state vector consists of the estimated x,y, and heading
    # I might also have to include the distance and the difference between
    # subsequent headings since all of these will contain some error

    # Variables
    I = matrix([[1.,0.,0.],
                [0., 1.,0.], 
                [0.,0.,1.]])
    # The measurement function is constant. We observe x and y, but not heading 
    H = matrix([[1., 0., 0.],
                [0., 1., 0.]])
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
    X = matrix([[measurement[0]], # X
                [measurement[1]], # Y
                [OTHER['h_est']] ])      # Heading

    # Kalman equations for measurement step
    error = z - H*X
    S = H*P*H.transpose() + R
    K = P*H.transpose()*S.inverse()
    X = X + K*error
    P = (I - K*H)*P

    #********************************************************
    # prediction/motion update
    #********************************************************
    # With noisy measurements, the distance will not always be the same
    # We still need to estimate it, but we will correct later
    d = distance_between(OTHER['measurement'], measurement)
    
    # These measurements will also be off. We still need to calculate it though
    x_diff = measurement[0] - OTHER['measurement'][0]
    y_diff = measurement[1] - OTHER['measurement'][1]
    h_est = atan2(y_diff, x_diff)
    h_diff = h_est - OTHER['h_est']
    
    # Update the state vector. Notice the nonlinear equations
    x_estimate = X.value[0][0] + d*cos(h_est + h_diff)
    y_estimate = X.value[1][0] + d*sin(h_est + h_diff)        
    X = matrix([[x_estimate], 
                [y_estimate], 
                [h_est]])         
                       
    # The kalman filter assumes a linear motion update. This motion update is
    # nonlinear, so we have to do a first order Taylor expansion. See 
    # textbook, specifically EKF localization, for a good example
    # [ dx/dx        dx/dy        dx/d(theta) ]
    # [ dy/dx        dy/dy        dy/d(theta) ]
    # [ d(theta)/dx  d(theta)/dy  d(theta)/d(theta)]
    
    # Derivative of update equation for x following above matrix
    g1 = [ 1, 0, -d*sin(h_est + h_diff) ]
    # Derivative of update equation for y
    g2 = [ 0, 1,  d*cos(h_est + h_diff) ]
    # Derivative of update equation for theta
    g3 = [ 0, 0, 1 ]
    
    G = matrix([ g1,
                 g2,
                 g3 ])
    
    # Update uncertainty
    P = G*P*G.transpose()
    
    estimate = [ X.value[0][0], X.value[1][0] ]    
        
    return estimate, h_est, P, d, h_diff
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
    max_distance = 0.97 * target_bot.distance # 0.98 is an example. It will change.
    separation_tolerance = 0.02 * target_bot.distance # hunter must be within 0.02 step size to catch target
    caught = False
    ctr = 0
    #For Visualization
    import turtle
    window = turtle.Screen()
    window.bgcolor('white')
    chaser_robot = turtle.Turtle()
    chaser_robot.shape('arrow')
    chaser_robot.color('blue')
    chaser_robot.resizemode('user')
    chaser_robot.shapesize(0.3, 0.3, 0.3)
    broken_robot = turtle.Turtle()
    broken_robot.shape('turtle')
    broken_robot.color('green')
    broken_robot.resizemode('user')
    broken_robot.shapesize(0.3, 0.3, 0.3)
    size_multiplier = 15.0 #change size of animation
    chaser_robot.hideturtle()
    chaser_robot.penup()
    chaser_robot.goto(hunter_bot.x*size_multiplier, hunter_bot.y*size_multiplier-100)
    chaser_robot.showturtle()
    broken_robot.hideturtle()
    broken_robot.penup()
    broken_robot.goto(target_bot.x*size_multiplier, target_bot.y*size_multiplier-100)
    broken_robot.showturtle()
    measuredbroken_robot = turtle.Turtle()
    measuredbroken_robot.shape('circle')
    measuredbroken_robot.color('red')
    measuredbroken_robot.penup()
    measuredbroken_robot.resizemode('user')
    measuredbroken_robot.shapesize(0.1, 0.1, 0.1)
    broken_robot.pendown()
    chaser_robot.pendown()
    #End of Visualization
    # We will use your next_move_fcn until we catch the target or time expires.
    while not caught and ctr < 1000:
        # Check to see if the hunter has caught the target.
        hunter_position = (hunter_bot.x, hunter_bot.y)
        target_position = (target_bot.x, target_bot.y)
        separation = distance_between(hunter_position, target_position)
        if separation < separation_tolerance:
            print ("You got it right! It took you ", ctr, " steps to catch the target.")
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
        #Visualize it
        measuredbroken_robot.setheading(target_bot.heading*180/pi)
        measuredbroken_robot.goto(target_measurement[0]*size_multiplier, target_measurement[1]*size_multiplier-100)
        measuredbroken_robot.stamp()
        broken_robot.setheading(target_bot.heading*180/pi)
        broken_robot.goto(target_bot.x*size_multiplier, target_bot.y*size_multiplier-100)
        chaser_robot.setheading(hunter_bot.heading*180/pi)
        chaser_robot.goto(hunter_bot.x*size_multiplier, hunter_bot.y*size_multiplier-100)
        #End of visualization
        ctr += 1            
        if ctr >= 1000:
            print ("It took too many steps to catch the target.")
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
measurement_noise = 2.0*target.distance # VERY NOISY!!
#measurement_noise = .05*target.distance # VERY NOISY!!
target.set_noise(0.0, 0.0, measurement_noise)

hunter = robot(-10.0, -10.0, 0.0)

print demo_grading(hunter, target, next_move)
