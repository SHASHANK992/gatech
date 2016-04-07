import numpy as np
import pandas as pd
import KNNLearner as knn
import datetime as dt
from marketsim import compute_portvals
from util import get_portfolio_stats, get_data
from analysis import assess_portfolio

'''
Compute upper and lower Bollinger Bands

TODO: I will need to return a value for every element in the price
      array. This is currently being done, but I can't use NaN

Returns a value that is (usually) between -1.0 and 1.0
'''
def compute_BB(prices, window_size = 20):
    sma = moving_average(prices, window_size)
        
    # Calculate standard deviation of SMA
    std_dev = standard_deviation(prices, window_size)
        
    bb_value = (prices - sma)/(2*std_dev)

    return bb_value
#end compute_BB

''' Compute price momentum'''
def compute_momentum(prices, N=5):
    momentum = np.zeros(prices.shape)
    
    for i in range(N, prices.shape[0]):
        momentum[i] = (prices[i]/prices[i-N]) - 1
    #end for
    
    # Fill data in backwards
    momentum[0:N] = prices[N]
    
    return momentum
#end compute_momentum

''' Compute volatility of price '''
def compute_volatility(prices, window_size=5):
    return standard_deviation(prices, window_size)
#end compute_volatility


''' Computes the moving average of data over the specified window '''
def moving_average(data, window_size):
    output = np.zeros((data.shape[0]))

    for i in range(window_size-1, data.shape[0]):
        output[i] = data[i-window_size+1:i+1].mean()
    #end for
    
    # Fill data in backwards
    output[0:window_size-1] = output[window_size]
    return output
#end moving_average

''' Computes standard deviation of data over the specified window''' 
def standard_deviation(data, window_size):
    output = np.zeros( (data.shape[0]) )

    for i in range(window_size-1, data.shape[0]):
        output[i] = np.std( data[i-window_size+1:i+1], ddof=1 )
    #end for
    
    # Fill data in backwards
    output[0:window_size-1] = output[window_size]

    return output
#end standard_deviation


'''
Computes the return N days in the future 

prices is a row vector
N is an integer for how many days in the future to look

'''
def compute_Nday_return(prices, N):
    '''output = np.zeros(prices.shape[0]-N)
    
    for i in range(0, output.shape[0]):
        output[i] = (prices[i+N-1]/prices[i])-1
     '''   
    
    prices_Nday = np.roll(prices, N)
    prices_Nday = prices_Nday[N:]
    p_copy = np.copy(prices)[:prices.shape[0] - N ]
    
    return ((prices_Nday/p_copy) - 1.0)
#end def


'''
Runs strategy using KNN learner
'''
def process_KNN_strategy(syms, sd, ed, learner, percent_changed):
    # Get the price data
    prices_dates = pd.date_range(sd, ed)
    prices_all = get_data(syms, prices_dates) # Includes SPY
    prices_SPY = prices_all['SPY']
    prices = prices_all[syms] 
    prices_orig = prices.copy()
    
    #****************************
    # Generate orders
    #****************************
    pvals = prices.values
    
    # parse data
    long_active = False
    short_active = False
    # Compute technical indicators iteratively
    for i in range(20, pvals.shape[0]):
        # Compute BB over last 20 days
        
        # Compute momentum over the last 5 days
        
        # Compute volatility over the last 5 days
        
        # Use these indicators to query the learner
        
        
        # If the Y value (5 day future return) is greater than percent_changed, go long
        
        # If less than percent_changed, go short
    

#end def

def write_csv_file(orders, filename='orders/MyOrders.csv'):
    with open(filename, 'wb') as csvfile:
        orderswriter = csv.writer(csvfile, delimiter=',',
                                  quotechar='|', quoting=csv.QUOTE_MINIMAL)

        # Write header
        orderswriter.writerow(['Date'] + ['Symbol'] + ['Order'] + ['Shares'])
        
        # For each order, write to file
        for i in range(0,orders.shape[0]):
            # Get the date
            current_dt = str(orders.index[i])[0:10]
            
            # Get the order type
            order_type = 'BUY'
            if orders.iloc[i]['IBM'] <= 0:
                order_type = 'SELL'

            # This is all we need to know. The other data is constant
            orderswriter.writerow([current_dt] + ['IBM'] + [order_type] + ['100'])            
        #end for
    #end with
#end write_csv_file


if __name__ == "__main__":
    start_date = dt.datetime(2007, 12, 31)
    end_date   = dt.datetime(2009, 12, 31)
    
    dates = pd.date_range(start_date, end_date)
    
    # Get price data
    syms = ["IBM"]
    prices = get_data(syms, dates, True)
    price_val = prices[syms].values
    
    # Get technical indicators
    bb_val = compute_BB(price_val[:,0])
    momentum = compute_momentum(price_val[:,0])
    volatility = compute_volatility(price_val[:,0])
    
    # Combine to create training inputs
    # Note, I may need to trim some data off here with
    # how I filled in gaps. 
    Xtrain = np.array([ bb_val, momentum, volatility ])
    Xtrain = np.transpose(Xtrain)
    Xtrain = Xtrain[:-5, :]
    
    # Get the training outputs
    Ytrain = compute_Nday_return(price_val[:,0], 5)
    
    # Train the KNN Learner
    learner = knn.KNNLearner(k=3)
    learner.addEvidence(Xtrain, Ytrain)
    
    # Test on in sample
    
    
    
    # Test on out of sample
    start_date = dt.datetime(2009, 12, 31)
    end_date   = dt.datetime(2011, 12, 31)