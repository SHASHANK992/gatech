import pandas as pd
import numpy as np
import datetime as dt
import os
from util import get_data
import matplotlib.pyplot as plt
import csv

# Modified stop loss
# Look for where stock has fallen x% 2 days in a row. Sell
# Look for where stock has risen x% 2 days in a row. Buy
def process_my_strategy(syms=['IBM'], sd=dt.datetime(2007,12, 31), ed = dt.datetime(2009, 12, 31), percent_change=0.025):
    
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
    price_max = pvals.max()
    price_min = pvals.min()
    orders = prices.copy()
    orders[syms] = np.NaN
    # Parse data
    long_active = False
    short_active = False
    for i in range(2, pvals.shape[0]):
        price_2DaysAgo = pvals[i-2]
        price_1DayAgo = pvals[i-1]
        price_today = pvals[i]

        # If we don't have any trades active right now, determine if we should make another one
        # I might want to keep track of the value when the position is entered and exit when
        # there is a certain percentage change from that value
        if not long_active and not short_active:
            # Sell
            if price_1DayAgo <= ((1-percent_change)*price_2DaysAgo):
                if price_today <= ((1-percent_change)*price_1DayAgo):
                    orders.iloc[i]['IBM'] = -100
                    short_active = True
            # Buy
            elif price_1DayAgo >= ((1+percent_change)*price_2DaysAgo):
                if price_today >= ((1+percent_change)*price_1DayAgo):
                    orders.iloc[i]['IBM'] = 100
                    long_active = True
        # If we are in a long position, need to know when to sell
        elif long_active:
            if price_1DayAgo <= ((1-percent_change)*price_2DaysAgo):
                if price_today <= ((1-percent_change)*price_1DayAgo):
                    orders.iloc[i]['IBM'] = -100
                    long_active = False
        # If short, we need to know when to buy
        elif short_active:
            if price_1DayAgo >= ((1+percent_change)*price_2DaysAgo):
                if price_today >= ((1+percent_change)*price_1DayAgo):
                    orders.iloc[i]['IBM'] = 100
                    short_active = False
    # end for
    
    # Drop all the entries that don't have values
    orders.dropna(inplace=True)

    # Save orders off to CSV file
    write_csv_file(orders)

    # Add the orders to the plot
    add_orders_to_plot(plot_handle, orders, min=price_min, max=price_max)

    plt.show()
#end process_my_strategy


def write_csv_file(orders, filename='orders\MyOrders.csv'):
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

'''Adds vertical lines to specified plot'''
def add_orders_to_plot(plot_handle, orders, min=60, max=130):
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
        current_order = orders.iloc[i]['IBM']

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


'''Plots data. Returns handle to plot'''
def plot_data(df, title="Stock prices", xlabel="Date", ylabel="Prices"):
    
    ax = df.plot()
    ax.set_xlabel(xlabel)
    ax.set_ylabel(ylabel)
    
    return ax
#end plot_data