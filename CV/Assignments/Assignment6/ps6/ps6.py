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
def optic_flow_LK(A, B, window_size=9, threshold=10**-10):
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
    Ix = (1.0/8.0)*cv2.Sobel( A, cv2.CV_64F, 1, 0 )
    Iy = (1.0/8.0)*cv2.Sobel( A, cv2.CV_64F, 0, 1 )
    
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
            detA = np.linalg.det(matA)
            vecB = np.array([ [ 1.0*Ixt_blur[i,j] ],
                              [ 1.0*Iyt_blur[i,j] ] ])   
                                                 
            if abs(detA) <= threshold:
                U[i,j] = 0.0
                V[i,j] = 0.0
            else:
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
#End generatingKernel

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
#End reduce


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
#end function


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
#end expand
    

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
#End laplacian

def warp(image, U, V, borderSize=10):
    """Warp image using X and Y displacements (U and V).

    Parameters
    ----------
        image: grayscale floating-point image, values in [0.0, 1.0]

    Returns
    -------
        warped: warped image, such that warped[y, x] = image[y + V[y, x], x + U[y, x]]

    """
    # TODO: Your code here
    U_warp = np.around(U)
    V_warp = np.around(V)
    
    img_border = cv2.copyMakeBorder( image, borderSize, borderSize, borderSize, borderSize, cv2.BORDER_REFLECT)
    
    warped = np.zeros(image.shape)
    for y in range(image.shape[0]):
        for x in range(image.shape[1]):
            warped[y, x] = img_border[y + V_warp[y,x]+borderSize, x + U_warp[y,x]+borderSize]
        #endfor
    #endfor
        
    return warped
#end warp

def hierarchical_LK(A, B, max_level=4):
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
    '''
    # First take
    # TODO: Your code here
    k = max_level
    
    # Reduce A and B to level k
    A_k = A
    B_k = B
    for i in range(k):
        A_k = reduce(A_k)
        B_k = reduce(B_k)
    
    # Init U and V to be the same size as A_k
    U = np.zeros( A_k.shape )
    V = np.zeros( A_k.shape )
    
    iteration = 0
    while k > 0:
        A_k = A
        B_k = B
        for i in range(k):
            A_k = reduce(A_k)
            B_k = reduce(B_k)
        
        # If this is not the first time expand U and V
        if iteration != 0:  
            U = 2*expand(U)
            V = 2*expand(V)
        #endif
        
        # Warp B_k using U
        C_k = warp(B_k, U, V)
        
        # Compute incremental flow field
        D_x, D_y = optic_flow_LK(A_k, C_k)
        
        # Add to original flow
        U = U + D_x
        V = V + D_y
        
        # Decrement k
        k -= 1
        iteration += 1
        print U.shape
    #end while
    ''' 
    
    # Second take
    A_gauss = gaussian_pyramid(A, max_level)
    B_gauss = gaussian_pyramid(B, max_level)
    
    U = np.zeros( A_gauss[max_level-1].shape )
    V = np.zeros( A_gauss[max_level-1].shape )
    
    for k in range(max_level):
        A_k = A_gauss[max_level-k-1]
        B_k = B_gauss[max_level-k-1]
        
        if k != 0:
            # Expand U and V
            U = 2*expand(U)
            V = 2*expand(V)
        #endif
        
        # Warp B_k using U
        C_k = warp(B_k, U, V)
        
        # Compute incremental flow field
        D_x, D_y = optic_flow_LK(A_k, C_k)
        
        # Add to original flow
        U = U + D_x
        V = V + D_y
    #end for
    
    return U, V
#end hierarchical_LK
    
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
#end make_image_pair
    
def stack_image( img1, img2, img3 ):
    """ Assume all images are of the same size"""
    rows = img1.shape[0]
    columns = img1.shape[1]
    # output image is the same width, but three
    # pictures tall
    output_img = np.zeros((3*rows, columns))
    output_img[0:rows,:] = img1
    output_img[rows:2*rows,:] = img2
    output_img[2*rows:3*rows,:] = img3
    
    return output_img
#end stack_image
    
def norm( img ):
    normed = 0
    normed = cv2.normalize( img, normed, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1)
    return normed
#end norm

def quiver_img( U, V, stride, scale ):
    img_out = np.zeros( (V.shape[0], U.shape[1], 3), dtype=np.uint8)
    color = (0,255,0)
    for y in xrange(0, V.shape[0], stride):
        for x in xrange(0, U.shape[1], stride):
            cv2.arrowedLine( img_out, (x,y), (x+int(U[y,x]*scale), y+int(V[y,x]*scale)), color, 1, tipLength=0.5)
        #end for
    #end for    
    return img_out
#end quiver_img

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
#end createPyrImg
    
