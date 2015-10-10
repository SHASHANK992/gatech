"""Problem Set 6: Optic Flow."""

import numpy as np
import scipy as sp
import scipy.signal
import cv2

import os

# I/O directories
input_dir = "input"
output_dir = "output"


# Assignment code
def optic_flow_LK(A, B, window_size=9):
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
    # Take the difference of A and B
    # This is the time derivative    
    It = A - B  
    
    # Compute the gradients
    # Since we assume the motion is so small, can just assume A and B are
    # basically the same
    Ix = cv2.Sobel( A, cv2.CV_64F, 1, 0 )
    Iy = cv2.Sobel( A, cv2.CV_64F, 0, 1 )          
    
    # Run Gaussian or uniform smoothing
    Ixx_blur = cv2.blur( Ix*Ix, (window_size,window_size), borderType=cv2.BORDER_REFLECT )
    Iyy_blur = cv2.blur( Iy*Iy, (window_size,window_size), borderType=cv2.BORDER_REFLECT )
    Ixy_blur = cv2.blur( Ix*Iy, (window_size,window_size), borderType=cv2.BORDER_REFLECT )
    Ixt_blur = cv2.blur( Ix*It, (window_size,window_size), borderType=cv2.BORDER_REFLECT )
    Iyt_blur = cv2.blur( Iy*It, (window_size,window_size), borderType=cv2.BORDER_REFLECT )
    
    U = np.zeros( A.shape, dtype=np.float_ )
    V = np.zeros( A.shape, dtype=np.float_ )
    # Now we have all the derivatives we need
    # Build the linear system to solve using least squares 
    # Loop over all the pixels
    for i in range( A.shape[0] ):
        for j in range( A.shape[1] ):
            matA = np.array( [ [Ixx_blur[i,j], Ixy_blur[i,j] ],
                               [Ixy_blur[i,j], Iyy_blur[i,j] ] ])
            vecB = np.array([ [ 1.0*Ixt_blur[i,j] ],
                              [ 1.0*Iyt_blur[i,j] ] ])   
                                                  
            x, error, rank, s = np.linalg.lstsq( matA, vecB )
                                           
            U[i,j] = x[0,0]
            V[i,j] = x[1,0]
                        
        #end for
    #end for    
    
    return U, V

def optic_flow_LK_jrk(A, B, window_size=3):
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
    # Take the difference of A and B
    # This is the time derivative    
    It = A - B  
    
    It = cv2.copyMakeBorder( It, window_size, window_size, window_size, window_size, cv2.BORDER_REFLECT)
    
    # Compute the gradients
    # Since we assume the motion is so small, can just assume A and B are
    # basically the same
    Ix = cv2.Sobel( A, cv2.CV_64F, 1, 0 )
    Iy = cv2.Sobel( A, cv2.CV_64F, 0, 1 )  
    Ix = cv2.copyMakeBorder( Ix, window_size, window_size, window_size, window_size, cv2.BORDER_REFLECT)
    Iy = cv2.copyMakeBorder( Iy, window_size, window_size, window_size, window_size, cv2.BORDER_REFLECT)        
    
    U = np.zeros( A.shape, dtype=np.float_ )
    V = np.zeros( A.shape, dtype=np.float_ )
    # Now we have all the derivatives we need
    # Build the linear system to solve using least squares 
    # Loop over all the pixels
    for i in range( A.shape[0] ):
        for j in range( A.shape[1] ):
            # For each pixel, create an overconstrained set of equations from the points surrounding
            # the given pixel
            matA = np.zeros( (window_size**2, 2) )
            vecB = np.zeros( (window_size**2, 1) )
            index = 0
            for ii in range( window_size ):
                for jj in range( window_size):
                    matA[index, :] = np.array([ [Ix[i+ii,j+jj], Iy[i+ii,j+jj]] ] )
                    
                    vecB[index, :] = np.array([ [ -1.0*It[i+ii,j+jj] ] ] ) 
                    
                    index += 1                   
            #end for                   
                              
            x, error, rank, s = np.linalg.lstsq( matA, vecB )
                       
            U[i,j] = x[0,0]
            V[i,j] = x[1,0]
        #end for
    #end for    
    
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
    for i in range( levels-1 ):
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
    


def laplacian_pyramid(gaussPyr):
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
    
#def problem1( img1, img2, filename )
    
