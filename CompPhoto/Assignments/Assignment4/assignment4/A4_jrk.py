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


