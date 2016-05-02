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
    syms = ['$SPX']
    prices = get_data(syms, dates, False)
    prices.dropna(inplace=True)
    prices_SPX = prices['$SPX']  # only SPX, for comparison later
    prices_SPX_norm = prices_SPX/prices_SPX[0] # Normalized SPX data
    SPX_array = prices_SPX.values

    # Get portfolio stats
    cr, adr, sddr, sr = get_portfolio_stats(daily_value)
    SPX_cr, SPX_adr, SPX_sdr, SPX_sr = get_portfolio_stats(SPX_array)
    
    # Put daily values into a data frame
    # Add to existing data frame as new column
    prices['Daily Value'] = daily_value/daily_value[0]

    # Compare daily portfolio value with SPX using a normalized plot
    if gen_plot:
        # add code to plot here
        df_temp = pd.concat([ prices['Daily Value'], prices_SPX_norm], keys=['Portfolio', '$SPX'], axis=1)
        plot_data(df_temp)
        pass
    
    # Print out statistics
    print "Date Range: ", sd, " to ", ed
    print
    print "Sharpe ratio of Fund: ", sr
    print "Sharpe ratio of $SPX:  ", SPX_sr
    print
    print "Cumulative return of Fund: ", cr
    print "Cumulative return of $SPX:  ", SPX_cr
    print
    print "Std dev of Fund: ", sddr
    print "Std dev of $SPX:  ", SPX_sdr
    print
    print "Avg. Daily return of Fund: ", adr
    print "Avg. Daily return of $SPX:  ", SPX_adr
    
    return cr, adr, sddr, sr