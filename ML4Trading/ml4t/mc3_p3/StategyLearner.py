import numpy as np
import pandas as pd
import datetime as dt
from marketsim import compute_portvals
from util import get_portfolio_stats, get_data
from analysis import assess_portfolio
import matplotlib.pyplot as plt
import os
import csv


class StratgeyLearner(object):

    def __init__(self, verbose=False):
        # Create new instance of Q learner 
    
    #end def

    def addEvidence(self, \
                    symbol="IBM", \
                    sd = dt.datetime(2008,1,1), \
                    ed = dt.datetime(2009, 1, 1), \
                    sv = 10000):
                    
    #end def
    
    
    
    def testPolicy(self, \
                    sd = dt.datetime(2009,1,1),
                    ed = dt.datetime(2010,1,1),
                    sv = 10000):
                    
    #end def



if __name__ == "__main__":