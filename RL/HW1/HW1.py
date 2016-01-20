'''
A policy maps states to actions. I am taking the current state of this MDP to simply be the sum of 
all rewards that have been accumulated so far. 

With the MDP assumption, all I need to know to generate a policy is the current state.

'''

def DieN_policy( sum_of_rewards, B = [1,4,6,8,9,10,12,14,15,16,18,20,21,22,24,25,26,27,28,30], N=30):
    # Build a list of the possible rewards
    A = []
    for i in range(1,N+1):
        if i not in B:
            A.append(i)
    #endfor
    
    # This is the negative reward for rolling a number in B
    regret = -sum_of_rewards
    
    # To determine whether to take the risk to roll again and lose all the accumulated
    # reward, I need to do an expectation
    # For regret, that is the probability that I roll a number in B * the amount of regret
    EV_regret = (len(B)/N)*regret
    
    # For reward, is is just the probability that I roll a number not in B times the reward itself
    EV_reward = (1/N)*sum(A)
    
    ret_val = ""
    if EV_regret >= EV_reward:
        ret_val = "Don't roll again. Quit."
    else:
        ret_val = "Roll. The expected value of the reward is greater than the expected value of regret."
        
    return ret_val
    