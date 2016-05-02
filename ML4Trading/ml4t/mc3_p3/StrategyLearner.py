"""
Template for implementing StrategyLearner  (c) 2016 Tucker Balch
"""

import datetime as dt
import QLearner as ql
import pandas as pd
import numpy as np
import util as ut

class StrategyLearner(object):

    # constructor
    def __init__(self, verbose = False):
        self.verbose = verbose

    # this method should create a QLearner, and train it for trading
    def addEvidence(self, symbol = "IBM", \
        sd=dt.datetime(2008,1,1), \
        ed=dt.datetime(2009,1,1), \
        sv = 10000): 

        self.nstates = 3000
        # Create new instance of Q learner 
        # I am hard coding the number of states to 3000
        # It seems like this should be configurable, but it is not 
        # allowed in the API for this assignment
        # All the other values I will keep as the default
        self.qLearner = ql.QLearner(num_states=self.nstates, \
                                    num_actions=3, \
                                    verbose=self.verbose)
        self.learner = ql.QLearner()
        
        self.position = 2  

        # Get stock data
        # example usage of the old backward compatible util function
        syms=[symbol]
        dates = pd.date_range(sd, ed)
        prices_all = ut.get_data(syms, dates)  # automatically adds SPY
        prices = prices_all[syms]  # only portfolio symbols
        prices_SPY = prices_all['SPY']  # only SPY, for comparison later
        price_array = prices.values
        if self.verbose: print prices
  
        # example use with new colname 
        volume_all = ut.get_data(syms, dates, colname = "Volume")  # automatically adds SPY
        volume = volume_all[syms]  # only portfolio symbols
        volume_SPY = volume_all['SPY']  # only SPY, for comparison later
        if self.verbose: print volume
        
        # Create features from stock data
        features = self.compute_features(price_array)
        
        # Discretize features into distinct states
        states = self.discretize_features(features)
        
        # With states computed, we need to fill in the Q table
        # For 1000 iterations (TODO: There is probably a better way to do this)
        self.portfolio_val = sv
        self.cash_value = sv
        for i in range(0,1000):
            # Set the initial state
            # We have no holdings, so state is 2
            state = 2000+states[0]
            action = self.qLearner.querysetstate(state)
            
            # For each day (except the first)
            for j in range(1, states.shape[0]): 
                # Take action, get reward
                # Question - are we constrained to only take one position at time? - yes
                reward, action_taken = self.take_action(price_array, j-1, action)
                
                # The position is now updated                
                # Update state
                state = self.position*1000 + states[j]
                
                # Update Q table
                action = self.qLearner.query(state, reward)
        
            #end for
        #end for               
    #end def
        
   
    # this method should use the existing policy and test it against new data
    def testPolicy(self, symbol = "IBM", \
        sd=dt.datetime(2009,1,1), \
        ed=dt.datetime(2010,1,1), \
        sv = 10000):

        # here we build a fake set of trades
        # your code should return the same sort of data
        dates = pd.date_range(sd, ed)
        prices_all = ut.get_data([symbol], dates)  # automatically adds SPY
        syms = [symbol]
        prices = prices_all[syms]  # only portfolio symbols
        price_array = prices.values
        trades = prices_all[[symbol,]]  # only portfolio symbols
        trades_SPY = prices_all['SPY']  # only SPY, for comparison later
        trades.values[:,:] = 0 # set them all to nothing

        # Create features from stock data
        features = self.compute_features(price_array)
        
        # Discretize features into distinct states
        states = self.discretize_features(features)
        
        # set the starting positions
        self.position = 2
        
        state = self.position*1000 + states[0]
        
        # Get the first action
        action = self.qLearner.querysetstate(state)
        
        # For each day in the trading period
        for i in range(1, price_array.shape[0]):
            # Take action, get reward
            reward, action_taken = self.take_action(price_array, i-1, action)
        
            # Update state
            state = self.position*1000 + states[i]
                
            # Update Q table
            action = self.qLearner.query(state, reward)
            
            # Update trading data frame
            if action_taken == 0: # Buy
                trades.values[i,:] = 100.0
            elif action_taken == 1: # sell
                trades.values[i,:] = -100.0
            # elif action_taken == 2: # hold - do nothing
        #end for
        
        # It looks like you need to cash out on the last day of trading
        if self.position == 0: # Buy
            trades.values[price_array.shape[0]-1,:] = -100.0
        elif self.position == 1: # Sell
            trades.values[price_array.shape[0]-1,:] = 100.0
        
        if self.verbose: print type(trades) # it better be a DataFrame!
        if self.verbose: print trades
        if self.verbose: print prices_all
        
        return trades
    #end def

    '''
    Input
       prices: numpy array of prices
       index:  index into prices array
       action: Which action to take (buy, sell, hold)
       
    Output
      reward: change in portfolio value
    '''
    def take_action(self, prices, index, action):
        reward = 0
        action_taken = action
        
        # If we are currently in a short or long position and we are told to 
        # take an action we cannot take, put negative reward there and
        # update the actual action taken
        if self.position == 0 and action == 0: # long and BUY
            reward = -1
            action_taken = 2 # hold
        elif self.position == 1 and action == 1: # short and SELL
            reward = -1
            action_taken = 2 # hold
            
        # Compute portfolio value based on the actual action taken
        new_portfolio_value, new_cash_value = self.compute_portfolio_value(prices, index, action_taken)
              
        # Determine the new position 
        if self.position == 0 and action_taken == 1: # long and SELL
            self.position = 2
        elif self.position == 1 and action_taken == 0: # short and BUY
            self.position = 2
        elif self.position == 2 and action_taken == 0: # hold and BUY
            self.position = 0
        elif self.position == 2 and action_taken == 1: # hold and SELL
            self.position = 1
        elif action_taken == 2:                        # action is HOLD
            self.position = 2
                 
        # If we are in a position where we can execute the specified action
        # compute the reward based on portfolio value
        if reward != -1:
            reward = new_portfolio_value - self.portfolio_val
        
        self.portfolio_val = new_portfolio_value
        self.cash_value = new_cash_value
        
        return reward, action_taken
    #end def
    
    '''
    Input
       prices: numpy array of prices
       index:  index into prices array
       action: Which action to take (buy, sell, hold)
       
    Output
       New value of portfolio
       
    Note: This should only be called after validating that the action can be taken
          given the current position (long, short, etc.) of the trader
    '''
    def compute_portfolio_value(self, prices, index, action):
        port_val = self.portfolio_val
        cash_val = self.cash_value
        stock_price = prices[index]
        
        if action == 0:
            # Buy 100 shares
            cash_val = self.cash_value - 100*stock_price
            port_val = self.cash_value + 100*stock_price
        elif action == 1:
            # Sell 100 shares
            cash_val = self.cash_value + 100*stock_price
            port_val = self.cash_value - 100*stock_price
        elif action == 2:
            # Compute portfolio value based on change in stock price
            # This will depend on whether we are short or long
            # The cash value won't change, just the stock value
            if self.position == 0: # Long
               port_val = self.cash_value + 100*stock_price
            elif self.position == 1:
                port_val = self.cash_value - 100*stock_price
            #endif
        #endif
        
        return port_val, cash_val
    #end def

    '''
    Input: numpy array of adjusted close prices
    Output: numpy array with num rows = length(prices) x 3 columns
        column 1: 20 day Bollinger Band
        column 2: 5 day momentum
        column 3: 5 day volatility 
    '''
    def compute_features(self, prices):
        bb_val = self.compute_BB(prices[:,0])
        momentum = self.compute_momentum(prices[:,0])
        volatility = self.compute_volatility(prices[:,0])
        
        # Combine into one array
        features = np.array([ bb_val, momentum, volatility ])
        
        # Transpose so that one row corresponds to one day
        return np.transpose(features)
    # end def
    
    '''
    Compute BB value

    Returns a value that is (usually) between -1.0 and 1.0
    '''
    def compute_BB(self, prices, window_size = 5):
        sma = self.moving_average(prices, window_size)
            
        # Calculate standard deviation of SMA
        std_dev = self.standard_deviation(prices, window_size)
            
        bb_value = (prices - sma)/(2*std_dev)

        return bb_value
    #end compute_BB

    ''' Compute price momentum'''
    def compute_momentum(self, prices, N=5):
        momentum = np.zeros(prices.shape)
        
        for i in range(N, prices.shape[0]):
            momentum[i] = (prices[i]/prices[i-N]) - 1
        #end for
        
        # Fill data in backwards
        momentum[0:N] = momentum[N]
        
        return momentum
    #end compute_momentum

    ''' Compute volatility of price '''
    def compute_volatility(self, prices, window_size=5):
        return self.standard_deviation(prices, window_size)
    #end compute_volatility


    ''' Computes the moving average of data over the specified window '''
    def moving_average(self, data, window_size):
        output = np.zeros((data.shape[0]))

        for i in range(window_size-1, data.shape[0]):
            output[i] = data[i-window_size+1:i+1].mean()
        #end for
        
        # Fill data in backwards
        output[0:window_size-1] = output[window_size]
        return output
    #end moving_average

    ''' Computes standard deviation of data over the specified window''' 
    def standard_deviation(self, data, window_size):
        output = np.zeros( (data.shape[0]) )

        for i in range(window_size-1, data.shape[0]):
            output[i] = np.std( data[i-window_size+1:i+1], ddof=1 )
        #end for
        
        # Fill data in backwards
        output[0:window_size-1] = output[window_size]

        return output
    #end standard_deviation
    
    '''
    Input: numpy array from compute_features
    Output: row vector with states discretized as follows
        Bollinger Bands: -1.0 to +1.0 in 10 steps -   1's place
        Momentum:        -1.0 to +1.0 in 10 steps -  10's place
        volatility:      -1.0 to +1.0 in 10 steps - 100's place 
        
    Note: because I can't guarantee the data is between -1.0 and +1.0, the
    ranges above are actually a bit wider. For values below -1.0 results in a 
    state value of 0 and values above +1.0 translate to 9
    
    There is one piece of state information that cannot be computed here - the
    position of the trader (long, short, nothing). This will be added later
    '''
    def discretize_features(self, features):
        num_days = features.shape[0]
        states = np.zeros(num_days)
        # For each day (row)
        for i in range(0,num_days):
            # discretize BB value
            bb = self.discretize_feature(features[i,0])
            
            # discretize momentum
            p = self.discretize_feature(features[i,1])
            
            # discretize volatility
            v = self.discretize_feature(features[i,2])
            
            states[i] = v*100 + p*10 + bb
        #end for
        
        return states
    #end def

    def discretize_feature(self, feature_val):
        discrete_val = 0
        
        if feature_val <= -1.0:
            discrete_val = 0
        elif feature_val <= -0.75 and feature_val > -1.0:
            discrete_val = 1
        elif feature_val <= -0.5 and feature_val > -0.75:
            discrete_val = 2
        elif feature_val <= -0.25 and feature_val > -0.5:
            discrete_val = 3
        elif feature_val <= 0.0 and feature_val > -0.25:
            discrete_val = 4
        elif feature_val <= 0.25 and feature_val > 0.0:
            discrete_val = 5
        elif feature_val <= 0.5 and feature_val > 0.25:
            discrete_val = 6
        elif feature_val <= 0.75 and feature_val > 0.5:
            discrete_val = 7
        elif feature_val <= 1.0 and feature_val > 0.75:
            discrete_val = 8
        elif feature_val > 1.0:
            discrete_val = 9
            
        return discrete_val
    #end def



if __name__=="__main__":
    print "One does not simply think up a strategy"
