import numpy as np
import cv2

import assignment6

# Test expand function
img_white = cv2.imread( 'images\source\sample\white.jpg', 0 )


img_white_reduced = assignment6.reduce(img_white)

cv2.imwrite( '.\images\image_white_reduced.png', img_white_reduced)

img_white_expanded = assignment6.expand( img_white_reduced)

cv2.imwrite( '.\images\image_white_expanded.png', img_white_expanded)

myPyramid = assignment6.gaussPyramid(img_white, 2)
for pyr in myPyramid:
	print pyr

