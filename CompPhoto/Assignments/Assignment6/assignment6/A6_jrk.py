import numpy as np
import cv2

import assignment6

# Test expand function
'''
img_white = cv2.imread( 'images\source\sample\white.jpg', 0 )


img_white_reduced = assignment6.reduce(img_white)

cv2.imwrite( '.\images\image_white_reduced.png', img_white_reduced)

img_white_expanded = assignment6.expand( img_white_reduced)

#cv2.imwrite( '.\images\image_white_expanded.png', img_white_expanded)

myGauss = assignment6.gaussPyramid(img_white, 2)
#print "gauss ", len(myGauss)
#for pyr in myPyramid:
#	print pyr.shape

myLapl = assignment6.laplPyramid(myGauss)
#print "laplace ", len(myLapl)
'''

# Create a mask image to use with the image blender
img_white = cv2.imread( '.\images\source\submit\white.png', 0)

# Create array of zeros
mask = np.zeros( img_white.shape )
# Fill one half with 255
offset=8
mask[:, 0:((img_white.shape[1]/2)+offset) ] = 255*np.ones( (img_white.shape[0], (img_white.shape[1]/2)+offset) )
cv2.imwrite( '.\images\source\submit\mask.jpg', mask)




