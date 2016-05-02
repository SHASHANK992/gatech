import numpy as np
import pandas as pd
import datetime as dt
import StrategyLearner as sl


if __name__ == "__main__":
    
    learner = sl.StrategyLearner()
    
    learner.addEvidence()
    
    print learner.testPolicy()