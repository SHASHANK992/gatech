"""MC2-P1: Market simulator."""

import pandas as pd
import numpy as np
import datetime as dt
import os
from util import get_data, plot_data

def compute_portvals(orders_file = "./orders/orders.csv", start_val = 1000000, sd=dt.datetime(2007,12,31), ed=dt.datetime(2009,12,31)):
    
    # 1 - Read orders file
    orders = pd.read_csv(orders_file, index_col='Date', parse_dates=True, na_values=['nan']) 
    orders.sort_index(axis=0, inplace=True)
    # Get start and end dates
    order_dates = orders.index.tolist()
    start_date = sd
    end_date   = ed
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
        
        # TODO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1111
        # Make sure that the order date is a valid date
        
        # Add to trades file
        trades.loc[order_dates[i]][stock_sym] += multiplier*volume
        trades.loc[order_dates[i]]['Cash'] += -1*multiplier*volume*stock_price
    #end for   
    
    # 5 - Data frame for holdings
    holdings = trades.copy()
    holdings[syms] = 0.0
    # Initialize cash value
    holdings.loc[start_date]['Cash'] = start_val
    
    previous_row = holdings.iloc[0]   
    # For each row 
    for i in range(0,price_values.shape[0]):
        if i > 0:
            # Take previous row
            previous_row = holdings.iloc[i-1]
        # Add the corresponding row from trades
        trade_row = trades.iloc[i]
        # Put sum in holdings data frame
        holdings.iloc[i] = previous_row + trade_row           
    #end for
    
    # 6 - Create new data from for daily values
    #     Holdings times prices
    daily_values = holdings.multiply(prices)
    
    # 7 - Daily portfolio value is the sum of each row
    daily_value_sum = daily_values.sum(axis=1)   
    
    df_daily_value_sum = pd.DataFrame(daily_value_sum, columns=['Daily Value'])

    return df_daily_value_sum
