"""
Generate data set that is best for k nearest neighbors learner.
"""

import numpy as np
import LinRegLearner as lrl
import KNNLearner as knn
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D
import math

def generateData(N=1000):
    """
    For the KNN learner to perform better, we need to play to the 
    weaknesses of the linear regression learner. Use a polynomial
    function.
    
    I choose my polynomial function to be X1^2 + 2*X2 = Y
    
    Generate N data points 
    """
    dataX = np.zeros((N,2), dtype=float)
    dataY = np.zeros(N, dtype=float)
    
    X1 = 10*np.random.rand(N)
    X2 = 10*np.random.rand(N)
    dataX[:,0] = X1
    dataX[:,1] = X2
    
    dataY = X1**2 + 2*X2
    
    return dataX, dataY
#end def

if __name__ == "__main__":
    # Generate the data set
    print "Generating data..."
    dataX, dataY = generateData()
    
    # Generate training and testing sets
    train_rows = math.floor(0.6*dataX.shape[0])
    test_rows  = dataX.shape[0] - train_rows
    
    trainX = dataX[:train_rows,:]
    trainY = dataY[:train_rows]
    testX = dataX[train_rows:,:]
    testY = dataY[train_rows:]
    
    # Instantiate the learners
    LR_learner = lrl.LinRegLearner()
    KNN_learner = knn.KNNLearner(k=3)
        
    # Run training set through the learners
    print "Training learners..."
    LR_learner.addEvidence(trainX, trainY)
    KNN_learner.addEvidence(trainX, trainY)
    
    # Test both learners using the test data
    print "Testing learners..."
    LR_testY  = LR_learner.query(testX)
    KNN_testY = KNN_learner.query(testX)
    
    # Print statistics
    print
    print "For lin reg"
    rmse = math.sqrt(((testY - LR_testY) ** 2).sum()/testY.shape[0])
    print "Out of sample results"
    print "RMSE: ", rmse
    c = np.corrcoef(LR_testY, y=testY)
    print "corr: ", c[0,1]
    
    print
    print
    print "For KNN"
    rmse = math.sqrt(((testY - KNN_testY) ** 2).sum()/testY.shape[0])
    print "Out of sample results"
    print "RMSE: ", rmse
    c = np.corrcoef(KNN_testY, y=testY)
    print "corr: ", c[0,1]
    
    # Plot results
    fig = plt.figure()
    ax = fig.add_subplot(111,projection='3d')
    
    ax.scatter(testX[:,0], testX[:,1], testY, c='r')
    ax.scatter(testX[:,0], testX[:,1], LR_testY, c='b')
    #ax.scatter(testX[:,0], testX[:,1], KNN_testY, c='g')
    plt.show()