# ASSIGNMENT 8
# Your Name

import numpy as np
import scipy as sp
import scipy.signal
import cv2
from scipy.stats import norm
from scipy.signal import convolve2d
import math

# Import ORB as SIFT to avoid confusion.
try:
    from cv2 import ORB as SIFT
except ImportError:
    try:
        from cv2 import SIFT
    except ImportError:
        try:
            SIFT = cv2.ORB_create
        except:
            raise AttributeError("Your OpenCV(%s) doesn't have SIFT / ORB."
                                 % cv2.__version__)


""" Assignment 8 - Panoramas

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

def getImageCorners(image):
    """ For an input image, return its four corners.

    You should be able to do this correctly without instruction. If in doubt,
    resort to the testing framework. The order in which you store the corners
    does not matter.

    Note: The reasoning for the shape of the array can be explained if you look
    at the documentation for cv2.perspectiveTransform which we will use on the
    output of this function. Since we will apply the homography to the corners
    of the image, it needs to be in that format.

    Another note: When storing your corners, they are assumed to be in the form
    (X, Y) -- keep this in mind and make SURE you get it right.

    Args:
        image (numpy.ndarray): Input can be a grayscale or color image.

    Returns:
        corners (numpy.ndarray): Array of shape (4, 1, 2). Type of values in the
                                 array is np.float32.
    """
    corners = np.zeros((4, 1, 2), dtype=np.float32)
    # WRITE YOUR CODE HERE
    corners[ 0, 0, :] = np.array([ [0, 0] ])
    corners[ 1, 0, :] = np.array([ [ image.shape[1], 0 ] ])
    corners[ 2, 0, :] = np.array([ [ 0, image.shape[0] ] ])
    corners[ 3, 0, :] = np.array([ [ image.shape[1], image.shape[0] ] ])

    return corners
    # END OF FUNCTION

def findMatchesBetweenImages(image_1, image_2, num_matches):
    """ Return the top list of matches between two input images.

    Note: You will not be graded for this function. This function is almost
    identical to the function in Assignment 7 (we just parametrized the number
    of matches). We expect you to use the function you wrote in A7 here. We will
    also release a solution for how to do this after A7 submission has closed.

    If your code from A7 was wrong, don't worry, you will not lose points in
    this assignment because your A7 code was wrong (hence why we will provide a
    solution for you after A7 closes).

    This function detects and computes SIFT (or ORB) from the input images, and
    returns the best matches using the normalized Hamming Distance through brute
    force matching.

    Args:
        image_1 (numpy.ndarray): The first image (grayscale).
        image_2 (numpy.ndarray): The second image. (grayscale).
        num_matches (int): The number of desired matches. If there are not
                           enough, return as many matches as you can.

    Returns:
        image_1_kp (list): The image_1 keypoints, the elements are of type
                           cv2.KeyPoint.
        image_2_kp (list): The image_2 keypoints, the elements are of type 
                           cv2.KeyPoint.
        matches (list): A list of matches, length 'num_matches'. Each item in 
                        the list is of type cv2.DMatch. If there are less 
                        matches than num_matches, this function will return as
                        many as it can.

    """
    # matches - type: list of cv2.DMath
    matches = None
    # image_1_kp - type: list of cv2.KeyPoint items.
    image_1_kp = None
    # image_1_desc - type: numpy.ndarray of numpy.uint8 values.
    image_1_desc = None
    # image_2_kp - type: list of cv2.KeyPoint items.
    image_2_kp = None
    # image_2_desc - type: numpy.ndarray of numpy.uint8 values.
    image_2_desc = None

    # COPY YOUR CODE FROM A7 HERE.
    # Using SIFT was causing problems, so use ORB instead
    sift = cv2.ORB()
    
    # Use SIFT to generate keypoints and descriptors
    image_1_kp, image_1_desc = sift.detectAndCompute( image_1, None )
    image_2_kp, image_2_desc = sift.detectAndCompute( image_2, None )
    
    # Use BFM
    bfm = cv2.BFMatcher( cv2.NORM_HAMMING, crossCheck=True) 
    
    matches_all = bfm.match( image_1_desc, image_2_desc )
    
    # Sort matches
    matches_all = sorted( matches_all, key = lambda x:x.distance)
    
    matches = matches_all[:num_matches]

    return image_1_kp, image_2_kp, matches
  # END OF FUNCTION.

def findHomography(image_1_kp, image_2_kp, matches):
    """ Returns the homography between the keypoints of image 1, image 2, and
        its matches.

    Follow these steps:
        1. Iterate through matches and:
            1a. Get the x, y location of the keypoint for each match. Look up
                the documentation for cv2.DMatch. Image 1 is your query image,
                and Image 2 is your train image. Therefore, to find the correct
                x, y location, you index into image_1_kp using match.queryIdx,
                and index into image_2_kp using match.trainIdx. The x, y point
                is stored in each keypoint (look up documentation).
            1b. Set the keypoint 'pt' to image_1_points and image_2_points, it
                should look similar to this inside your loop:
                    image_1_points[match_idx] = image_1_kp[match.queryIdx].pt
                    # Do the same for image_2 points.

        2. Call cv2.findHomography and pass in image_1_points, image_2_points,
           use method=cv2.RANSAC and ransacReprojThreshold=5.0. I recommend
           you look up the documentation on cv2.findHomography to better
           understand what these parameters mean.
        3. cv2.findHomography returns two values, the homography and a mask.
           Ignore the mask, and simply return the homography.

    Args:
        image_1_kp (list): The image_1 keypoints, the elements are of type
                           cv2.KeyPoint.
        image_2_kp (list): The image_2 keypoints, the elements are of type 
                           cv2.KeyPoint.
        matches (list): A list of matches. Each item in the list is of type
                        cv2.DMatch.
    Returns:
        homography (numpy.ndarray): A 3x3 homography matrix. Each item in
                                    the matrix is of type numpy.float64.
    """
    image_1_points = np.zeros((len(matches), 1, 2), dtype=np.float32)
    image_2_points = np.zeros((len(matches), 1, 2), dtype=np.float32)

    # WRITE YOUR CODE HERE.
    # Find matching point values
    matchIdx = 0
    for match in matches:
        image_1_points[matchIdx] = image_1_kp[match.queryIdx].pt
        image_2_points[matchIdx] = image_2_kp[match.trainIdx].pt
                
        matchIdx += 1
    #end for
    
    # Compute homography
    H, mask = cv2.findHomography( image_1_points, image_2_points, method=cv2.RANSAC, ransacReprojThreshold=5.0)
        
    # Replace this return statement with the homography.
    return H
    # END OF FUNCTION

def blendImagePair(warped_image, image_2, point):
    """ This is the blending function. We provide a basic implementation of
    this function that we would like you to replace.

    This function takes in an image that has been warped and an image that needs
    to be inserted into the warped image. Lastly, it takes in a point where the
    new image will be inserted.

    The current method we provide is very simple, it pastes in the image at the
    point. We want you to replace this and blend between the images.

    We want you to be creative. The most common implementation would be to take
    the average between image 1 and image 2 only for the pixels that overlap.
    That is just a starting point / suggestion but you are encouraged to use
    other approaches.

    Args:
        warped_image (numpy.ndarray): The image provided by cv2.warpPerspective.
        image_2 (numpy.ndarray): The image to insert into the warped image.
        point (numpy.ndarray): The point (x, y) to insert the image at.

    Returns:
        image: The warped image with image_2 blended into it.
    """
    output_image = np.copy(warped_image)

    # REPLACE THIS WITH YOUR BLENDING CODE.
    '''
    #Instructor provided
    output_image[point[1]:point[1] + image_2.shape[0],
                 point[0]:point[0] + image_2.shape[1]] = image_2
    '''
    '''
    # Find the points along the intersection of the two images
    intersect_l = warped_image[point[1]:point[1]+image_2.shape[0], point[0]]
    intersect_r = image_2[:,0]
    
    intersect = 0.5*intersect_l + 0.5*intersect_r
    
    output_image[point[1]:point[1] + image_2.shape[0], point[0]] = intersect
    output_image[point[1]:point[1]+image_2.shape[0], point[0]+1:point[0]+image_2.shape[1]] = image_2[:,1:]

    # I would like to blend the area around where the two images meet here using the code from a previous assignment,
    # but the instructions says we aren't allowed to put code in anywhere other than the marked places. 
    
    print output_image.shape
    '''
    # Find the points along the intersection of the two images
    blend_region = 100
    intersect_l = warped_image[point[1]:point[1]+image_2.shape[0], point[0]-blend_region:point[0]+blend_region]
    # We need to make image_2 overlap with the warped image. Take a portion of the warped image as image 2
    intersect_r = np.zeros( (image_2.shape[0], 2*blend_region, 3) )
    intersect_r[:,0:blend_region] = warped_image[point[1]:point[1]+image_2.shape[0], point[0]-blend_region:point[0]]
    intersect_r[:,blend_region:]= image_2[:,0:blend_region]
    mask = np.zeros( (image_2.shape[0], 2*blend_region) )
    mask[:,0:blend_region] = np.ones( (mask.shape[0], blend_region) )
    
    # Blend
    blend_img = run_blend(intersect_l, intersect_r, mask)
    # Combine
    output_image[point[1]:point[1]+image_2.shape[0], point[0]-blend_region:point[0]+blend_region] = blend_img
    output_image[ point[1]:point[1]+image_2.shape[0], point[0]+blend_region:] = image_2[:,blend_region:]
    
    return output_image
    # END OF FUNCTION

def warpImagePair(image_1, image_2, homography):
    """ Warps image 1 so it can be blended with image 2 (stitched).

    Follow these steps:
        1. Obtain the corners for image 1 and image 2 using the function you
        wrote above.
        
        2. Transform the perspective of the corners of image 1 by using the
        image_1_corners and the homography to obtain the transformed corners.
        
        Note: Now we know the corners of image 1 and image 2. Out of these 8
        points (the transformed corners of image 1 and the corners of image 2),
        we want to find the minimum x, maximum x, minimum y, and maximum y. We
        will need this when warping the perspective of image 1.

        3. Join the two corner arrays together (the transformed image 1 corners,
        and the image 2 corners) into one array of size (8, 1, 2).

        4. For the first column of this array, find the min and max. This will
        be your minimum and maximum X values. Store into x_min, x_max.

        5. For the second column of this array, find the min and max. This will
        be your minimum and maximum Y values. Store into y_min, y_max.

        6. Create a translation matrix that will shift the image by the required
        x_min and y_min (should be a numpy.ndarray). This looks like this:
            [[1, 0, -1 * x_min],
             [0, 1, -1 * y_min],
             [0, 0, 1]]

        Note: We'd like you to explain the reasoning behind multiplying the
        x_min and y_min by negative 1 in your writeup.

        7. Compute the dot product of your translation matrix and the homography
        in order to obtain the homography matrix with a translation.

        8. Then call cv2.warpPerspective. Pass in image 1, the dot product of
        the matrix computed in step 6 and the passed in homography and a vector
        that will fit both images, since you have the corners and their max and
        min, you can calculate it as (x_max - x_min, y_max - y_min).

        9. To finish, you need to blend both images. We have coded the call to
        the blend function for you.

    Args:
        image_1 (numpy.ndarray): Left image.
        image_2 (numpy.ndarray): Right image.
        homography (numpy.ndarray): 3x3 matrix that represents the homography
                                    from image 1 to image 2.

    Returns:
        output_image (numpy.ndarray): The stitched images.
    """
    # Store the result of cv2.warpPerspective in this variable.
    warped_image = None
    # The minimum and maximum values of your corners.
    x_min = 0
    y_min = 0
    x_max = 0
    y_max = 0

    # WRITE YOUR CODE HERE
    image_1_corners = getImageCorners(image_1)
    image_2_corners = getImageCorners(image_2)
    h = homography
    # Use homography to transform the corners of image 1
    # Use homogeneous coordinates
    ''' Reasoning
    (h0,h1,h2)    (x)   (h0*x + h1*y + h2)   (tx)   
    (h3,h4,h5)  * (y) = (h3*x + h4*y + h5) = (ty) 
    (h6,h7,h8)    (1)   (h6*x + h7*y + h8)   (tz)
    '''
    for i in range(4):
        x = image_1_corners[i,0,0]
        y = image_2_corners[i,0,1]
        z = 1.0/(h[2,0]*x + h[2,1]*y + h[2,2])
        
        px = int( (h[0,0]*x + h[0,1]*y + h[0,2])*z )
        py = int( (h[1,0]*x + h[1,1]*y + h[1,2])*z )
        
        image_1_corners[i,:,:] = np.array([[px, py]])
    #end for
    
    image_corners = np.zeros( (8, 1, 2) )
    image_corners[0:4,:,:] = image_1_corners
    image_corners[4:8,:,:] = image_2_corners
    
    x_min = np.min(image_corners[:,:,0])
    x_max = np.max(image_corners[:,:,0])
    y_min = np.min(image_corners[:,:,1])
    y_max = np.max(image_corners[:,:,1])
    
    
    translation = np.array([ [ 1, 0, -1*x_min ],
                             [ 0, 1, -1*y_min ],
                             [ 0, 0,     1    ] ])
                             
    #M = np.dot( homography, translation )
    M = np.dot( translation, homography )
    
    # There can be memory problems here if the image is warped too much
    warped_image = cv2.warpPerspective( image_1, M, (int(x_max-x_min), int(y_max-y_min)) )

    # END OF CODING
    output_image = blendImagePair(warped_image, image_2,
                                  (-1 * x_min, -1 * y_min))
    return output_image

def run_blend(black_image, white_image, mask):
  """ This function administrates the blending of the two images according to 
  mask.

  Assume all images are float dtype, and return a float dtype.
  """

  # Automatically figure out the size
  min_size = min(black_image.shape)
  depth = int(math.floor(math.log(min_size, 2))) - 4 # at least 16x16 at the highest level.

  gauss_pyr_mask = gaussPyramid(mask, depth)
  gauss_pyr_black = gaussPyramid(black_image, depth)
  gauss_pyr_white = gaussPyramid(white_image, depth)


  lapl_pyr_black  = laplPyramid(gauss_pyr_black)
  lapl_pyr_white = laplPyramid(gauss_pyr_white)

  outpyr = blend(lapl_pyr_white, lapl_pyr_black, gauss_pyr_mask)
  outimg = collapse(outpyr)

  outimg[outimg < 0] = 0 # blending sometimes results in slightly out of bound numbers.
  outimg[outimg > 255] = 255
  outimg = outimg.astype(np.uint8)

  return outimg
  # End of function
  
  
def generatingKernel(parameter):
  """ Return a 5x5 generating kernel based on an input parameter.

  Args:
    parameter (float): Range of value: [0, 1].

  Returns:
    numpy.ndarray: A 5x5 kernel.

  """
  kernel = np.array([0.25 - parameter / 2.0, 0.25, parameter,
                     0.25, 0.25 - parameter /2.0])
  return np.outer(kernel, kernel)

def reduce(image):
  """ 
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
  """ 
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
  """ 
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
  """ 
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




# Some simple testing.
# image_1 = cv2.imread("images/source/panorama_1/1.jpg")
# image_2 = cv2.imread("images/source/panorama_1/2.jpg")
# image_1_kp, image_2_kp, matches = findMatchesBetweenImages(image_1, image_2,
#                                                            20)
# homography = findHomography(image_1_kp, image_2_kp, matches)
# result = warpImagePair(image_1, image_2, homography)
# cv2.imwrite("images/output/panorama_1_result.jpg", result)