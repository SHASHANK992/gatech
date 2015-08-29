import cv2
import numpy as np

from assignment2 import convertToBlackAndWhite
from assignment2 import averageTwoImages
from assignment2 import flipHorizontal

# open images
image1 = cv2.imread('test_image.jpg', cv2.IMREAD_GRAYSCALE)
image2 = cv2.imread('test_image_2.jpg', cv2.IMREAD_GRAYSCALE)

# Convert to black and white
imageBinary = convertToBlackAndWhite(image1)
cv2.imwrite('test_image_binary.jpg', imageBinary)

# Average the two images
imageCombine = averageTwoImages(image1, image2)
cv2.imwrite('test_image_combine.jpg', imageCombine)

# Flip image
image2Flip = flipHorizontal(image2)
cv2.imwrite('image2_flip.jpg', image2Flip)