"""MC1-P1: Analyze a portfolio."""

import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
import datetime as dt
from util import get_data, plot_data

# This is the function that will be tested by the autograder
# The student must update this code to properly implement the functionality
def assess_portfolio( sd = dt.datetime(2008,1,1), ed = dt.datetime(2009,1,1), \
    syms = ['GOOG','AAPL','GLD','XOM'], \
    allocs=[0.1,0.2,0.3,0.4], \
    sv=1000000, rfr=0.0, sf=252.0, \
    gen_plot=False):

    # Read in adjusted closing prices for given symbols, date range
    dates = pd.date_range(sd, ed)
    prices_all = get_data(syms, dates)  # automatically adds SPY
    prices = prices_all[syms]  # only portfolio symbols
    prices_SPY = prices_all['SPY']  # only SPY, for comparison later
    prices_SPY_norm = prices_SPY/prices_SPY[0] # Normalized SPY data

    # Retrieve data as numpy array for easier processing
    values = prices.values
    # Get daily portfolio value
    # Normalize by first day
    values_norm = values/values[0,:]
    # Multiply by allocations
    values_weighted = values_norm * allocs
    # Multiply by starting value
    values_position = values_weighted * sv
    # Compute daily value by summing across the columns 
    daily_value = values_position.sum(axis=1)
    
    # Put daily values into a data frame
    # Add to existing data frame as new column
    prices['Daily Value'] = daily_value/daily_value[0]
    
    daily_return = (daily_value/np.roll(daily_value,1)) - 1
    daily_return[0] = 0
    
    # Average daily return
    adr = np.mean(daily_return[1:])
    # Cumulative return (final value / initial value)
    cr = (daily_value[-1]/daily_value[0])-1
    # Standard deviation of daily return
    sddr = np.std(daily_return[1:],ddof=1)
    # Sharp ratio
    k = np.sqrt(sf)
    sr = k*(np.mean(daily_return[1:]-rfr))/(np.std(daily_return[1:]-rfr, ddof=1))
    # Ending value
    ev = daily_value[-1]

    # Compare daily portfolio value with SPY using a normalized plot
    if gen_plot:
        # add code to plot here
        df_temp = pd.concat([ prices['Daily Value'], prices_SPY_norm], keys=['Portfolio', 'SPY'], axis=1)
        plot_data(df_temp)
        pass
    
    return cr, adr, sddr, sr, ev

def get_portfolio_value(prices, allocs):
    values = prices.values
    # Do I need to normalize?
    values_norm = values/values[0,:]
    
    values_weighted = values_norm*allocs
    
    daily_value = values_position.sum(axis=1)
    
    return daily_value
#end get_portfolio_value


def get_portfolio_stats(port_val):
    cum_ret = (port_val[-1]/port_val[0])-1
    
    avg_daily_ret = np.mean(port_val[1:])
    
    std_daily_ret = np.std(port_val[1:], ddof=1)
    
    # Assume risk free rate = 0.0 and 252 trading dates per year
    k = np.sqrt(252.0)
    sharpe_ratio = k*(avg_daily_ret/std_daily_ret)
     
    return cum_ret, avg_daily_ret, std_daily_ret, sharpe_ratio
#end get_portfolio_stats

def compute_SR(prices, alloc):
    daily_val = get_portfolio_value(prices, alloc)
    
    cr, adr, stddr, sr = get_portfolio_stats(daily_val)
    
    return sr
#end compute_SR