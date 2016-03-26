"""
Test a learner.  (c) 2015 Tucker Balch
"""

import numpy as np
import math
import LinRegLearner as lrl
import KNNLearner as knnl
import BagLearner as bl

if __name__=="__main__":
    '''
    #**************************
    # Test of LinRegLearner
    #**************************
	inf = open('Data/ripple.csv')
    data = np.array([map(float,s.strip().split(',')) for s in inf.readlines()])

    # compute how much of the data is training and testing
    train_rows = math.floor(0.6* data.shape[0])
    test_rows = data.shape[0] - train_rows

    # separate out training and testing data
    trainX = data[:train_rows,0:-1]
    trainY = data[:train_rows,-1]
    testX = data[train_rows:,0:-1]
    testY = data[train_rows:,-1]

    # create a learner and train it
    learner = lrl.LinRegLearner() # create a LinRegLearner
    learner.addEvidence(trainX, trainY) # train it

    # evaluate in sample
    predY = learner.query(trainX) # get the predictions
    rmse = math.sqrt(((trainY - predY) ** 2).sum()/trainY.shape[0])
    print
    print "In sample results"
    print "RMSE: ", rmse
    c = np.corrcoef(predY, y=trainY)
    print "corr: ", c[0,1]

    # evaluate out of sample
    predY = learner.query(testX) # get the predictions
    rmse = math.sqrt(((testY - predY) ** 2).sum()/testY.shape[0])
    print
    print "Out of sample results"
    print "RMSE: ", rmse
    c = np.corrcoef(predY, y=testY)
    print "corr: ", c[0,1]
    '''
	
    '''
    #*******************************
    # Test of KNN learner (no bagging)
    #*******************************
    inf = open('Data/ripple.csv')
    data = np.array([map(float,s.strip().split(',')) for s in inf.readlines()])

    # compute how much of the data is training and testing
    train_rows = math.floor(0.6* data.shape[0])
    test_rows = data.shape[0] - train_rows

    # separate out training and testing data
    trainX = data[:train_rows,0:-1]
    trainY = data[:train_rows,-1]
    testX = data[train_rows:,0:-1]
    testY = data[train_rows:,-1]
    
    maxK = 20
    output = np.zeros((maxK, 4))
    
    for k in range(1,maxK+1):
        print
        print "***************************"
        print "  k = ", k
        print "***************************"
        # create a learner and train it
        learner = knnl.KNNLearner(k) # create a KNNLearner
        learner.addEvidence(trainX, trainY) # train it
        
        # evaluate in sample
        predY = learner.query(trainX) # get the predictions
        
        rmse = math.sqrt(((trainY - predY) ** 2).sum()/trainY.shape[0])
        print "In sample results"
        print "RMSE: ", rmse
        c = np.corrcoef(predY, y=trainY)
        print "corr: ", c[0,1]
        output[k-1,0] = rmse
        output[k-1,1] = c[0,1]
        
        # evaluate out of sample
        predY = learner.query(testX) # get the predictions
        rmse = math.sqrt(((testY - predY) ** 2).sum()/testY.shape[0])
        print
        print "Out of sample results"
        print "RMSE: ", rmse
        c = np.corrcoef(predY, y=testY)
        print "corr: ", c[0,1]
        output[k-1,2] = rmse
        output[k-1,3] = c[0,1]
    #end for
    
    np.savetxt("KNN.txt", output)
    '''
    
    
    #************************************
    # Test of KNN with bagging
    #************************************
    inf = open('Data/ripple.csv')
    data = np.array([map(float,s.strip().split(',')) for s in inf.readlines()])

    # compute how much of the data is training and testing
    train_rows = math.floor(0.6* data.shape[0])
    test_rows = data.shape[0] - train_rows

    # separate out training and testing data
    trainX = data[:train_rows,0:-1]
    trainY = data[:train_rows,-1]
    testX = data[train_rows:,0:-1]
    testY = data[train_rows:,-1]
    
    maxBags = 20
    maxK = 20
    output = np.zeros((maxBags*maxK, 6))
    
    idx = 0
    for k in range(1,maxK+1):
        for bags in range(1,maxBags+1):
            print
            print "***************************"
            print "  bags = ", bags
            print "  k    = ", k
            print "***************************"
            output[idx, 0] = k
            output[idx, 1] = bags
            
            # create a learner and train it
            kwargs = {"k":k}
            learner = bl.BagLearner(knnl.KNNLearner, kwargs, bags, boost = False ) # create a Bag of KNNLearners
            
            learner.addEvidence(trainX, trainY) # train it
            
            # evaluate in sample
            predY = learner.query(trainX) # get the predictions
            
            rmse = math.sqrt(((trainY - predY) ** 2).sum()/trainY.shape[0])
            print "In sample results"
            print "RMSE: ", rmse
            c = np.corrcoef(predY, y=trainY)
            print "corr: ", c[0,1]
            output[idx,2] = rmse
            output[idx,3] = c[0,1]
            
            # evaluate out of sample
            predY = learner.query(testX) # get the predictions
            rmse = math.sqrt(((testY - predY) ** 2).sum()/testY.shape[0])
            print
            print "Out of sample results"
            print "RMSE: ", rmse
            c = np.corrcoef(predY, y=testY)
            print "corr: ", c[0,1]
            output[idx,4] = rmse
            output[idx,5] = c[0,1]
            
            idx += 1
        #end for
    #end for
    
    np.savetxt("KNNBagging.txt", output)
    
