"""MC2-P1: Market simulator."""

import pandas as pd
import numpy as np
import datetime as dt
import os
from util import get_data, plot_data

def compute_portvals(orders_file = "./orders/orders.csv", start_val = 1000000):
    
    # 1 - Read orders file
    orders = pd.read_csv(orders_file, index_col='Date', parse_dates=True, na_values=['nan']) 
    orders.sort_index(axis=0, inplace=True)
    # Get start and end dates
    order_dates = orders.index.tolist()
    start_date = order_dates[0]
    end_date   = order_dates[-1]
    # Get list of stock symbols
    syms = orders.values[:,0]
    sym_set = set(syms)
    syms = list(sym_set)
    
    # 2 - Get adjusted close prices for relevant stocks
    price_dates = pd.date_range(start_date, end_date)
    prices_all = get_data(syms, price_dates)         # Adds SPY
    prices = prices_all[syms]                  # only portfolio symbols
    prices_SPY = prices_all['SPY']             # only SPY, for comparison later
    
    # 3 - Add column for cash
    price_values = prices.values              
    prices['Cash'] = np.ones((price_values.shape[0], 1), dtype=np.float)  # Add cash row
    
    # 4 - Data frame for trades
    #  Copy from prices and zero everything out
    trades = prices.copy()
    syms.append('Cash')
    trades[syms] = 0.0
    
    order_val = orders.values
    for i in range(0, len(order_dates)):
        order = order_val[i,:]
        
        # Parse symbol
        stock_sym = order[0]
        stock_price = prices.loc[order_dates[i]][stock_sym]
        # Parse quantity 
        volume = order[2]
        #Parse buy/sell
        if order[1] == 'BUY':
            multiplier = 1.0
        if order[1] == 'SELL':
            multiplier = -1.0
        
        # Add to trades file
        trades.loc[order_dates[i]][stock_sym] = multiplier*volume
        trades.loc[order_dates[i]]['Cash'] += -1*multiplier*volume*stock_price
    #end for    
    
    # 5 - Data frame for holdings
    holdings = trades.copy()
    holdings[syms] = 0.0
    # Initialize cash value
    holdings.loc[start_date]['Cash'] = start_val
    
    #!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
    # Left off here
    #!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    previous_row = holdings.iloc[0]    
    for i in range(0,price_values.shape[0]):
        if i > 0:
            # Take previous row
            previous_row = holdings.iloc[i-1]
        # Add the corresponding row from trades
        trade_row = trades.iloc[i]
        
        holdings.iloc[i] = previous_row + trade_row           
    #end for
    
    # 6 - Create new data from for daily values
    #     Holdings times prices
    daily_values = holdings.multiply(prices)
    
    print daily_values
    '''
    # 7 - Daily portfolio value is the sum of each row
    daily_values_array = daily_values.values
    daily_value = daily_values_array.sum(axis=1)   
    '''
    daily_value= 0
    return daily_value

def test_code():
    # this is a helper function you can use to test your code
    # note that during autograding his function will not be called.
    # Define input parameters

    of = "./orders/orders2.csv"
    sv = 1000000

    # Process orders
    portvals = compute_portvals(orders_file = of, start_val = sv)
    if isinstance(portvals, pd.DataFrame):
        portvals = portvals[portvals.columns[0]] # just get the first column
    else:
        "warning, code did not return a DataFrame"
    
    # Get portfolio stats
    # Here we just fake the data. you should use your code from previous assignments.
    start_date = dt.datetime(2008,1,1)
    end_date = dt.datetime(2008,6,1)
    cum_ret, avg_daily_ret, std_daily_ret, sharpe_ratio = [0.2,0.01,0.02,1.5]
    cum_ret_SPY, avg_daily_ret_SPY, std_daily_ret_SPY, sharpe_ratio_SPY = [0.2,0.01,0.02,1.5]

    # Compare portfolio against $SPX
    print "Date Range: {} to {}".format(start_date, end_date)
    print
    print "Sharpe Ratio of Fund: {}".format(sharpe_ratio)
    print "Sharpe Ratio of SPY : {}".format(sharpe_ratio_SPY)
    print
    print "Cumulative Return of Fund: {}".format(cum_ret)
    print "Cumulative Return of SPY : {}".format(cum_ret_SPY)
    print
    print "Standard Deviation of Fund: {}".format(std_daily_ret)
    print "Standard Deviation of SPY : {}".format(std_daily_ret_SPY)
    print
    print "Average Daily Return of Fund: {}".format(avg_daily_ret)
    print "Average Daily Return of SPY : {}".format(avg_daily_ret_SPY)
    print
    print "Final Portfolio Value: {}".format(portvals[-1])

if __name__ == "__main__":
    #test_code()
    
    temp = compute_portvals(orders_file = "./orders/orders2.csv")
