"""Unit tests for MC2 Project 1"""

import pandas as pd
import numpy as np
import datetime as dt
import os
from util import get_data, plot_data
from marketsim import compute_portvals


def get_portfolio_stats(port_val):
    cum_ret = (port_val[-1]/port_val[0])-1
    
    daily_return = (port_val/np.roll(port_val,1))-1
    
    avg_daily_ret = np.mean(daily_return[1:])
    
    std_daily_ret = np.std(daily_return[1:], ddof=1)
    
    # Assume risk free rate = 0.0 and 252 trading dates per year
    k = np.sqrt(252.0)
    sharpe_ratio = k*(avg_daily_ret/std_daily_ret)
    
    return cum_ret, avg_daily_ret, std_daily_ret, sharpe_ratio
# get_portfolio_stats



def run_test(order_file, starting_value):
    # Process orders
    portvals = compute_portvals(orders_file = of, start_val = sv)
    
    if isinstance(portvals, pd.DataFrame):
        portvals = portvals[portvals.columns[0]] # just get the first column
    else:
        "warning, code did not return a DataFrame"
    
    # Get portfolio stats
    cum_ret, avg_daily_ret, std_daily_ret, sharpe_ratio = get_portfolio_stats(portvals)
    
    print "Cumulative return: ", cum_ret
    print "Avg. Daily return: ", avg_daily_ret
    print "Std dev daily return: ", std_daily_ret
    print "Sharpe ratio: ", sharpe_ratio
# End run_test


if __name__ == "__main__":
    '''
    print '********************************************'
    print 'Orders-short.csv'
    print '********************************************'
    of = "./orders/orders-short.csv"
    sv = 1000000
    
    run_test(of, sv)
    '''
   
    print
    print
    print '********************************************'
    print 'Orders.csv'
    print '********************************************'
    of = "./orders/orders.csv"
    sv = 1000000
    
    run_test(of, sv)
    
    