# ASSIGNMENT 6
# Your Name

import numpy as np
import scipy as sp
import scipy.signal
import cv2

""" Assignment 6 - Blending

This file has a number of functions that you need to fill out in order to
complete the assignment. Please write the appropriate code, following the
instructions on which functions you may or may not use.

GENERAL RULES:
    1. DO NOT INCLUDE code that saves, shows, displays, writes the image that
    you are being passed in. Do that on your own if you need to save the images
    but the functions should NOT save the image to file. (This is a problem
    for us when grading because running 200 files results a lot of images being
    saved to file and opened in dialogs, which is not ideal). Thanks.

    2. DO NOT import any other libraries aside from the three libraries that we
    provide. You may not import anything else, you should be able to complete
    the assignment with the given libraries (and in most cases without them).

    3. DO NOT change the format of this file. Do not put functions into classes,
    or your own infrastructure. This makes grading very difficult for us. Please
    only write code in the allotted region.
"""

def generatingKernel(parameter):
  """ Return a 5x5 generating kernel based on an input parameter.

  Note: This function is provided for you, do not change it.

  Args:
    parameter (float): Range of value: [0, 1].

  Returns:
    numpy.ndarray: A 5x5 kernel.

  """
  kernel = np.array([0.25 - parameter / 2.0, 0.25, parameter,
                     0.25, 0.25 - parameter /2.0])
  return np.outer(kernel, kernel)

def reduce(image):
  """ Convolve the input image with a generating kernel of parameter of 0.4 and
  then reduce its width and height by two.

  Please consult the lectures and readme for a more in-depth discussion of how
  to tackle the reduce function.

  You can use any / all functions to convolve and reduce the image, although
  the lectures have recommended methods that we advise since there are a lot
  of pieces to this assignment that need to work 'just right'.

  Args:
    image (numpy.ndarray): a grayscale image of shape (r, c)

  Returns:
    output (numpy.ndarray): an image of shape (ceil(r/2), ceil(c/2))
      For instance, if the input is 5x7, the output will be 3x4.

  """
  # WRITE YOUR CODE HERE.
  r = image.shape[0]
  c = image.shape[1]
  reduced_img = np.zeros( (np.ceil(r/2.), np.ceil(c/2.)) )
  
  kernel = generatingKernel(0.4)
  # Convolve
  img_conv = sp.signal.convolve2d(image, kernel, 'same') 
  # Extract every other row and column
  reduced_img[:,:] = img_conv[::2,::2]
  
  return reduced_img
  # END OF FUNCTION.

def expand(image):
  """ Expand the image to double the size and then convolve it with a generating
  kernel with a parameter of 0.4.

  You should upsample the image, and then convolve it with a generating kernel
  of a = 0.4.

  Finally, multiply your output image by a factor of 4 in order to scale it
  back up. If you do not do this (and I recommend you try it out without that)
  you will see that your images darken as you apply the convolution. Please
  explain why this happens in your submission PDF.

  Please consult the lectures and readme for a more in-depth discussion of how
  to tackle the expand function.

  You can use any / all functions to convolve and reduce the image, although
  the lectures have recommended methods that we advise since there are a lot
  of pieces to this assignment that need to work 'just right'.

  Args:
    image (numpy.ndarray): a grayscale image of shape (r, c)

  Returns:
    output (numpy.ndarray): an image of shape (2*r, 2*c)
  """
  # WRITE YOUR CODE HERE.
  img_ex = np.zeros( ( 2*image.shape[0], 2*image.shape[1] ) )
  
  kernel = generatingKernel(0.4)
  
  # Copy original image to every other index of supersampled image
  img_ex[::2, ::2] = image[:,:]
  
  # Convolve
  img_ex_conv = sp.signal.convolve2d(img_ex, kernel, 'same')
  
  # Multiply
  img_ex = 4.0*img_ex_conv

  return img_ex
  # END OF FUNCTION.

def gaussPyramid(image, levels):
  """ Construct a pyramid from the image by reducing it by the number of levels
  passed in by the input.

  Note: You need to use your reduce function in this function to generate the
  output.

  Args:
    image (numpy.ndarray): A grayscale image of dimension (r,c) and dtype float.
    levels (uint8): A positive integer that specifies the number of reductions
                    you should do. So, if levels = 0, you should return a list
                    containing just the input image. If levels = 1, you should
                    do one reduction. len(output) = levels + 1

  Returns:
    output (list): A list of arrays of dtype np.float. The first element of the
                   list (output[0]) is layer 0 of the pyramid (the image
                   itself). output[1] is layer 1 of the pyramid (image reduced
                   once), etc. We have already included the original image in
                   the output array for you. The arrays are of type
                   numpy.ndarray.

  Consult the lecture and README for more details about Gaussian Pyramids.
  """
  output = [image]
  # WRITE YOUR CODE HERE.
  
  img_reduced = image
  
  # For each of the levels
  for i in range( levels ):
    # Reduce the image
    img_reduced = reduce(img_reduced)
    
    # Add reduced image to list
    output.append(img_reduced)

  return output
  # END OF FUNCTION.

