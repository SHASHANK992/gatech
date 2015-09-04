import numpy as np
import cv2

import os
from math import pi

'''H = np.array([ [0, 1, 10],
               [5, 6, 7],
               [ 20, 2, 4] ])
Q = 3

indices = H.ravel().argsort()[-Q:]
print indices
indices = (np.unravel_index(i,H.shape) for i in indices)
print indices
    
peaks = [ (H[i], i) for i in indices ]
print peaks
'''
'''
myArray = np.array([])
print myArray
myArray = np.append(myArray, [(5, 6, 7)])
print myArray
myArray = np.append(myArray, [(10,11,12)])
print myArray
'''
'''
myList = []
myList.append( [(1,2)] )
print myList
myList.append( [(3,4), (5,6)] )
print myList[1]
print len(myList[1])
'''

'''
myList = []
print len(myList)
myList.append( (1,2) )
myList.append( (3,4) )
print myList[0]
print len(myList[0])
'''

myArray = np.array([])
myArray = np.append( myArray, np.array([[1, 2]]) )
print myArray