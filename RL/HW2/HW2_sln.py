import numpy as np

# Assuming MDP in problem statement

def findBestLambda( probToState1, valueEstimates, rewards):
    # Set up some values
    path_upper = rewards[0] + rewards[2]
    path_lower = rewards[1] + rewards[3]
    
    # First compute TD(1) for S0
    # This is just the sum of expected rewards (outcome based)
    TD1_s0 = probToState1*(path_upper) + (1-probToState1)*(path_lower) + \
                        rewards[4] + rewards[5] + rewards[6]
    
    #print "TD1 S0 = ", TD1_s0
    
    # Next, compute the k step estimators
    # Note: This is an infinite sum, but to solve using polynomial roots
    #       we can cut it off at some large number (like 20)
    #  Fortunately, even though it is an infinte sum, the MDP is finite, so we don't
    #  need to have infinite terms. Past the terminal state, many of the terms
    #  cancel out. You will see in the code below
    E1 = probToState1*(rewards[0])         + (1-probToState1)*(rewards[1]) + \
         probToState1*(valueEstimates[1]) + (1-probToState1)*(valueEstimates[2])
         
    E2 = probToState1*(path_upper) + (1-probToState1)*(path_lower) + valueEstimates[3]
    
    E3 = probToState1*(path_upper) + (1-probToState1)*(path_lower) + rewards[4] + valueEstimates[4]
    
    E4 = probToState1*(path_upper) + (1-probToState1)*(path_lower) + rewards[4] + rewards[5] + valueEstimates[5]
    
    E5 = probToState1*(path_upper) + (1-probToState1)*(path_lower) + rewards[4] + rewards[5] + rewards[6] + valueEstimates[6]
    
    #print "E1: ", E1, " E2: ", E2, " E3: ", E3, " E4: ", E4, " E5: ", E5
    # As I mentioned above, this is an infinite sum. But since this MDP is finite, we don't have more than
    # 5 steps to take here. As such, all the higher k step estimates are the same as E5. This makes
    # finding the coefficients of the polynomial estimate of TD(lambda) somewhat straightforward to compute
    #         x**n, x**(n-1), ..., x**2, x**1, x**0
    #coeff = [ -E5, 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., E5-E4, E4-E3, E3-E2, E2-E1, E1-TD1_s0 ]
    #coeff = [ -E5, 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., E5-E4, E4-E3, E3-E2, E2-E1, E1-TD1_s0 ]
    coeff = [ -E5, 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., E5-E4, E4-E3, E3-E2, E2-E1, E1-TD1_s0 ]
    roots = np.roots( coeff )
    
    
    
    return roots
#end findBestLambda



if __name__ == "__main__":
    '''
    print "\n\n\n*************************************************"
    print " Test 0"
    print "*************************************************"
    probToState1 = 0.5
    valueEstimates = [0., 3., 8., 2., 1., 2., 0.]
    rewards = [0., 0., 0., 4., 1., 1., 1.]
    print findBestLambda(probToState1, valueEstimates, rewards)
 
    print "\n\n\n*************************************************"
    print " Test 1"
    print "*************************************************"
    probToState1 = 0.81
    valueEstimates = [ 0.0,  4.0, 25.7,  0.0, 20.1, 12.2, 0.0 ]
    rewards        = [ 7.9, -5.1, 2.5,  -7.2, 9.0,  0.0,  1.6 ]
    print findBestLambda(probToState1, valueEstimates, rewards)
    
    print "\n\n\n*************************************************"
    print " Test 2"
    print "*************************************************"
    probToState1 = 0.22
    valueEstimates = [ 0.0, -5.2, 0.0, 25.4, 10.6, 9.2, 12.3 ]
    rewards        = [ -2.4, 0.8, 4.0, 2.5,  8.6, -6.4, 6.1  ]
    roots, TD1, coeff = findBestLambda(probToState1, valueEstimates, rewards)
    print "TD1: ", TD1
    print coeff
    print np.polyval(coeff, 0.49567093118984556 )
    
    print "\n\n\n*************************************************"
    print " Test 3"
    print "*************************************************"
    probToState1 = 0.64
    valueEstimates = [  0.0, 4.9,  7.8, -2.3, 25.5, -10.2, -6.5 ]
    rewards        = [ -2.4, 9.6, -7.8,  0.1,  3.4, -2.1,   7.9 ]
    print findBestLambda(probToState1, valueEstimates, rewards)
    '''
    
    print "\n\n\n*************************************************"
    print " Homework problem 1"
    print "*************************************************"
    probToState1 = 1.0
    valueEstimates = [0.0, 6.5, 0.0, 28.4, 23.5, 19.1, -13.6]
    rewards        = [9.9, 6.2, 3.1, 6.4,  4.8,  1.4,  -0.6]
    print findBestLambda(probToState1, valueEstimates, rewards)
    # Answer: 0.08819
    
    
    print "\n\n\n*************************************************"
    print " Homework problem 2"
    print "*************************************************"
    probToState1 = 0.23
    valueEstimates = [0.0, 0.0, -17.2, 12.2, 0.3, 23.5, -12.4]
    rewards        = [7.7, 6.5, 2.9,   0.0,  5.2, 2.8,  -9.3]
    print findBestLambda(probToState1, valueEstimates, rewards)
    # Answer: 0.52
    # Note: I got a root close to here, but not exactly here. I had to
    #       "look" around here to find it 
   
    print "\n\n\n*************************************************"
    print " Homework problem 3"
    print "*************************************************"
    probToState1 = 0.32
    valueEstimates = [0.0, 0.0, -3.8, 19.6, 14.2, -7.3, 20.4]
    rewards        = [0.9, 6.7, 5.1,  5.3,  5.0,  -2.9, 0.0]
    print findBestLambda(probToState1, valueEstimates, rewards)
    # Answer: 0.39415413
    