def laplPyramid(gaussPyr):
  """ Construct a Laplacian pyramid from the Gaussian pyramid, of height levels.

  Note: You must use your expand function in this function to generate the
  output. The Gaussian Pyramid that is passed in is the output of your
  gaussPyramid function.

  Args:
    gaussPyr (list): A Gaussian Pyramid as returned by your gaussPyramid
                     function. It is a list of numpy.ndarray items.

  Returns:
    output (list): A Laplacian pyramid of the same size as gaussPyr. This
                   pyramid should be represented in the same way as guassPyr, 
                   as a list of arrays. Every element of the list now
                   corresponds to a layer of the Laplacian pyramid, containing
                   the difference between two layers of the Gaussian pyramid.

           output[k] = gauss_pyr[k] - expand(gauss_pyr[k + 1])

           Note: The last element of output should be identical to the last 
           layer of the input pyramid since it cannot be subtracted anymore.

  Note: Sometimes the size of the expanded image will be larger than the given
  layer. You should crop the expanded image to match in shape with the given
  layer.

  For example, if my layer is of size 5x7, reducing and expanding will result
  in an image of size 6x8. In this case, crop the expanded layer to 5x7.
  """
  output = []
  
  # WRITE YOUR CODE HERE.
  gaussPyr_len = len( gaussPyr )
  # The top layer will be the biggest
  curr_layer = gaussPyr[0]
  
  # For each layer in the pyramid
  for i in range(1,gaussPyr_len):
    # Retrieve the next layer
    next_layer = gaussPyr[i]
    # Expand next layer
    expanded = expand(next_layer)
    # Find the difference 
    # Crop expanded image to be the same size as the original layer
    diff =  curr_layer - expanded[0:curr_layer.shape[0], 0:curr_layer.shape[1]]  
    # Add to output
    output.append(diff)
    curr_layer = next_layer
  #end for
  
  # Add last layer to output
  output.append(curr_layer)

  return output
  # END OF FUNCTION.

def blend(laplPyrWhite, laplPyrBlack, gaussPyrMask):
  """ Blend the two Laplacian pyramids by weighting them according to the
  Gaussian mask.

  Args:
    laplPyrWhite (list): A Laplacian pyramid of one image, as constructed by
                         your laplPyramid function.

    laplPyrBlack (list): A Laplacian pyramid of another image, as constructed by
                         your laplPyramid function.

    gaussPyrMask (list): A Gaussian pyramid of the mask. Each value is in the
                         range of [0, 1].

  The pyramids will have the same number of levels. Furthermore, each layer
  is guaranteed to have the same shape as previous levels.

  You should return a Laplacian pyramid that is of the same dimensions as the 
  input pyramids. Every layer should be an alpha blend of the corresponding
  layers of the input pyramids, weighted by the Gaussian mask. This means the
  following computation for each layer of the pyramid:
    output[i, j] = current_mask[i, j] * white_image[i, j] + 
                   (1 - current_mask[i, j]) * black_image[i, j]
  Therefore:
    Pixels where current_mask == 1 should be taken completely from the white
    image.
    Pixels where current_mask == 0 should be taken completely from the black
    image.

  Note: current_mask, white_image, and black_image are variables that refer to
  the image in the current layer we are looking at. You do this computation for
  every layer of the pyramid.
  """ 

  blended_pyr = []
  # WRITE YOUR CODE HERE.
  pyr_len = len(laplPyrWhite)
  
  for i in range(pyr_len):
    # Retrieve the current layer for the white and black images
    white_level = laplPyrWhite[i]
    black_level = laplPyrBlack[i]
    mask_level  = gaussPyrMask[i]
    
    output = np.zeros( white_level.shape )
    
    # For each pixel
    for y in range(white_level.shape[0]):
      for x in range(white_level.shape[1]):
         output[y,x] = mask_level[y,x]*white_level[y,x] + (1-mask_level[y,x])*black_level[y,x]
      #end for
    #end for
    blended_pyr.append(output)    
  #end for

  return blended_pyr
  # END OF FUNCTION.

def collapse(pyramid):
  """ Collapse an input pyramid.

  Args:
    pyramid (list): A list of numpy.ndarray images. You can assume the input is
                  taken from blend() or laplPyramid().

  Returns:
    output(numpy.ndarray): An image of the same shape as the base layer of the
                           pyramid and dtype float.

  Approach this problem as follows, start at the smallest layer of the pyramid.
  Expand the smallest layer, and add it to the second to smallest layer. Then,
  expand the second to smallest layer, and continue the process until you are
  at the largest image. This is your result.

  Note: sometimes expand will return an image that is larger than the next
  layer. In this case, you should crop the expanded image down to the size of
  the next layer. Look into numpy slicing / read our README to do this easily.

  For example, expanding a layer of size 3x4 will result in an image of size
  6x8. If the next layer is of size 5x7, crop the expanded image to size 5x7.
  """
  # WRITE YOUR CODE HERE.
  
  # Figure out what is the base layer
  # This is the beginning of the pyramid
  len_pyr = len(pyramid)

  collapsed_img = np.zeros( pyramid[0].shape )
  
  # Reverse the list to make things easier
  pyramid.reverse()
  # This starts at the beginning of the pyramid, i.e., the smallest layer
  img_sum = pyramid[0]
  
  for i in range(1, len_pyr):
    # Retrieve layer above
    next_level = pyramid[i]
    
    # Expand current sum, making sure to have the layer sizes agree
    expanded = expand(img_sum)[0:next_level.shape[0], 0:next_level.shape[1]]
    
    # Add expanded layer to next larger level
    img_sum = next_level + expanded
  #end for
    
  collapsed_img = img_sum
  
  return collapsed_img
  # END OF FUNCTION.