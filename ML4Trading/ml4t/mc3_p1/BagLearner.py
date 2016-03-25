import numpy as np
import KNNLearner as knnl

class BagLearner(object):

    def __init__(self, learner, kwargs, bags, boost ):
        # Instantiate the learners
        self.learners = []
        self.bags = bags
        self.boost = boost
        for i in range(0,bags):
            self.learners.append(learner(**kwargs))
        #end for
		
		
    def addEvidence(self,dataX,dataY):
        """ 
        Each learner will be trained with dataX.shape[0]
        data points. However, we sample with replacement,
        so some data points will be repeated.
        """
        n = dataX.shape[0]
        
        # For each learner
        for i in range(0,self.bags):
            # Select n data points from dataX (with replacement)
            # Along with their corresponding Y values
            
            # Generate indices of n samples randomly
            indices = np.random.randint(n, size=n)
            
            # Sample data
            X = np.zeros(dataX.shape)
            Y = np.zeros(n)
            for j in range(0,n):
                X[j,:] = dataX[ indices[j], :]
                Y[j]   = dataY[ indices[j] ]
            #end for
            
            self.learners[i].addEvidence(X, Y)
        #end for
        
		
    def query(self,points):
        """ 
        """
        Yout = np.zeros((points.shape[0]))
        
        # For each learner
        for j in range(0,self.bags):
            # Get the output from that learner
            # Add to running sum
            Yout += self.learners[j].query(points)
        #end for
        
        return Yout/self.bags       