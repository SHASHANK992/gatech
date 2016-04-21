"""
Template for implementing QLearner  (c) 2015 Tucker Balch
"""

import numpy as np
import random as rand

class QLearner(object):

    def __init__(self, \
        num_states=100, \
        num_actions = 4, \
        alpha = 0.2, \
        gamma = 0.9, \
        rar = 0.5, \
        radr = 0.99, \
        dyna = 0, \
        verbose = False):

        self.verbose = verbose
        self.num_actions = num_actions
        self.num_states = num_states
        self.state = num_states-1 # initial state
        self.last_action = 0
        self.alpha = alpha
        self.rar = rar
        self.radr = radr
        self.dyna = dyna
        self.gamma = gamma
        # Create Q table
        # There is one entry for every state-action combination
        self.Qtable = np.zeros((num_states, num_actions))

    def querysetstate(self, s):
        """
        @summary: Update the state without updating the Q-table
        @param s: The new state
        @returns: The selected action
        """
        # Update state first
        self.state = s
        # Choose the action
        action = self.choose_action(self.state)
        self.last_action = action
        if self.verbose: print "state =", s,"action =",action
        return action

    def query(self,s_prime,r):
        """
        @summary: Update the Q table and return an action
        @param s_prime: The new state
        @param r: The ne state
        @returns: The selected action
        """
        
        if self.verbose:
            print "Previous Q[", self.state, ", ", self.last_action, "] = ", self.Qtable[self.state, self.last_action]
        
        # Update the Q table using the current state, the last action 
        # that was taken, the next state, and the reward for transitioning
        # to that next state
        best_q, best_action = self.get_best_Q_and_action(s_prime)
        
        updateQ = (1-self.alpha)*(self.Qtable[self.state, self.last_action]) + self.alpha*(r + self.gamma*best_q)
        self.Qtable[self.state, self.last_action] = updateQ
        
        if self.verbose:
            print "Updated Q[", self.state, ", ", self.last_action, "] = ", self.Qtable[self.state, self.last_action]
        
        action = self.choose_action(s_prime)
        
        # Update the current state
        self.state = s_prime
        
        # Update the last action
        self.last_action = action
        
        if self.verbose: 
            print "State: ", self.state, " Action to take: ", action
        
        # Update the random action rate since this is the only method that should be updating it
        self.rar = self.rar * self.radr
        # Return action
        return action
    #end def
    
    def get_best_Q_and_action(self, state):
        best_q = float("-inf")
        best_action = 0
        for i in range(0,self.num_actions):
            if self.Qtable[state, i] > best_q:
                best_q = self.Qtable[state, i]
                best_action = i
            #end if
        #end for
        
        return best_q, best_action
    #end def
        
    def choose_action(self, state):
        action = 0
        
        # Generate random number
        random_num = rand.random()
        
        # If the random number is less than or equal to the rar, use a random action
        if random_num <= self.rar:
            action = rand.randint(0, self.num_actions-1)
        # Otherwise use the action determined by the Q table and the current state
        else:
            best_q, action = self.get_best_Q_and_action(state)        
        
        return action
    #end def


