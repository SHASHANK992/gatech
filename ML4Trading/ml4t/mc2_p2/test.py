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
    
    print
    print 'Testing Bollinger Bands'
    print

    # Generates plot showing Bollinger Bands
    # and generates order file
    process_Bollinger_Bands()
    # Simulate orders
    # Get daily value of portfolio and compare to market
    compute_portvals("./orders/BBorders.csv", start_val=10000)
    
    print
    print 'Testing of Bollinger Bands complete'
    print 
    
    
    print
    print 'Testing Personal strategy over same time period as Bollinger Band'
    print

    # Generate plot of strategy showing entry and exit points 
    # Generate order file
    process_my_strategy()

    # Run order file through market simulate
    # Get daily value of portfolio and compare to market
    compute_portvals("./orders/MyOrders.csv", start_val=10000)

    print
    print 'Testing of Personal strategy complete'
    print
    

    
    print
    print 'Testing Personal strategy over different time period'
    print

    start_date = dt.datetime(2009, 12, 31)
    end_date   = dt.datetime(2011, 12, 31)

    # Generate plot of strategy showing entry and exit points 
    # Generate order file
    process_my_strategy(sd=start_date, ed=end_date, percent_change=0.005)

    # Run order file through market simulate
    # Get daily value of portfolio
    compute_portvals("./orders/MyOrders.csv", start_val=10000, sd=start_date, ed=end_date)
    
    print
    print 'Testing of Personal strategy complete'
    print
    
