# ----------
# Part Two
#
# Now we'll make the scenario a bit more realistic. Now Traxbot's
# sensor measurements are a bit noisy (though its motions are still
# completetly noise-free and it still moves in an almost-circle).
# You'll have to write a function that takes as input the next
# noisy (x, y) sensor measurement and outputs the best guess 
# for the robot's next position.
#
# ----------
# YOUR JOB
#
# Complete the function estimate_next_pos. You will be considered 
# correct if your estimate is within 0.01 stepsizes of Traxbot's next
# true position. 
#
# ----------
# GRADING
# 
# We will make repeated calls to your estimate_next_pos function. After
# each call, we will compare your estimated position to the robot's true
# position. As soon as you are within 0.01 stepsizes of the true position,
# you will be marked correct and we will tell you how many steps it took
# before your function successfully located the target bot.

# These import steps give you access to libraries which you may (or may
# not) want to use.
from robot import *  # Check the robot.py tab to see how this works.
from math import *
from matrix import * # Check the matrix.py tab to see how this works.
import random

# This is the function you have to write. Note that measurement is a 
# single (x, y) point. This function will have to be called multiple
# times before you have enough information to accurately predict the
# next position. The OTHER variable that your function returns will be 
# passed back to your function the next time it is called. You can use
# this to keep track of important information over time.
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
        OTHER = measurement, 0.0, P
    else:        
        P = OTHER[2]
        # Use filter
        [estimate, h_est, P] = kalman_filter(measurement, OTHER, P )
        
        # Store for next iteration
        OTHER = measurement, h_est, P

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
    X = matrix([[measurement[0]],
                [measurement[1]],
                [OTHER[1]]])

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
    d = distance_between(OTHER[0], measurement)

    # These measurements will also be off. We still need to calculate it though
    x_diff = measurement[0] - OTHER[0][0]
    y_diff = measurement[1] - OTHER[0][1]
    h_est = atan2(y_diff, x_diff)    
    
    # Update the state vector. Notice the nonlinear equations
    x_estimate = X.value[0][0] + d*cos(h_est + (h_est-OTHER[1]))
    y_estimate = X.value[1][0] + d*sin(h_est + (h_est-OTHER[1]))        
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
    g1 = [ 1, 0, -d*sin(h_est + (h_est-OTHER[1])) ]
    # Derivative of update equation for y
    g2 = [ 0, 1,  d*cos(h_est + (h_est-OTHER[1])) ]
    # Derivative of update equation for theta
    g3 = [ 0, 0, 1 ]
    
    G = matrix([ g1,
                 g2,
                 g3 ])
    
    # Update uncertainty
    P = G*P*G.transpose()
    
    estimate = [ X.value[0][0], X.value[1][0] ]    
        
    return estimate, h_est, P
#end kalman_filter


# A helper function you may find useful.
def distance_between(point1, point2):
    """Computes distance between point1 and point2. Points are (x, y) pairs."""
    x1, y1 = point1
    x2, y2 = point2
    return sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)

# This is here to give you a sense for how we will be running and grading
# your code. Note that the OTHER variable allows you to store any 
# information that you want. 
def demo_grading(estimate_next_pos_fcn, target_bot, OTHER = None):
    localized = False
    distance_tolerance = 0.01 * target_bot.distance
    ctr = 0
    # if you haven't localized the target bot, make a guess about the next
    # position, then we move the bot and compare your guess to the true
    # next position. When you are close enough, we stop checking.
    while not localized and ctr <= 1000:
        ctr += 1
        measurement = target_bot.sense()
        position_guess, OTHER = estimate_next_pos_fcn(measurement, OTHER)
        target_bot.move_in_circle()
        true_position = (target_bot.x, target_bot.y)
        error = distance_between(position_guess, true_position)
        if error <= distance_tolerance:
            print "You got it right! It took you ", ctr, " steps to localize."
            localized = True
        if ctr == 1000:
            print "Sorry, it took you too many steps to localize the target."
    return localized

# This is a demo for what a strategy could look like. This one isn't very good.
def naive_next_pos(measurement, OTHER = None):
    """This strategy records the first reported position of the target and
    assumes that eventually the target bot will eventually return to that 
    position, so it always guesses that the first position will be the next."""
    if not OTHER: # this is the first measurement
        OTHER = measurement
    xy_estimate = OTHER 
    return xy_estimate, OTHER

# This is how we create a target bot. Check the robot.py file to understand
# How the robot class behaves.
test_target = robot(2.1, 4.3, 0.5, 2*pi / 34.0, 1.5)
measurement_noise = 0.05 * test_target.distance
test_target.set_noise(0.0, 0.0, measurement_noise)

demo_grading(estimate_next_pos, test_target)