def make_image_pair(image1, image2):
    """Adjoin two images side-by-side to make a single new image.

    Parameters
    ----------
        image1: first image, could be grayscale or color (BGR)
        image2: second image, same type as first

    Returns
    -------
        image_pair: combination of both images, side-by-side, same type
    """

    # TODO: Your code here
    # Determine if the input images are grayscale or color
    r = np.maximum( image1.shape[0], image2.shape[0] )
    c = image1.shape[1] + image2.shape[1]
    image_pair = []
    
    if len(image1.shape) == 3:
        # Make image_pair of appropriate size
        image_pair = np.zeros( (r,c,3) )
        image_pair[0:image1.shape[0],0:image1.shape[1],:] = image1[:,:,:]
        image_pair[0:image2.shape[0],image1.shape[1]:c,:] = image2[:,:,:]
    else:
        image_pair = np.zeros( (r,c) )
        image_pair[ 0:image1.shape[0], 0:image1.shape[1] ] = image1[:,:]
        image_pair[ 0:image2.shape[0], image1.shape[1]:c ] = image2[:,:] 
    #end if  
    return image_pair
    
def norm( img ):
    normed = 0
    normed = cv2.normalize( img, normed, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1)
    return normed

def quiver_img( U, V, stride, scale ):
    img_out = np.zeros( (V.shape[0], U.shape[1], 3), dtype=np.uint8)
    color = (0,255,0)
    for y in xrange(0, V.shape[0], stride):
        for x in xrange(0, U.shape[1], stride):
            cv2.arrowedLine( img_out, (x,y), (x+int(U[y,x]*scale), y+int(V[y,x]*scale)), color, 1, tipLength=0.5)
        #end for
    #end for    
    return img_out

def createPyrImg( gaussPyr ):
    # The gaussian pyramid is arranged with the biggest array at the bottom (index 0) of the pyramid
    # The number of rows in the output image is the number of rows in the bottom image
    rows = gaussPyr[0].shape[0]
    # The number of columns is the sum of all the widths of the images
    columns = 0
    for i in range( len(gaussPyr) ):
        columns += gaussPyr[i].shape[1]
    #end for
    
    # Create the empty output image
    img_out = np.zeros( (rows, columns) )
    
    col = 0
    for i in range( len(gaussPyr) ):
        level = gaussPyr[i]
        img_out[ 0:level.shape[0], col:col+level.shape[1] ] = level[:,:]
        col += level.shape[1]     
    #end for
    
    return img_out

