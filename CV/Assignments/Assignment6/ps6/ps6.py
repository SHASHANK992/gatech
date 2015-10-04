"""Problem Set 6: Optic Flow."""

import numpy as np
import scipy as sp
import cv2

import os

# I/O directories
input_dir = "input"
output_dir = "output"


# Assignment code
def optic_flow_LK(A, B):
    """Compute optic flow using the Lucas-Kanade method.

    Parameters
    ----------
        A: grayscale floating-point image, values in [0.0, 1.0]
        B: grayscale floating-point image, values in [0.0, 1.0]

    Returns
    -------
        U: raw displacement (in pixels) along X-axis, same size as image, floating-point type
        V: raw displacement (in pixels) along Y-axis, same size and type as U
    """

    # TODO: Your code here
    return U, V

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
    """Reduce image to the next smaller level.

    Parameters
    ----------
        image: grayscale floating-point image, values in [0.0, 1.0]

    Returns
    -------
        reduced_image: same type as image, half size
    """

    # TODO: Your code here
    r = image.shape[0]
    c = image.shape[1]
    reduced_img = np.zeros( (np.ceil(r/2.), np.ceil(c/2.)) )
  
    kernel = generatingKernel(0.4)
    # Convolve
    img_conv = sp.signal.convolve2d(image, kernel, 'same') 
    # Extract every other row and column
    reduced_img[:,:] = img_conv[::2,::2]
  
    return reduced_img


def gaussian_pyramid(image, levels):
    """Create a Gaussian pyramid of given image.

    Parameters
    ----------
        image: grayscale floating-point image, values in [0.0, 1.0]
        levels: number of levels in the resulting pyramid

    Returns
    -------
        g_pyr: Gaussian pyramid, with g_pyr[0] = image
    """

    # TODO: Your code here
    output = [image]
  
    img_reduced = image
  
    # For each of the levels
    for i in range( levels ):
      # Reduce the image
      img_reduced = reduce(img_reduced)
    
      # Add reduced image to list
      output.append(img_reduced)

    return output


def expand(image):
    """Expand image to the next larger level.

    Parameters
    ----------
        image: grayscale floating-point image, values in [0.0, 1.0]

    Returns
    -------
        reduced_image: same type as image, double size
    """

    # TODO: Your code here
    img_ex = np.zeros( ( 2*image.shape[0], 2*image.shape[1] ) )
  
    kernel = generatingKernel(0.4)
  
    # Copy original image to every other index of supersampled image
    img_ex[::2, ::2] = image[:,:]
  
    # Convolve
    img_ex_conv = sp.signal.convolve2d(img_ex, kernel, 'same')
  
    # Multiply
    img_ex = 4.0*img_ex_conv

    return img_ex
    


def laplacian_pyramid(g_pyr):
    """Create a Laplacian pyramid from a given Gaussian pyramid.

    Parameters
    ----------
        g_pyr: Gaussian pyramid, as returned by gaussian_pyramid()

    Returns
    -------
        l_pyr: Laplacian pyramid, with l_pyr[-1] = g_pyr[-1]
    """

    # TODO: Your code here
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


def warp(image, U, V):
    """Warp image using X and Y displacements (U and V).

    Parameters
    ----------
        image: grayscale floating-point image, values in [0.0, 1.0]

    Returns
    -------
        warped: warped image, such that warped[y, x] = image[y + V[y, x], x + U[y, x]]

    """

    # TODO: Your code here
    return warped


def hierarchical_LK(A, B):
    """Compute optic flow using the Hierarchical Lucas-Kanade method.

    Parameters
    ----------
        A: grayscale floating-point image, values in [0.0, 1.0]
        B: grayscale floating-point image, values in [0.0, 1.0]

    Returns
    -------
        U: raw displacement (in pixels) along X-axis, same size as image, floating-point type
        V: raw displacement (in pixels) along Y-axis, same size and type as U
    """

    # TODO: Your code here
    return U, V


# Driver code
def main():
    # Note: Comment out parts of this code as necessary

    # 1a
    Shift0 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'Shift0.png'), 0) / 255.0
    ShiftR2 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR2.png'), 0) / 255.0
    # TODO: Optionally, smooth the images if LK doesn't work well on raw images
    U, V = optic_flow_LK(Shift0, ShiftR2)  # TODO: implement this
    # TODO: Save U, V as side-by-side false-color image or single quiver plot

    # TODO: Similarly for Shift0 and ShiftR5U5

    # 1b
    # TODO: Similarly for ShiftR10, ShiftR20 and ShiftR40

    # 2a
    yos_img_01 = cv2.imread(os.path.join(input_dir, 'DataSeq1', 'yos_img_01.jpg'), 0) / 255.0
    yos_img_01_g_pyr = gaussian_pyramid(yos_img_01, 4)  # TODO: implement this
    # TODO: Save pyramid images as a single side-by-side image (write a utility function?)

    # 2b
    yos_img_01_l_pyr = laplacian_pyramid(yos_img_01_g_pyr)  # TODO: implement this
    # TODO: Save pyramid images as a single side-by-side image

    # 3a
    yos_img_02 = cv2.imread(os.path.join(input_dir, 'DataSeq1', 'yos_img_02.jpg'), 0) / 255.0
    yos_img_02_g_pyr = gaussian_pyramid(yos_img_02, 4)
    # TODO: Select appropriate pyramid *level* that leads to best optic flow estimation
    U, V = optic_flow_LK(yos_img_01_l_pyr[level], yos_img_02_g_pyr[level])
    # TODO: Scale up U, V to original image size (note: don't forget to scale values as well!)
    # TODO: Save U, V as side-by-side false-color image or single quiver plot

    yos_img_02_warped = warp(yos_img_02, U, V)  # TODO: implement this
    # TODO: Save difference image between yos_img_02_warped and original yos_img_01
    # Note: Scale values such that zero difference maps to neutral gray, max -ve to black and max +ve to white

    # Similarly, you can compute displacements for yos_img_02 and yos_img_03 (but no need to save images)

    # TODO: Repeat for DataSeq2 (save images)

    # 4a
    ShiftR10 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR10.png'), 0) / 255.0
    ShiftR20 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR20.png'), 0) / 255.0
    ShiftR40 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR40.png'), 0) / 255.0
    U10, V10 = hierarchical_LK(Shift0, ShiftR10)  # TODO: implement this
    U20, V20 = hierarchical_LK(Shift0, ShiftR20)
    U40, V40 = hierarchical_LK(Shift0, ShiftR40)
    # TODO: Save displacement image pairs (U, V), stacked
    # Hint: You can use np.concatenate()
    ShiftR10_warped = warp(ShiftR10, U10, V10)
    ShiftR20_warped = warp(ShiftR20, U20, V20)
    ShiftR40_warped = warp(ShiftR40, U40, V40)
    # TODO: Save difference between each warped image and original image (Shift0), stacked

    # 4b
    # TODO: Repeat for DataSeq1 (use yos_img_01.png as the original)

    # 4c
    # TODO: Repeat for DataSeq1 (use 0.png as the original)    


if __name__ == "__main__":
    main()
