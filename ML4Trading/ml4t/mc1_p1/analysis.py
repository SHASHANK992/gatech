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
    
    # Cumulative return (final value / initial value)
    cr = (daily_value[-1]/daily_value[0])-1
    # Standard deviation of daily return
    sddr = np.std(daily_return[1:],ddof=1)
    # Ending value
    ev = daily_value[-1]
    
    # For these statistics, I need to factor in the period being used
    iter_value = np.ceil(252.0/sf)
    period_value = daily_value[0::iter_value]
    period_return = (period_value/np.roll(period_value,1)) - 1
    
    # Average period return
    apr = np.mean(period_return[1:])
    
    # Sharp ratio
    k = np.sqrt(sf)
    sr = k*(np.mean(period_return[1:]-rfr))/(np.std(period_return[1:]-rfr, ddof=1))

    # Compare daily portfolio value with SPY using a normalized plot
    if gen_plot:
        # add code to plot here
        df_temp = pd.concat([ prices['Daily Value'], prices_SPY_norm], keys=['Portfolio', 'SPY'], axis=1)
        plot_data(df_temp)
        pass
    
    return cr, apr, sddr, sr, ev



if __name__ == "__main__":
    # This code WILL NOT be tested by the auto grader
    # It is only here to help you set up and test your code

    # Define input parameters
    # Note that ALL of these values will be set to different values by
    # the autograder!
    
    #*****************************************************
    # Test 1
    #*****************************************************
    start_date = dt.datetime(2010,1,1)
    end_date = dt.datetime(2010,12,31)
    symbols = ['GOOG', 'AAPL', 'GLD', 'XOM']
    allocations = [0.2, 0.3, 0.4, 0.1]
    start_val = 1000000  
    risk_free_rate = 0.0
    sample_freq = 252

    # Assess the portfolio
    cr, adr, sddr, sr, ev = assess_portfolio(sd = start_date, ed = end_date,\
        syms = symbols, \
        allocs = allocations,\
        sv = start_val, \
        gen_plot = True)

    # Print statistics
    print "*****************************************"
    print "Test 1"
    print "*****************************************"
    print "Start Date:", start_date
    print "End Date:", end_date
    print "Symbols:", symbols
    print "Allocations:", allocations
    print "Sharpe Ratio:", sr
    print "Volatility (stdev of daily returns):", sddr
    print "Average Daily Return:", adr
    print "Cumulative Return:", cr
    
    
    #********************************************************
    # Test 2
    #*********************************************************
    start_date = dt.datetime(2010,1,1)
    end_date = dt.datetime(2010,12,31)
    symbols = ['AXP', 'HPQ', 'IBM', 'HNZ']
    allocations = [0.0, 0.0, 0.0, 1.0]
    start_val = 1000000  
    risk_free_rate = 0.0
    sample_freq = 252

    # Assess the portfolio
    cr, adr, sddr, sr, ev = assess_portfolio(sd = start_date, ed = end_date,\
        syms = symbols, \
        allocs = allocations,\
        sv = start_val, \
        gen_plot = True)

    # Print statistics
    print ""
    print ""
    print "*****************************************"
    print "Test 2"
    print "*****************************************"
    print "Start Date:", start_date
    print "End Date:", end_date
    print "Symbols:", symbols
    print "Allocations:", allocations
    print "Sharpe Ratio:", sr
    print "Volatility (stdev of daily returns):", sddr
    print "Average Daily Return:", adr
    print "Cumulative Return:", cr

    #********************************************************
    # Test 3
    #*********************************************************
    start_date = dt.datetime(2010,6,1)
    end_date = dt.datetime(2010,12,31)
    symbols = ['GOOG', 'AAPL', 'GLD', 'XOM']
    allocations = [0.2, 0.3, 0.4, 0.1]
    start_val = 1000000  
    risk_free_rate = 0.0
    sample_freq = 252

    # Assess the portfolio
    cr, adr, sddr, sr, ev = assess_portfolio(sd = start_date, ed = end_date,\
        syms = symbols, \
        allocs = allocations,\
        sv = start_val, \
        gen_plot = True)

    # Print statistics
    print ""
    print ""
    print "*****************************************"
    print "Test 3"
    print "*****************************************"
    print "Start Date:", start_date
    print "End Date:", end_date
    print "Symbols:", symbols
    print "Allocations:", allocations
    print "Sharpe Ratio:", sr
    print "Volatility (stdev of daily returns):", sddr
    print "Average Daily Return:", adr
    print "Cumulative Return:", cr
    
    
    
    #********************************************************
    # Test 4
    #*********************************************************
    start_date = dt.datetime(2010,1,1)
    end_date = dt.datetime(2010,12,31)
    symbols = ['GOOG', 'AAPL', 'GLD', 'XOM']
    allocations = [0.2, 0.2, 0.4, 0.2]
    start_val = 1000000  
    risk_free_rate = 0.0
    sample_freq = 252

    # Assess the portfolio
    cr, adr, sddr, sr, ev = assess_portfolio(sd = start_date, ed = end_date,\
        syms = symbols, \
        allocs = allocations,\
        sv = start_val, \
        gen_plot = True)

    # Print statistics
    print ""
    print ""
    print "*****************************************"
    print "Test 4"
    print "*****************************************"
    print "Start Date:", start_date
    print "End Date:", end_date
    print "Symbols:", symbols
    print "Allocations:", allocations
    print "Sharpe Ratio:", sr
    print "Volatility (stdev of daily returns):", sddr
    print "Average Daily Return:", adr
    print "Cumulative Return:", cr