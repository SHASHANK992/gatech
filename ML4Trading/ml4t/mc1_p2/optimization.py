"""MC1-P2: Optimize a portfolio."""

import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
import datetime as dt
import scipy.optimize as spo
from util import get_data, plot_data
from analysis import get_portfolio_value, get_portfolio_stats, compute_SR

# This is the function that will be tested by the autograder
# The student must update this code to properly implement the functionality
def optimize_portfolio(sd=dt.datetime(2008,1,1), ed=dt.datetime(2009,1,1), \
    syms=['GOOG','AAPL','GLD','XOM'], gen_plot=False):

    # Read in adjusted closing prices for given symbols, date range
    dates = pd.date_range(sd, ed)
    prices_all = get_data(syms, dates)  # automatically adds SPY
    prices = prices_all[syms]  # only portfolio symbols
    prices_SPY = prices_all['SPY']  # only SPY, for comparison later

    # find the allocations for the optimal portfolio
    # note that the values here ARE NOT meant to be correct for a test case
    allocs = find_optimal_allocations(prices) # add code here to find the allocations
    
    port_val = get_portfolio_value(prices, allocs)
    cr, adr, sddr, sr = get_portfolio_stats(port_val)

    # Compare daily portfolio value with SPY using a normalized plot
    if gen_plot:
        # add code to plot here
        df_temp = pd.concat([port_val, prices_SPY], keys=['Portfolio', 'SPY'], axis=1)
        pass

    return allocs, cr, adr, sddr, sr
    
def find_optimal_allocations(prices):

    cols = prices.values.shape[1]
    # Initial guess - all equally allocated
    X_guess = np.ones((cols),dtype=np.float)/cols
    
    # Construct bounds
    # Each stock has to have an allocation between 0.0 and 1.0
    # (Not sure if it needs to be a list or a tuple of tuples)
    b = []
    for i in range(cols):
        b.append( (0.0,1.0) )
    #end for
    
    # Construct constraints
    # The sum of all the allocations has to equal 1.0
    c = ({ 'type':'eq', 'fun': lambda inputs: 1.0 - np.sum(inputs) })
    
    # Minimize
    res = spo.optimize( compute_SR(prices,alloc), X_guess, method='SLSQP', bounds=b,constraints=c)
    
    return res.x

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

if __name__ == "__main__":
    # This code WILL NOT be tested by the auto grader
    # It is only here to help you set up and test your code

    # Define input parameters
    # Note that ALL of these values will be set to different values by
    # the autograder!

    start_date = dt.datetime(2009,1,1)
    end_date = dt.datetime(2010,1,1)
    symbols = ['GOOG', 'AAPL', 'GLD', 'XOM', 'IBM']

    # Assess the portfolio
    allocations, cr, adr, sddr, sr = optimize_portfolio(sd = start_date, ed = end_date,\
        syms = symbols, \
        gen_plot = False)

    # Print statistics
    print "Start Date:", start_date
    print "End Date:", end_date
    print "Symbols:", symbols
    print "Allocations:", allocations
    print "Sharpe Ratio:", sr
    print "Volatility (stdev of daily returns):", sddr
    print "Average Daily Return:", adr
    print "Cumulative Return:", cr
