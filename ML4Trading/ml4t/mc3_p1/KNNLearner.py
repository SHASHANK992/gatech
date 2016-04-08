import numpy as np

class KNNLearner(object):

    def __init__(self, k=3, verbose=False):
        self.k = k
        
    def addEvidence(self,Xtrain,Ytrain):
        """ 
        From the example provided by the instructor, I don't think
        that this function accumulates data. It is called once and the
        training is complete. If this is called again, the previous training
        is forgotten
        
        This is pretty easy to implement
        """
        # Training is as easy as saving the data points for 
        # querying later
        self.Xdata = Xtrain
        self.Ydata = Ytrain
        
    def query(self,Xtest):
        """ TO DO """
        # Array to store output
        Yout = np.zeros(Xtest.shape[0])
        # For each query point
        for i in range(0,Xtest.shape[0]):
            # Store distance with index distance corresponds to
            dtype = [('idx', int), ('dist', float)]
            distance = np.zeros((self.Xdata.shape[0]), dtype=dtype)
            
            for j in range(0,self.Xdata.shape[0]):
                if verbose:
                    print np.linalg.norm(Xtest[i,:] - self.Xdata[j,:])
                distance[j] = ( j, np.linalg.norm(Xtest[i,:] - self.Xdata[j,:]) )
            #end for
            
            # Sort distance data
            dist_sorted = np.sort(distance, order='dist')
                        
            # Pick the first k distance values
            k_dist = dist_sorted[0:self.k]
            
            sum = 0.0
            for n in range(0,self.k):
                sum += self.Ydata[ k_dist[n][0] ]
            #end for
            
            Yout[i] = sum/self.k            
        #end for
        
        return Yout