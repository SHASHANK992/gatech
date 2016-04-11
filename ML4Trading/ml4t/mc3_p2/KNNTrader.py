import numpy as np
import pandas as pd
import KNNLearner as knn
import datetime as dt
from marketsim import compute_portvals
from util import get_portfolio_stats, get_data
from analysis import assess_portfolio
import matplotlib.pyplot as plt
import os
import csv

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
    momentum[0:N] = momentum[N]
    
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
    prices_Nday = np.copy(prices)
    
    np.roll(prices_Nday, N)
    prices_Nday = prices_Nday[N:]
    
    return ((prices_Nday/prices[:-N]) - 1.0)
#end def

'''Plots data. Returns handle to plot'''
def plot_data(df, title="Stock prices", xlabel="Date", ylabel="Prices"):
    
    ax = df.plot()
    ax.set_xlabel(xlabel)
    ax.set_ylabel(ylabel)
    
    return ax
#end plot_data


'''Adds vertical lines to specified plot'''
def add_orders_to_plot(plot_handle, orders, syms, min=60, max=130):
    '''
    Since I can only have one order outstanding at a time, I am going to assume
    the incoming data is correct. That means that every other order should be
    an exit. 
    '''
    long = False
    short = False
    color = 'k' #black
    for i in range(0,orders.shape[0]):
        current_date = orders.index[i]
        current_order = orders.iloc[i][syms[0]]

        # Determine what position (short, long) we are in and set the color
        # If we are in neither a long nor a short position
        if (not long) and (not short):
            # If a sell order comes in, we are short
            if current_order < 0:
                color = 'r' #red
                short = True
            # If a buy order comes in, we are long
            elif current_order > 0:
                color = 'g' #green
                long = True
            #endif
        # Every other order will be an exit, so just set color to black
        elif long or short:
            color = 'k'
            long = short = False
        #end if

        plot_handle.plot([current_date, current_date], [min, max], color) 
    #end for
#end add_orders_to_plot


'''
Runs strategy using KNN learner
'''
def process_KNN_strategy(syms, sd, ed, learner, percent_changed=0.01):
    # Get the price data
    prices_dates = pd.date_range(sd, ed)
    prices_all = get_data(syms, prices_dates) # Includes SPY
    prices_SPY = prices_all['SPY']
    prices = prices_all[syms] 
    prices_orig = prices.copy()
    
    # Plot data frame
    plot_handle = plot_data(prices)
    
    #****************************
    # Generate orders
    #****************************
    pvals = prices.values
    price_min = pvals.min()
    price_max = pvals.max()
    orders = prices.copy()
    orders[syms] = np.NaN
    
    # parse data
    long_active = False
    short_active = False
    entry_idx = 0
    # Compute technical indicators iteratively
    for i in range(20, pvals.shape[0]):
        # Compute BB over last 20 days
        avg_20days = pvals[i-20:i].mean()
        std_dev_20days = np.std(pvals[i-20:i], ddof=1)
        bb_val = (pvals[i]-avg_20days)/(2*std_dev_20days)
        
        # Compute momentum over the last 5 days
        momentum_5day = (pvals[i]/pvals[i-5])-1
        
        # Compute volatility over the last 5 days
        volatility_5day = np.std(pvals[i-5:i], ddof=1)
        
        # Use these indicators to query the learner
        Xquery = np.array([ [bb_val[0], momentum_5day[0], volatility_5day] ])
        Yquery = learner.query(Xquery)
        
        if not long_active and not short_active:
            # If Y value (5 day future return) is greater than percent changed, go long
            if Yquery >= percent_changed:
                orders.iloc[i][syms[0]] = 100
                long_active = True
                entry_idx = i
            # If Y value is less than percent changed, go short
            elif Yquery <= -1*percent_changed:
                orders.iloc[i][syms[0]] = -100
                short_active = True
                entry_idx = i
        elif long_active:
            # Sell 5 days later
            if i == entry_idx + 5:
                orders.iloc[i][syms[0]] = -100
                long_active = False        
        elif short_active:
            # Buy 5 days later
            if i == entry_idx + 5:
                orders.iloc[i][syms[0]] = 100
                short_active = False
        #end if
    # end for
    
    # Drop all the entries that don't have values
    orders.dropna(inplace=True)
    
    # Save orders to CSV file
    write_csv_file(orders, syms)
    
    # Add the orders to the plot
    add_orders_to_plot(plot_handle, orders, syms, min=price_min-10, max=price_max+10)
    
    plt.show()

#end def

def write_csv_file(orders, syms, filename='orders/MyOrders.csv'):
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
            if orders.iloc[i][syms[0]] <= 0:
                order_type = 'SELL'

            # This is all we need to know. The other data is constant
            orderswriter.writerow([current_dt] + [syms[0]] + [order_type] + ['100'])            
        #end for
    #end with
#end write_csv_file

def plot_price_and_samples(price, Ytrain, Ysample):

# end def


if __name__ == "__main__":
    start_date = dt.datetime(2007, 12, 31)
    end_date   = dt.datetime(2009, 12, 31)
    
    dates = pd.date_range(start_date, end_date)
    
    # Get price data
    syms = ["ML4T-220"]
    #syms = ["IBM"]
    prices = get_data(syms, dates, True)
    price_val = prices[syms].values
    
    # Get technical indicators
    bb_val = compute_BB(price_val[:,0])
    momentum = compute_momentum(price_val[:,0])
    volatility = compute_volatility(price_val[:,0])
    
    # Combine to create training inputs
    # Note, I may need to trim some data off here with
    # how I filled in gaps. 
    Xtrain = np.array([ bb_val[20:], momentum[20:], volatility[20:] ])
    #Xtrain = np.array([ bb_val, momentum, volatility ])
    Xtrain = np.transpose(Xtrain)
    Xtrain = Xtrain[:-5, :]
    
    # Get the training outputs
    Ytrain = compute_Nday_return(price_val[:,0], 5)
    Ytrain = Ytrain[20:]
    
    # I would expect to see 3 sine waves.  One of them is the original price data.  Another is your Y training data, which should be shifted back 5 days.  The last one should be your predicted Y data which should lie almost on top of the training data.          
    
    # Train the KNN Learner
    learner = knn.KNNLearner(k=3, verbose=False)
    learner.addEvidence(Xtrain, Ytrain)
    
    # For the sine wave, I need to construct an extra plot
    if ("ML4T-220" in syms):
        Ysample = learner.query(Xtrain)
    
    # Test on in sample
    process_KNN_strategy(syms, start_date, end_date, learner)
    
    compute_portvals("./orders/Myorders.csv", start_val=10000)
    
    # Test on out of sample
    
    start_date = dt.datetime(2009, 12, 31)
    end_date   = dt.datetime(2011, 12, 31)
    
    process_KNN_strategy(syms, start_date, end_date, learner)
    compute_portvals("./orders/Myorders.csv", start_val=10000, sd=start_date, ed=end_date)
    