import numpy as np

class KNNLearner(object):

    def __init__(self, k):
        self.k = k
        
    def addEvidence(self,dataX,dataY):
        """ 
        From the example provided by the instructor, I don't think
        that this function accumulates data. It is called once and the
        training is complete. If this is called again, the previous training
        is forgotten
        
        This is pretty easy to implement
        """
        # Training is as easy as saving the data points for 
        # querying later
        self.Xdata = dataX
        self.Ydata = dataY
        
    def query(self,points):
        """ TO DO """
        # Array to store output
        Yout = np.zeros(points.shape[0])
        # For each query point
        for i in range(0,points.shape[0]):
            # Store distance with index distance corresponds to
            dtype = [('idx', int), ('dist', float)]
            distance = np.zeros((self.Xdata.shape[0]), dtype=dtype)
            
            for j in range(0,self.Xdata.shape[0]):
                distance[j] = ( j, np.linalg.norm(points[i,:] - self.Xdata[j,:]) )
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