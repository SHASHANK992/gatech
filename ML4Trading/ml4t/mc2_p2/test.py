import pandas as pd
import numpy as np
import datetime as dt
from bollinger_strategy import process_Bollinger_Bands
from my_strategy import process_my_strategy
from marketsim import compute_portvals
from util import get_portfolio_stats, get_data
from analysis import assess_portfolio



if __name__ == "__main__":
    
    start_date = dt.datetime(2007, 12, 31)
    end_date   = dt.datetime(2009, 12, 31)
    '''
    print
    print 'Testing Bollinger Bands'
    print

    # Generates plot showing Bollinger Bands
    # and generates order file
    process_Bollinger_Bands()
    # Simulate orders
    # Get daily value of portfolio
    portvals = compute_portvals("./orders/BBorders.csv", start_val=10000)
    pv_array = portvals.values

    # Compare portfolio to SPY
    bb_cum_ret, bb_avg_daily_ret, bb_std_daily_ret, bb_sharpe_ratio = assess_portfolio(pv_array[:,0], start_date, end_date, gen_plot=True)
    
    print
    print 'Testing of Bollinger Bands complete'
    print 
    '''

    print
    print 'Testing Personal strategy'
    print

    # Generate plot of strategy showing entry and exit points 
    # Generate order file

    # Run order file through market simulate
    # Get daily value of portfolio

    # Compare strategy to SPY

    print
    print 'Testing of Personal strategy complete'
    print