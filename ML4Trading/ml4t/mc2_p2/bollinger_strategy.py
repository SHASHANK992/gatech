import pandas as pd
import numpy as np
import datetime as dt
import os
from util import get_data
import matplotlib.pyplot as plt
import csv

'''
Chart should include
- stock price
- simple moving average
- Upper Bollinger Band
- Lower Bollinger Band
- Long entries (buy 100 shares) as vertical green line at time of entry
- Long exits (sell 100 shares) as vertical black line at time of exit
- Short entries as vertical red line at time of entry
- Short exits as vertical black line at time of exit

Can only run 1 strategy at a time. For example, if we have already entered a long position (bought 100 shares),
we must wait until we exit (sell 100 shares) before we can take any other position
'''

# Using fixed start and end dates with only one stock (IBM)
# Dec 31, 2007 to Dec 31, 2009
def generate_plot(window_size=20, syms=['IBM'], sd=dt.datetime(2007,12, 31), ed = dt.datetime(2009, 12, 31)):
    
    prices_dates = pd.date_range(sd, ed)
    prices_all = get_data(syms, prices_dates)
    prices_SPY = prices_all['SPY']
    prices = prices_all[syms] 
    prices_orig = prices.copy()

    # Calculate 20 day simple moving average
    # Note that the method used will return a vector the same size as
    # the input vector. However, we are using a 20 day window, so the first
    # 20 entries are invalid
    prices_array = prices.values
    sma = moving_average(prices_array[:,0], window_size)
    sma[0:window_size-1] = np.nan

    # Calculate standard deviation of SMA
    std_dev = standard_deviation(prices_array[:,0], window_size)
    std_dev[0:window_size-1] = np.nan
    
    # Create upper and lower bands
    upper_band = sma + 2*std_dev
    lower_band = sma - 2*std_dev

    # Add data to data frame
    prices['SMA'] = sma
    prices['Upper Band'] = upper_band
    prices['Lower Band'] = lower_band

    # Plot data frame
    #plot_handle = plot_data(prices)

    # Now we need to take this data and find where to make trades
    orders = prices_orig.copy()
    orders[syms] = np.NaN
    generate_orders(prices, orders)

    # Get only the non-zero orders and save them off
    orders_compressed = orders.dropna()
    
    # Save this off to a csv file
    write_csv_file(orders_compressed)

    # Add the order to the plot


#end generate plot

def generate_orders(prices, orders, window_size=20, sym='IBM'):
    print "Not implemented yet"

    long_active = False
    short_active = False
    # For each row (date) in the prices file for which we have
    # data to compare 
    for i in range(window_size, prices.shape[0]):
        # Get stock price
        price_today = prices[sym][i]
        price_yester  = prices[sym][i-1]
        # Get the value of the upper and lower bands
        ub_today = prices['Upper Band'][i]
        lb_today = prices['Lower Band'][i]
        ub_yester = prices['Upper Band'][i-1]
        lb_yester = prices['Lower Band'][i-1]
        # Get simple moving average prices
        sma_today = prices['SMA'][i]
        sma_yester = prices['SMA'][i-1]

        # There are several different scenarios
        # 1) Stock price goes from below the lower band to above the lower band we have a long opportunity
        #    We should buy 100 shares
        if (not long_active) and (not short_active) and (price_yester < lb_yester) and (price_today >= lb_today):
            orders.iloc[i][sym] = 100.0
            long_active = True
        # 2) Stock price moves from above the upper band to below the upper band
        #    This signals the stock is over valued and is returning to mean. Short the stock
        elif (not long_active) and (not short_active) and (price_yester > ub_yester) and (price_today <= ub_today):
            orders.iloc[i][sym] = -100.0
            short_active = True
        # These two cases handle if a trade is active, when we should exit
        # If we are in a long position, sell the stock when the price moves from below the SMA to above the SMA
        elif (long_active) and (price_yester < sma_yester) and (price_today >= sma_today):
            orders.iloc[i][sym] = -100.0
            long_active = False
        # If we are in a short position, buy the stock when the price moves from above SMA to below it
        elif (short_active) and (price_yester > sma_yester) and (price_today <= sma_today):
            orders.iloc[i][sym] = 100.0
            short_active = False
        #end if
        
    #end for
    # orders should be pass by reference, so I shouldn't need to return anything here

#end generate_orders

def write_csv_file(orders, filename='orders.csv'):
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

            # This is all we need to know
            orderswriter.writerow([current_dt] + ['IBM'] + [order_type] + ['100'])            
        #end for

#end write_csv_file


''' Computes the moving average of data over the specified window '''
def moving_average(data, window_size):
    output = np.zeros((data.shape[0]))

    for i in range(window_size-1, data.shape[0]):
        output[i] = data[i-window_size+1:i+1].mean()
    #end for
    return output
#end moving_average

''' Computes standard deviation of data over the specified window''' 
def standard_deviation(data, window_size):
    output = np.zeros( (data.shape[0]) )

    for i in range(window_size-1, data.shape[0]):
        output[i] = np.std( data[i-window_size+1:i+1], ddof=1 )
    #end for

    return output
#end standard_deviation

def plot_data(df, title="Stock prices", xlabel="Date", ylabel="Prices"):
    #ax = df.plot(title=title, fontsize=12)
    ax = df.plot()
    ax.set_xlabel(xlabel)
    ax.set_ylabel(ylabel)
    
    return ax
#end plot_data
