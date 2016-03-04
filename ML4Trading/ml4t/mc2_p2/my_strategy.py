import pandas as pd
import numpy as np
import datetime as dt
import os
from util import get_data
import matplotlib.pyplot as plt
import csv


def process_my_strategy(syms=['IBM'], sd=dt.datetime(2007,12, 31), ed = dt.datetime(2009, 12, 31)):
    print "Not implemented"

    prices_dates = pd.date_range(sd, ed)
    prices_all = get_data(syms, prices_dates)
    prices_SPY = prices_all['SPY']
    prices = prices_all[syms] 
    prices_orig = prices.copy()

    # Plot data frame


    # Now we need to take this data and find where to make trades


    # Save orders off to a csv file


    # Add the orders to the plot


#end process_my_strategy