import pandas as pd
import datetime as dt
import numpy as np
import os

'''
Compute the following for a given portfolio

1) Cumulative Return
2) Average daily return
3) Standard deviation of daily returns
4) Sharpe ratio for overal portfolio
5) End value of portfolio
'''


'''
Inputs:
    sd: A datetime object that represents the start date
    ed: A datetime object that represents the end date
    syms: A list of symbols that make up the portfolio (note that your code should support any symbol in the data directory)
    allocs: A list of allocations to the stocks, must sum to 1.0
    sv: Start value of the portfolio
    rfr: The risk free rate for the entire period
    sf: Sampling frequency per year
    gen_plot: If True, create a plot named plot.png

Outputs:
    cr: Cumulative return
    adr: Average daily return
    sddr: Standard deviation of daily return
    sr: Sharpe ratio
    ev: End value of portfolio
'''
def assess_portfolio( sd, ed, syms, allocs, sv, rfr=0.0, sf=252.0, gen_plot=False):
    dates = pd.date_range(sd, ed)
    
    # Create data frame with each of the stock symbols
    df = pd.DataFrame(index=dates)
    
    for sym in syms:
        # Make sure this path is ok
        sym_str = os.path.join('..', sym, '.txt')
        temp = pd.read_csv(sym_str, index_col="Date", parse_dates=True, na_values=['nan'])
        #temp = temp.dropna()
        df.join(temp)
    #end for        
    
    # Fill in missing data
    #   Fill forward
    #   Fill backward
    df.fillna(method='ffill', inplace=True)
    df.fillna(method='bfill', inplace=True)
    
    
    for sym in syms:
        # Retrieve the data from the data frame
        df_temp
        
    #end for
    
    
    # Now that we have complete data, we can compute the statistics
    cr = (df[-1]/df[0])-1
    dr = (df/df.shift(1))-1 # Daily return 
    adr = np.mean(dr) # Make sure this is one number. I might need to compute mean along two axes
    
    sddr = np.std(dr)
    
    
    return cr, adr, sddr, sr, ev
#end assess_portfolio
