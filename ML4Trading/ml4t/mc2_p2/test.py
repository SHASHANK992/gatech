import pandas as pd
import numpy as np
from bollinger_strategy import process_Bollinger_Bands
from marketsim import compute_portvals
from util import get_portfolio_stats



if __name__ == "__main__":
    
    print
    print 'Testing Bollinger Bands'
    print

    # Generates plot showing Bollinger Bands
    # and generates order file
    process_Bollinger_Bands()
    # Simulate order
    portvals = compute_portvals("./orders/BBorders.csv", start_val=10000)
    print portvals
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

    print
    print 'Testing of Bollinger Bands complete'
    print 