import numpy as np
import KNNLearner as knn

class BagLearner(object):

    def __init__(self, learner = knn.KNNLearner, \
                 kwargs = {"k":3}, bags = 20, boost = False, verbose=False ):
        # Instantiate the learners
        self.learners = []
        self.bags = bags
        self.boost = boost
        for i in range(0,bags):
            self.learners.append(learner(**kwargs))
        #end for
		
		
    def addEvidence(self,Xtrain,Ytrain):
        """ 
        Each learner will be trained with Xtrain.shape[0]
        data points. However, we sample with replacement,
        so some data points will be repeated.
        """
        n = Xtrain.shape[0]
        
        # For each learner
        for i in range(0,self.bags):
            # Select n data points from Xtrain (with replacement)
            # Along with their corresponding Y values
            
            # Generate indices of n samples randomly
            indices = np.random.randint(n, size=n)
            
            # Sample data
            X = np.zeros(Xtrain.shape)
            Y = np.zeros(n)
            for j in range(0,n):
                X[j,:] = Xtrain[ indices[j], :]
                Y[j]   = Ytrain[ indices[j] ]
            #end for
            
            self.learners[i].addEvidence(X, Y)
        #end for
        
		
    def query(self,Xtest):
        """ 
        """
        Yout = np.zeros((Xtest.shape[0]))
        
        # For each learner
        for j in range(0,self.bags):
            # Get the output from that learner
            # Add to running sum
            Yout += self.learners[j].query(Xtest)
        #end for
        
        return Yout/self.bags       