def colorAndQuiver( U, V, stride, scale, filename ):
    U_norm = norm(U)
    V_norm = norm(V)
    U_colormap = cv2.applyColorMap( U_norm, cv2.COLORMAP_JET)
    V_colormap = cv2.applyColorMap( V_norm, cv2.COLORMAP_JET)
    UV_pair = make_image_pair( U_colormap, V_colormap)
    cv2.imwrite( os.path.join(output_dir, filename), UV_pair)
    img_quiver = quiver_img( U, V, stride, scale)
    cv2.imwrite( os.path.join(output_dir, 'quiver_' + filename), img_quiver)
#end colorAndQuiver

def colorAndQuiver( U, V, stride, scale ):
    U_norm = norm(U)
    V_norm = norm(V)
    U_colormap = cv2.applyColorMap( U_norm, cv2.COLORMAP_JET)
    V_colormap = cv2.applyColorMap( V_norm, cv2.COLORMAP_JET)
    UV_pair = make_image_pair( U_colormap, V_colormap)
    img_quiver = quiver_img( U, V, stride, scale)
    
    return UV_pair, img_quiver
#end colorAndQuiver

# Driver code
def main():
    # Note: Comment out parts of this code as necessary
    
    # 1a
    Shift0    = cv2.imread(os.path.join(input_dir, 'TestSeq', 'Shift0.png'), 0) / 255.0
    ShiftR2   = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR2.png'), 0) / 255.0
    ShiftR5U5 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR5U5.png'), 0) /255.0
    '''
    # TODO: Optionally, smooth the images if LK doesn't work well on raw images
    Shift0_blur = cv2.GaussianBlur( Shift0, (25,25), 15, borderType=cv2.BORDER_REFLECT)
    ShiftR2_blur = cv2.GaussianBlur( ShiftR2, (25,25), 15, borderType=cv2.BORDER_REFLECT)
    ShiftR5U5_blur = cv2.GaussianBlur( ShiftR5U5, (25,25), 15, borderType=cv2.BORDER_REFLECT)
    
    scale = 2
    stride = 10
    U, V = optic_flow_LK(Shift0_blur, ShiftR2_blur, 21)  # TODO: implement this
    colorAndQuiver( U, V, stride, scale, 'ps6-1-a-1.png')
    # Warp R2 back to R0
    #ShiftR2_warped = warp( ShiftR2, U, V, 2, 0 )
    #ShiftR2_diff = ShiftR2_warped - Shift0
    #ShiftR2_diff = norm( ShiftR2_diff)
    #cv2.imwrite( os.path.join(output_dir, 'warp.png'), ShiftR2_diff)

    # TODO: Similarly for Shift0 and ShiftR5U5
    U, V = optic_flow_LK(Shift0_blur, ShiftR5U5_blur,61)
    colorAndQuiver( U, V, stride, scale, 'ps6-1-a-2.png')

    #**********************
    # 1b
    # TODO: Similarly for ShiftR10, ShiftR20 and ShiftR40
    ShiftR10 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR10.png'), 0)/255.0
    ShiftR20 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR20.png'), 0)/255.0
    ShiftR40 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR40.png'), 0)/255.0
    
    ShiftR10_blur = cv2.GaussianBlur( ShiftR10, (25,25), 15, borderType=cv2.BORDER_REFLECT)
    ShiftR20_blur = cv2.GaussianBlur( ShiftR20, (25,25), 15, borderType=cv2.BORDER_REFLECT)
    ShiftR40_blur = cv2.GaussianBlur( ShiftR40, (25,25), 15, borderType=cv2.BORDER_REFLECT)
    
    # 10
    U, V = optic_flow_LK(Shift0_blur, ShiftR10_blur,61)
    colorAndQuiver( U, V, stride, scale, 'ps6-1-b-1.png')
    
    # 20
    U, V = optic_flow_LK(Shift0_blur, ShiftR20_blur,61)
    colorAndQuiver( U, V, stride, scale, 'ps6-1-b-2.png')
    
    # 40
    U, V = optic_flow_LK(Shift0_blur, ShiftR40_blur,71)
    colorAndQuiver( U, V, stride, scale, 'ps6-1-b-3.png')
    
    
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
    
    #*******************************************************************************
    # 3a
    yos_img_02 = cv2.imread(os.path.join(input_dir, 'DataSeq1', 'yos_img_02.jpg'), 0) / 255.0
    yos_img_02_g_pyr = gaussian_pyramid(yos_img_02, 4)
    # TODO: Select appropriate pyramid *level* that leads to best optic flow estimation
    level = 1
    U, V = optic_flow_LK(yos_img_01_g_pyr[level], yos_img_02_g_pyr[level], 31)
    # TODO: Scale up U, V to original image size (note: don't forget to scale values as well!)
    U_ex = U
    V_ex = V
    for i in range(level):
        U_ex = 2*expand(U_ex)
        V_ex = 2*expand(V_ex)
        # I might need to multiply values here?
    #end for
    # TODO: Save U, V as side-by-side false-color image or single quiver plot
    colorAndQuiver( U_ex, V_ex, stride, 10, 'ps6-3-a-1.png')   

    # Warp img 02 back to img 01
    yos_img_02_warped = warp(yos_img_02, U_ex, V_ex)  # TODO: implement this
    # TODO: Save difference image between yos_img_02_warped and original yos_img_01
    # Note: Scale values such that zero difference maps to neutral gray, max -ve to black and max +ve to white
    yos_img_01_diff = yos_img_02_warped - yos_img_01
    yos_img_01_diff = norm(yos_img_01_diff)
    cv2.imwrite( os.path.join(output_dir, 'ps6-3-a-2.png'), yos_img_01_diff )

    # Similarly, you can compute displacements for yos_img_02 and yos_img_03 (but no need to save images)

    # TODO: Repeat for DataSeq2 (save images)
    ds2_img01 = cv2.imread(os.path.join(input_dir, 'DataSeq2', '0.png'), 0)/255.0
    ds2_img02 = cv2.imread(os.path.join(input_dir, 'DataSeq2', '1.png'), 0)/255.0
    ds2_img01_g_pyr = gaussian_pyramid(ds2_img01, 4)
    ds2_img02_g_pyr = gaussian_pyramid(ds2_img02, 4)
    level = 0
    U, V = optic_flow_LK(ds2_img01_g_pyr[level], ds2_img02_g_pyr[level], 31)
    U_ex = U
    V_ex = V
    for i in range(level):
        U_ex = 2*expand(U_ex)
        V_ex = 2*expand(V_ex)
        # I might need to multiply values here?
    #end for
    # TODO: Save U, V as side-by-side false-color image or single quiver plot
    colorAndQuiver( U_ex, V_ex, stride, 5, 'ps6-3-a-3.png') 
    
    ds2_img02_warped = warp(ds2_img02, U_ex, V_ex)
    ds2_img01_diff = ds2_img02_warped - ds2_img01
    ds2_img01_diff = norm(ds2_img01_diff)
    cv2.imwrite( os.path.join(output_dir, 'ps6-3-a-4.png'), ds2_img01_diff )    
    '''
    #*********************************************************************************
    # 4a    
    ShiftR10 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR10.png'), 0) / 255.0
    ShiftR20 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR20.png'), 0) / 255.0
    ShiftR40 = cv2.imread(os.path.join(input_dir, 'TestSeq', 'ShiftR40.png'), 0) / 255.0
    U10, V10 = hierarchical_LK(Shift0, ShiftR10)  # TODO: implement this
    U20, V20 = hierarchical_LK(Shift0, ShiftR20)
    U40, V40 = hierarchical_LK(Shift0, ShiftR40)
    # Save off color maps and quiver plots
    rows = Shift0.shape[0]
    columns = Shift0.shape[1]
    stacked_color = np.zeros( (3*rows, 2*columns, 3) )
    stacked_quiver = np.zeros( (3*rows, columns, 3) )
    stacked_color[0:rows,:], stacked_quiver[0:rows,:] = colorAndQuiver(U10, V10, 10, 1)
    stacked_color[rows:2*rows,:], stacked_quiver[rows:2*rows,:] = colorAndQuiver(U20, V20, 10, 1)
    stacked_color[2*rows:3*rows,:], stacked_quiver[2*rows:3*rows,:] = colorAndQuiver(U40, V40, 10, 1)
    cv2.imwrite( os.path.join(output_dir, 'ps6-4-a-1.png'), stacked_color)
    cv2.imwrite( os.path.join(output_dir, 'quiver_ps6-4-a-1.png'), stacked_quiver)
    # TODO: Save displacement image pairs (U, V), stacked
    # Hint: You can use np.concatenate()
    ShiftR10_warped = warp(ShiftR10, U10, V10, 15)
    ShiftR20_warped = warp(ShiftR20, U20, V20, 25)
    ShiftR40_warped = warp(ShiftR40, U40, V40, 45)
    # TODO: Save difference between each warped image and original image (Shift0), stacked
    ShiftR10_diff = ShiftR10_warped - Shift0
    ShiftR20_diff = ShiftR20_warped - Shift0
    ShiftR40_diff = ShiftR40_warped - Shift0
    ShiftR10_diff = norm(ShiftR10_diff)
    ShiftR20_diff = norm(ShiftR20_diff)
    ShiftR40_diff = norm(ShiftR40_diff)
    stacked_diff = stack_image(ShiftR10_diff, ShiftR20_diff, ShiftR40_diff)
    cv2.imwrite( os.path.join(output_dir, 'ps6-4-a-2.png'), stacked_diff)
    '''
    # 4b
    # TODO: Repeat for DataSeq1 (use yos_img_01.png as the original)

    # 4c
    # TODO: Repeat for DataSeq1 (use 0.png as the original)    
    '''

if __name__ == "__main__":
    main()
