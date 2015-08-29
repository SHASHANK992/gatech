import numpy as np
import cv2

import os
from math import pi

H = np.array([ [0, 1, 10],
               [5, 6, 7],
               [ 20, 2, 4] ])
Q = 3

indices = H.ravel().argsort()[-Q:]
print indices
indices = (np.unravel_index(i,H.shape) for i in indices)
print indices
    
peaks = [ (H[i], i) for i in indices ]
print peaks