# Driver code
def main():
    # Note: Comment out parts of this code as necessary

    # 1a
    Shift0    = cv2.imread(os.path.join(input_dir, 'TestSeq', 'Shift0.png'), 0) / 255.0
    ShiftR2   = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR2.png'), 0) / 255.0
    ShiftR5U5 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR5U5.png'), 0) /255.0
    # TODO: Optionally, smooth the images if LK doesn't work well on raw images
    Shift0 = cv2.GaussianBlur( Shift0, (25,25), 15, borderType=cv2.BORDER_REFLECT)
    ShiftR2 = cv2.GaussianBlur( ShiftR2, (25,25), 15, borderType=cv2.BORDER_REFLECT)
    ShiftR5U5 = cv2.GaussianBlur( ShiftR5U5, (25,25), 15, borderType=cv2.BORDER_REFLECT)
    
    U, V = optic_flow_LK(Shift0, ShiftR2, 21)  # TODO: implement this

    U_norm = norm(U)
    V_norm = norm(V)    
    U_colormap = cv2.applyColorMap( U_norm, cv2.COLORMAP_JET)
    V_colormap = cv2.applyColorMap( V_norm, cv2.COLORMAP_JET)
    
    # TODO: Save U, V as side-by-side false-color image or single quiver plot
    UV_pair = make_image_pair(U_colormap, V_colormap)    
    cv2.imwrite( os.path.join(output_dir, 'ps6-1-a-1.png'), UV_pair)
    
    img_quiver = quiver_img( U, V, 10, 20)    
    cv2.imwrite( os.path.join(output_dir, 'quiver_1-a-1.png'), img_quiver )

    # TODO: Similarly for Shift0 and ShiftR5U5
    U, V = optic_flow_LK(Shift0, ShiftR5U5,61)
    U_norm = norm(U)
    V_norm = norm(V)
    U_colormap = cv2.applyColorMap( U_norm, cv2.COLORMAP_JET)
    V_colormap = cv2.applyColorMap( V_norm, cv2.COLORMAP_JET)
    UV_pair = make_image_pair( U_colormap, V_colormap)
    cv2.imwrite( os.path.join(output_dir, 'ps6-1-a-2.png'), UV_pair)
    img_quiver = quiver_img( U, V, 10, 10)
    cv2.imwrite( os.path.join(output_dir, 'quiver_1-a-2.png'), img_quiver)

    #**********************
    # 1b
    # TODO: Similarly for ShiftR10, ShiftR20 and ShiftR40
    ShiftR10 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR10.png'), 0)/255.0
    ShiftR20 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR20.png'), 0)/255.0
    ShiftR40 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR40.png'), 0)/255.0
    
    ShiftR10 = cv2.GaussianBlur( ShiftR10, (25,25), 15, borderType=cv2.BORDER_REFLECT)
    ShiftR20 = cv2.GaussianBlur( ShiftR20, (25,25), 15, borderType=cv2.BORDER_REFLECT)
    ShiftR40 = cv2.GaussianBlur( ShiftR40, (25,25), 15, borderType=cv2.BORDER_REFLECT)
    
    # 10
    U, V = optic_flow_LK(Shift0, ShiftR10,61)
    U_norm = norm(U)
    V_norm = norm(V)
    U_colormap = cv2.applyColorMap( U_norm, cv2.COLORMAP_JET)
    V_colormap = cv2.applyColorMap( V_norm, cv2.COLORMAP_JET)
    UV_pair = make_image_pair( U_colormap, V_colormap)
    cv2.imwrite( os.path.join(output_dir, 'ps6-1-b-1.png'), UV_pair)
    img_quiver = quiver_img( U, V, 10, 10)
    cv2.imwrite( os.path.join(output_dir, 'quiver_1-b-1.png'), img_quiver)
    
    # 20
    U, V = optic_flow_LK(Shift0, ShiftR20,61)
    U_norm = norm(U)
    V_norm = norm(V)
    U_colormap = cv2.applyColorMap( U_norm, cv2.COLORMAP_JET)
    V_colormap = cv2.applyColorMap( V_norm, cv2.COLORMAP_JET)
    UV_pair = make_image_pair( U_colormap, V_colormap)
    cv2.imwrite( os.path.join(output_dir, 'ps6-1-b-2.png'), UV_pair)
    img_quiver = quiver_img( U, V, 10, 10)
    cv2.imwrite( os.path.join(output_dir, 'quiver_1-b-2.png'), img_quiver)
    
    # 40
    U, V = optic_flow_LK(Shift0, ShiftR40,71)
    U_norm = norm(U)
    V_norm = norm(V)
    U_colormap = cv2.applyColorMap( U_norm, cv2.COLORMAP_JET)
    V_colormap = cv2.applyColorMap( V_norm, cv2.COLORMAP_JET)
    UV_pair = make_image_pair( U_colormap, V_colormap)
    cv2.imwrite( os.path.join(output_dir, 'ps6-1-b-3.png'), UV_pair)
    img_quiver = quiver_img( U, V, 10, 10)
    cv2.imwrite( os.path.join(output_dir, 'quiver_1-b-3.png'), img_quiver)
    
    
    #***************************************************************************
    # 2a
    yos_img_01 = cv2.imread(os.path.join(input_dir, 'DataSeq1', 'yos_img_01.jpg'), 0) / 255.0
    yos_img_01_g_pyr = gaussian_pyramid(yos_img_01, 4)  # TODO: implement this
    # TODO: Save pyramid images as a single side-by-side image (write a utility function?)
    gaussPyr_img =  norm( createPyrImg( yos_img_01_g_pyr ) )
    cv2.imwrite( os.path.join(output_dir, 'ps6-2-a-1.png'), gaussPyr_img )
    
    #******************************
    # 2b
    yos_img_01_l_pyr = laplacian_pyramid(yos_img_01_g_pyr)  # TODO: implement this
    # TODO: Save pyramid images as a single side-by-side image
    laplPyr_img = norm( createPyrImg( yos_img_01_l_pyr ) )
    cv2.imwrite( os.path.join(output_dir, 'ps6-2-b-1.png'), laplPyr_img )

    
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
    
    
    '''
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
    '''

if __name__ == "__main__":
    main()
