"""Problem Set 3: Window-based Stereo Matching."""

import numpy as np
import cv2

import os

input_dir = "input"  # read images from os.path.join(input_dir, <filename>)
output_dir = "output"  # write images to os.path.join(output_dir, <filename>)

def disparity_ssd(L, R, window_size=3):
    """Compute disparity map D(y, x) such that: L(y, x) = R(y, x + D(y, x))
    
    Params:
    L: Grayscale left image, in range [0.0, 1.0]
    R: Grayscale right image, same size as L

    Returns: Disparity map, same size as L, R
    """
    
    D = np.zeros(L.shape)

    for i in range(L.shape[0]-window_size):
        for j in range( L.shape[1]-window_size):
            # Cut out template
            template = R[i:i+window_size, j:j+window_size]
            # Define the strip we are covering
            strip = L[i:i+window_size, :]
            
            # Compute SSD between this strip and the template
            curr_ssd = ssd( strip, template )
            
            # Find the minimum in the ssd vector
            # This index (less the current position) is what belongs in the disparity array
            D[i,j] = np.argmin( curr_ssd ) - j            
        #end for
        
    #end for
    return D

def ssd( strip, template):
    """ Computes the sum of squared difference between two arrays
    """
    # output will be a vector the same width as the input strip, but 
    # only one row tall
    ssd_vector = np.zeros( (1, strip.shape[1]) )
    
    #Extend the borders of the strip
    strip = cv2.copyMakeBorder(strip, 0, 0, 0, template.shape[0], cv2.BORDER_REFLECT )
    
    # For every position along the strip
    for index in range( strip.shape[1]-template.shape[1] ):
        # Calculate the SSD value over the entire template
        ssd_val = np.sum( np.square( template - strip[:, index:index+template.shape[0]] ), axis=(0,1) )
       
        ssd_vector[0, index] = ssd_val
    # end for

    return ssd_vector
    
def ssd_strides( strip, template ):
    
    ssd_vector = np.zeros( (1, strip.shape[1]) )
    
    #Extend the borders of the strip
    strip = cv2.copyMakeBorder(strip, 0, 0, 0, template.shape[0], cv2.BORDER_REFLECT )
    
    
    return ssd_vector


def disparity_ncorr(L, R, window_size=3):
    """Compute disparity map D(y, x) such that: L(y, x) = R(y, x + D(y, x))
    
    Params:
    L: Grayscale left image, in range [0.0, 1.0]
    R: Grayscale right image, same size as L

    Returns: Disparity map, same size as L, R
    
    
    So we have epipolar lines, which means that matching pixels will be at the 
    same y-position but different x-positions in the image pair
    
    To have a disparity map as defined above, we need to divide image L into strips 
    Along each strip I want to compare the template (window) that I take from image R
    """
    D = np.zeros(L.shape)
     
    # For each row in the image
    for i in range(L.shape[0] - window_size + 1):
        for j in range( R.shape[1] - window_size + 1):
            template = R[i:i+window_size, j:j+window_size]
            
            # Compute the normalized correlation for every window in this epipolar line
            # This outputs a row vector. Each value on the row corresponds to the normalized
            # correlation from applying the template the the strip at the given location
            temp = cv2.matchTemplate( L[i:i+window_size,:], template, cv2.TM_CCORR_NORMED )

            # Find the maximum in the normalized correlation vector
            # This index (less the current position) is what belongs in the disparity array
            D[i,j] = np.argmax( temp ) - j
            
    return D

