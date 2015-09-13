import numpy as np
import cv2

from assignment4 import imageGradientX
from assignment4 import imageGradientY
from assignment4 import computeGradient

square = cv2.imread( 'test_images\white_square.png', 0)
square_Xdiff = imageGradientX(square)
square_Ydiff = imageGradientY(square)

cv2.imwrite( 'square_Xdiff.png', square_Xdiff)
cv2.imwrite( 'square_Ydiff.png', square_Ydiff)

butterfly = cv2.imread('test_image.jpg', 0)
# Sobel operators
kernel_x = np.array([ [ -1, 0, 1],
                      [ -2, 0, 2],
                      [ -1, 0, 1] ])
                       
kernel_y = np.array([ [-1, -2, -1],
                      [ 0,  0,  0], 
                      [1, 2, 1] ])

butterfly_x = computeGradient( butterfly, kernel_x )
butterfly_y = computeGradient( butterfly, kernel_y )

cv2.imwrite( 'butterfly_x.png', butterfly_x)
cv2.imwrite( 'butterfly_y.png', butterfly_y)

butterfly_xy = (butterfly_x/2) + (butterfly_y/2)
cv2.imwrite( 'butterfly_xy.png', butterfly_xy)

butterfly_xy[ butterfly_xy > 128 ] = 255
cv2.imwrite( 'butterfly_thresh.png', butterfly_xy)