"""MC1-P1: Analyze a portfolio."""

import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
import datetime as dt
from util import get_data, plot_data, get_portfolio_stats

# This is the function that will be tested by the autograder
# The student must update this code to properly implement the functionality
def assess_portfolio( daily_value, sd = dt.datetime(2008,1,1), ed = dt.datetime(2009,1,1), \
    rfr=0.0, sf=252.0, gen_plot=False):

    # Read in adjusted closing prices for given symbols, date range
    dates = pd.date_range(sd, ed)
    syms = ['SPY']
    prices = get_data(syms, dates, False)
    prices_SPY = prices['SPY']  # only SPY, for comparison later
    prices_SPY_norm = prices_SPY/prices_SPY[0] # Normalized SPY data
    SPY_array = prices_SPY.values

    # Get portfolio stats
    cr, adr, sddr, sr = get_portfolio_stats(daily_value)
    SPY_cr, SPY_adr, SPY_sdr, SPY_sr = get_portfolio_stats(SPY_array)
    
    # Put daily values into a data frame
    # Add to existing data frame as new column
    prices['Daily Value'] = daily_value/daily_value[0]

    # Compare daily portfolio value with SPY using a normalized plot
    if gen_plot:
        # add code to plot here
        df_temp = pd.concat([ prices['Daily Value'], prices_SPY_norm], keys=['Portfolio', 'SPY'], axis=1)
        plot_data(df_temp)
        pass
    
    # Print out statistics
    print "Date Range: ", sd, " to ", ed
    print
    print "Sharpe ratio of Fund: ", sr
    print "Sharpe ratio of SPY:  ", SPY_sr
    print
    print "Cumulative return of Fund: ", cr
    print "Cumulative return of SPY:  ", SPY_cr
    print
    print "Std dev of Fund: ", sddr
    print "Std dev of SPY:  ", SPY_sdr
    print
    print "Avg. Daily return of Fund: ", adr
    print "Avg. Daily return of SPY:  ", SPY_adr
    
    return cr, adr, sddr, sr