def main():
    """Run code/call functions to solve problems."""
    '''
    # 1-a
    # Read images
    L = cv2.imread(os.path.join('input', 'pair0-L.png'), 0) * (1 / 255.0)  # grayscale, scale to [0.0, 1.0]
    R = cv2.imread(os.path.join('input', 'pair0-R.png'), 0) * (1 / 255.0)

    # Compute disparity (using method disparity_ssd defined in disparity_ssd.py)
    D_L = disparity_ssd(np.float32(L), np.float32(R), 13)  # TODO: implemenet disparity_ssd()
    D_R = disparity_ssd(np.float32(R), np.float32(L), 11)

    # TODO: Save output images (D_L as output/ps3-1-a-1.png and D_R as output/ps3-1-a-2.png)
    # Note: They may need to be scaled/shifted before saving to show results properly
    D_L = cv2.normalize( D_L, D_L, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    D_R = cv2.normalize( D_R, D_R, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    
    cv2.imwrite( os.path.join( 'output', 'ps3-1-a-1.png'), D_L )
    cv2.imwrite( os.path.join( 'output', 'ps3-1-a-2.png'), D_R )
    
    # 2
    # TODO: Apply disparity_ssd() to pair1-L.png and pair1-R.png (in both directions)
    L = cv2.imread( os.path.join('input', 'pair1-L.png'), 0) * (1/255.)
    R = cv2.imread( os.path.join('input', 'pair1-R.png'), 0) * (1/255.)
    
    D_L = disparity_ssd(L, R)
    D_R = disparity_ssd(R, L)
    
    D_L = cv2.normalize( D_L, D_L, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    D_R = cv2.normalize( D_R, D_R, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    cv2.imwrite( os.path.join( 'output', 'ps3-2-a-1.png'), D_L )
    cv2.imwrite( os.path.join( 'output', 'ps3-2-a-2.png'), D_R )
    
    # 3
    # TODO: Apply disparity_ssd() to noisy versions of pair1 images
    L = cv2.imread( os.path.join('input', 'pair1-L.png'), 0) * (1/255.)
    R = cv2.imread( os.path.join('input', 'pair1-R.png'), 0) * (1/255.)
    
    # Add noise to left image
    sigma = 10
    noise = np.random.normal(0, sigma, L.shape)
    L = L + noise
    
    D_L = disparity_ssd(L, R)
    D_R = disparity_ssd(R, L)
    
    D_L = cv2.normalize( D_L, D_L, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    D_R = cv2.normalize( D_R, D_R, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    cv2.imwrite( os.path.join( 'output', 'ps3-3-a-1.png'), D_L )
    cv2.imwrite( os.path.join( 'output', 'ps3-3-a-2.png'), D_R )
    
    # TODO: Boost contrast in one image and apply again
    L = cv2.imread( os.path.join('input', 'pair1-L.png'), 0) * (1/255.)
    R = cv2.imread( os.path.join('input', 'pair1-R.png'), 0) * (1/255.)
    
    # Boost contrast in right image
    R = 1.10*R
    R[ R > 1.0 ] = 1.0
    
    D_L = disparity_ssd(L, R)
    D_R = disparity_ssd(R, L)
    
    D_L = cv2.normalize( D_L, D_L, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    D_R = cv2.normalize( D_R, D_R, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    cv2.imwrite( os.path.join( 'output', 'ps3-3-b-1.png'), D_L )
    cv2.imwrite( os.path.join( 'output', 'ps3-3-b-2.png'), D_R )    
    
    # 4
    # TODO: Implement disparity_ncorr() and apply to pair1 images (original, noisy and contrast-boosted)
    # Normal
    L = cv2.imread(os.path.join('input', 'pair1-L.png'), 0) * (1 / 255.0)
    R = cv2.imread(os.path.join('input', 'pair1-R.png'), 0) * (1 / 255.0)
    
    D_L = disparity_ncorr( np.float32(L), np.float32(R) )
    D_R = disparity_ncorr( np.float32(R), np.float32(L) )
    
    D_L = cv2.normalize( D_L, D_L, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    D_R = cv2.normalize( D_R, D_R, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    cv2.imwrite( os.path.join( 'output', 'ps3-4-a-1.png'), D_L )
    cv2.imwrite( os.path.join( 'output', 'ps3-4-a-2.png'), D_R )
    
    # Noisy
    L = cv2.imread( os.path.join('input', 'pair1-L.png'), 0) * (1/255.)
    R = cv2.imread( os.path.join('input', 'pair1-R.png'), 0) * (1/255.)
    
    # Add noise to left image
    sigma = 10
    noise = np.random.normal(0, sigma, L.shape)
    L = L + noise
    
    D_L = disparity_ncorr( np.float32(L), np.float32(R), 25)
    D_R = disparity_ncorr( np.float32(R), np.float32(L), 25 )
    
    D_L = cv2.normalize( D_L, D_L, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    D_R = cv2.normalize( D_R, D_R, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    cv2.imwrite( os.path.join( 'output', 'ps3-4-b-1.png'), D_L )
    cv2.imwrite( os.path.join( 'output', 'ps3-4-b-2.png'), D_R )
    
    # Contrast
    L = cv2.imread( os.path.join('input', 'pair1-L.png'), 0) * (1/255.)
    R = cv2.imread( os.path.join('input', 'pair1-R.png'), 0) * (1/255.)

    # Boost contrast in right image
    R = 1.10*R
    R[ R > 1.0 ] = 1.0
    
    D_L = disparity_ncorr( np.float32(L), np.float32(R) )
    D_R = disparity_ncorr( np.float32(R), np.float32(L) )
    
    D_L = cv2.normalize( D_L, D_L, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    D_R = cv2.normalize( D_R, D_R, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    cv2.imwrite( os.path.join( 'output', 'ps3-4-b-3.png'), D_L )
    cv2.imwrite( os.path.join( 'output', 'ps3-4-b-4.png'), D_R )
    '''
    # 5
    # TODO: Apply stereo matching to pair2 images, try pre-processing the images for best results
    L = cv2.imread( os.path.join('input', 'pair2-L.png'), 0) * (1/255.)
    R = cv2.imread( os.path.join('input', 'pair2-R.png'), 0) * (1/255.)
    
    # Preprocess
    # Smooth the image
    L_smoothed = cv2.GaussianBlur(L, (5,5), 5)
    R_smoothed = cv2.GaussianBlur(R, (5,5), 5)
    
    D_L = disparity_ncorr( np.float32(L_smoothed), np.float32(R_smoothed), 5 )
    D_R = disparity_ncorr( np.float32(R_smoothed), np.float32(L_smoothed), 5 )
    
    D_L = cv2.normalize( D_L, D_L, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    D_R = cv2.normalize( D_R, D_R, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    cv2.imwrite( os.path.join( 'output', 'ps3-5-a-1.png'), D_L )
    cv2.imwrite( os.path.join( 'output', 'ps3-5-a-2.png'), D_R )
    

if __name__ == "__main__":
    main()
