"""Problem Set 3: Window-based Stereo Matching."""

import numpy as np
import cv2

import os

input_dir = "input"  # read images from os.path.join(input_dir, <filename>)
output_dir = "output"  # write images to os.path.join(output_dir, <filename>)

def disparity_ssd(L, R):
    """Compute disparity map D(y, x) such that: L(y, x) = R(y, x + D(y, x))
    
    Params:
    L: Grayscale left image, in range [0.0, 1.0]
    R: Grayscale right image, same size as L

    Returns: Disparity map, same size as L, R
    """
    
    D = np.zeros(L.shape)
    window_size = 1
    for j in range(L.shape[0]-window_size):
        for i in range( L.shape[1]-window_size):
            
        #end for
    #end for
        
        

    return D


def disparity_ncorr(L, R):
    """Compute disparity map D(y, x) such that: L(y, x) = R(y, x + D(y, x))
    
    Params:
    L: Grayscale left image, in range [0.0, 1.0]
    R: Grayscale right image, same size as L

    Returns: Disparity map, same size as L, R
    """
    D = np.zero(L.shape)
    D = cv2.matchTemplate(L, R, CV_TM_CCORR_NORMED)
    
    return D


def main():
    """Run code/call functions to solve problems."""

    # 1-a
    # Read images
    L = cv2.imread(os.path.join('input', 'pair0-L.png'), 0) * (1 / 255.0)  # grayscale, scale to [0.0, 1.0]
    R = cv2.imread(os.path.join('input', 'pair0-R.png'), 0) * (1 / 255.0)

    # Compute disparity (using method disparity_ssd defined in disparity_ssd.py)
    D_L = disparity_ssd(L, R)  # TODO: implemenet disparity_ssd()
    D_R = disparity_ssd(R, L)

    # TODO: Save output images (D_L as output/ps3-1-a-1.png and D_R as output/ps3-1-a-2.png)
    # Note: They may need to be scaled/shifted before saving to show results properly
    # Since we converted it to the range [0,1], we need to scale back up.
    cv2.imwrite( os.path.join( 'output', 'ps3-1-a-1.png'), D_L*255 )
    cv2.imwrite( os.path.join( 'output', 'ps3-1-a-2.png'), D_R*255 )

    # 2
    # TODO: Apply disparity_ssd() to pair1-L.png and pair1-R.png (in both directions)
    L = cv2.imread( os.path.join('input', 'pair1-L.png'), 0) * (1/255.)
    R = cv2.imread( os.path.join('input', 'pair1-R.png'), 0) * (1/255.)
    
    D_L = disparity_ssd(L, R)
    D_R = disparity_ssd(R, L)
    
    cv2.imwrite( os.path.join( 'output', 'ps3-2-a-1.png'), D_L*255 )
    cv2.imwrite( os.path.join( 'output', 'ps3-2-a-2.png'), D_R*255 )

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
    
    cv2.imwrite( os.path.join( 'output', 'ps3-3-a-1.png'), D_L*255 )
    cv2.imwrite( os.path.join( 'output', 'ps3-3-a-2.png'), D_R*255 )
    
    # TODO: Boost contrast in one image and apply again
    L = cv2.imread( os.path.join('input', 'pair1-L.png'), 0) * (1/255.)
    R = cv2.imread( os.path.join('input', 'pair1-R.png'), 0) * (1/255.)
    
    # Boost contrast in right image
    R = 1.10*R
    R = R * (1/1.10) # Scale back to [0,1]
    
    D_L = disparity_ssd(L, R)
    D_R = disparity_ssd(R, L)
    
    cv2.imwrite( os.path.join( 'output', 'ps3-3-b-1.png'), D_L*255 )
    cv2.imwrite( os.path.join( 'output', 'ps3-3-b-2.png'), D_R*255 )    

    # 4
    # TODO: Implement disparity_ncorr() and apply to pair1 images (original, noisy and contrast-boosted)
    # Normal
    L = cv2.imread(os.path.join('input', 'pair1-L.png'), 0) * (1 / 255.0)
    R = cv2.imread(os.path.join('input', 'pair1-R.png'), 0) * (1 / 255.0)
    
    D_L = disparity_ncorr(L,R)
    D_R = disparity_ncorr(R,L)
    
    cv2.imwrite( os.path.join( 'output', 'ps3-4-a-1.png'), D_L*255 )
    cv2.imwrite( os.path.join( 'output', 'ps3-4-a-2.png'), D_R*255 )
    
    # Noisy
    L = cv2.imread( os.path.join('input', 'pair1-L.png'), 0) * (1/255.)
    R = cv2.imread( os.path.join('input', 'pair1-R.png'), 0) * (1/255.)
    
    # Add noise to left image
    sigma = 10
    noise = np.random.normal(0, sigma, L.shape)
    L = L + noise
    
    D_L = disparity_ncorr(L,R)
    D_R = disparity_ncorr(R,L)
    
    cv2.imwrite( os.path.join( 'output', 'ps3-4-b-1.png'), D_L*255 )
    cv2.imwrite( os.path.join( 'output', 'ps3-4-b-2.png'), D_R*255 )
    
    # Contrast
    L = cv2.imread( os.path.join('input', 'pair1-L.png'), 0) * (1/255.)
    R = cv2.imread( os.path.join('input', 'pair1-R.png'), 0) * (1/255.)

    # Boost contrast in right image
    R = 1.10*R
    R = R * (1/1.10) # Scale back to [0,1]
    
    D_L = disparity_ncorr(L,R)
    D_R = disparity_ncorr(R,L)
    
    cv2.imwrite( os.path.join( 'output', 'ps3-4-b-3.png'), D_L*255 )
    cv2.imwrite( os.path.join( 'output', 'ps3-4-b-4.png'), D_R*255 )
    
    # 5
    # TODO: Apply stereo matching to pair2 images, try pre-processing the images for best results
    L = cv2.imread( os.path.join('input', 'pair2-L.png'), 0) * (1/255.)
    R = cv2.imread( os.path.join('input', 'pair2-R.png'), 0) * (1/255.)
    
    # Preprocess
    
    D_L = disparity_ncorr(L,R)
    D_R = disparity_ncorr(R,L)
    
    cv2.imwrite( os.path.join( 'output', 'ps3-5-a-1.png'), D_L*255 )
    cv2.imwrite( os.path.join( 'output', 'ps3-5-a-2.png'), D_R*255 )


if __name__ == "__main__":
    main()
