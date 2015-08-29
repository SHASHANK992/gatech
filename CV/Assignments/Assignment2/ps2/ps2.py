"""Problem Set 2: Edges and Lines."""

import numpy as np
import cv2

import os
from math import pi, cos, sin

np.set_printoptions(threshold=np.nan)

input_dir = "input"  # read images from os.path.join(input_dir, <filename>)
output_dir = "output"  # write images to os.path.join(output_dir, <filename>)

def hough_lines_acc(img_edges, rho_res=1, theta_res=pi/90):
    """Compute Hough Transform for lines on edge image.

    Parameters
    ----------
        img_edges: binary edge image
        rho_res: rho resolution (in pixels)
        theta_res: theta resolution (in radians)

    Returns
    -------
        H: Hough accumulator array
        rho: vector of rho values, one for each row of H
        theta: vector of theta values, one for each column of H
    """
    # TODO: Your code here
    
    # Instantiate accumulator array
    # The size of the accumulator is the max distance by the range of theta
    height, width = img_edges.shape
    max_d = np.ceil( np.sqrt( height**2 + width**2 ) )
    rho = np.arange(-max_d, max_d, rho_res)  
    theta = np.arange(-pi/2, pi/2, theta_res)
    H = np.zeros( (len(rho), len(theta)) )
    
    y_vals, x_vals = np.nonzero(img_edges)
    
    
    for i in range(len(x_vals)):
        x = x_vals[i]
        y = y_vals[i]
        
        for t in range(len(theta)):
            d = round( x*cos( theta[t] ) + y*sin(theta[t]) ) + max_d
            H[d, t] += 1 
    
    return H, rho, theta
#end hough_lines_acc


def hough_circles_acc(img_edges, radius):
    # Create accumulator array (same size as original image)
    H = np.zeros( img_edges.shape )
    theta_res = pi/90
    theta = np.arange(-pi, pi, theta_res)
    
    y_vals, x_vals = np.nonzero(img_edges)
    
    for i in range( len(x_vals) ):
        x = x_vals[i]
        y = y_vals[i]
        
        for t in range( len(theta) ):
            a = x - r*cos(t)
            b = y + r*sin(t)
            H[a,b] += 1
        #endfor
    #endfor    

    return H
#end hough_circles_acc


def hough_peaks(H, Q):
    """Find peaks (local maxima) in accumulator array.

    Parameters
    ----------
        H: Hough accumulator array
        Q: number of peaks to find (max)

    Returns
    -------
        peaks: Px2 matrix (P <= Q) where each row is a (rho_idx, theta_idx) pair
    """
    # TODO: Your code here
    
    # I think I will need to do a little extra work here
    # If I ask for 10 peaks, but there are only 5, I don't want
    # to return 10. I only want to return 5
    
    indices = H.ravel().argsort()[-Q:]
    indices = (np.unravel_index(i,H.shape) for i in indices)
    
    peaks = np.array([])
    for i in indices:
        peaks = np.append( peaks, [ i[0], i[1] ] )
    
    peaks = np.reshape(peaks, (Q,2))
    
    return peaks


def hough_lines_draw(img_out, peaks, rho, theta):
    """Draw lines on an image corresponding to accumulator peaks.

    Parameters
    ----------
        img_out: 3-channel (color) image
        peaks: Px2 matrix where each row is a (rho_idx, theta_idx) index pair
        rho: vector of rho values, such that rho[rho_idx] is a valid rho value
        theta: vector of theta values, such that theta[theta_idx] is a valid theta value
    """
    
    #height, width, channel = img_out.shape
    #max_d = np.ceil( np.sqrt( height**2 + width**2 ) )
    
    # For each peak, generate a line
    # I have a d and a theta. I need an x and y
    for peak in peaks:
               
        # We can't solve for x and y directly. We first have to set one,
        # and then we can solve for the other        
        x_start = 0
        y_start = 0
        
        x_end = 0
        y_end = 0
                
        # Horizontal line (i.e., theta = pi/2)
        if theta[ peak[1] ] == pi/2 or theta[ peak[1] ] == -pi/2:
            #print 'Theta is pi/2'
            # Find the value for x (it will be fixed) 
            x_start = rho[ peak[0] ]
            x_end = rho[ peak[0] ]
            
            # The y value will go from top to bottom
            y_start = 0
            y_end = img_out.shape[0]
            
        # Vertical line (theta = 0 or -pi)
        # Due to numerical imprecision, need to have a range
        elif theta[ peak[1] ] <= 0.1 or theta[peak[1]] >= -0.1 :
            #print 'theta is 0'
            # Find the value for y (it will be fixed)
            y_start = rho[ peak[0] ]
            y_end = rho[ peak[0] ]
            
            # The x value will from left to right
            x_start = 0
            x_end = img_out.shape[1]
                    
        # Diagonal line
        else:
            # The x values will go from side to side
            x_start = 0
            x_end = img_out.shape[1]
            
            # Calculate the y values
            y_start = (-rho[ peak[0] ])/ (sin( theta[ peak[1] ] ))
            y_end = x_end*cos( rho[ peak[0] ] ) - rho[ peak[0] ]*sin( theta[ peak[1] ] )
        
        #endif
        
        x_start = abs(int(x_start))
        x_end = abs(int(x_end))
        y_start = abs(int(y_start))
        y_end = abs(int(y_end))
        
        #print x_start, x_end, y_start, y_end
        
        cv2.line( img_out, (x_start, y_start), (x_end, y_end), (0, 255, 0) )
        
    #endfor
    
    
    pass  # TODO: Your code here (nothing to return, just draw on img_out directly)

def normalize_accum_array(H):
    """ Normalize a Hough Accumulator array
    
    Parameters
    ----------
        H: accumulator array
        
    Returns
    -------
        H_norm: Accumlator array normalized to be between 0 and 255
    """
    
    # We are supposed to map the minimum value to zero
    # Find the min value and subtract that from all the values
    min_array = np.amin(H)*np.ones(H.shape)
    H_norm = H - min_array
    
    # Now map the maximum value to 255
    H_norm = (255/np.amax(H_norm))*H_norm
    
    return H_norm.astype(np.uint8)
    
def highlight_peaks(H, peaks, rho, theta):
    """ highlights the peaks in accumulator array"""
    
    H_copy = np.copy(H)
    
    for peak in peaks:
        H_copy = cv2.circle( H_copy, ( int(peak[1]), int(peak[0]) ), 5, 255 )
        
    return H_copy    
#end highlight_peaks


def main():
    """Run code/call functions to solve problems."""

    # 1-a
    # Load the input grayscale image
    img = cv2.imread(os.path.join(input_dir, 'ps2-input0.png'), 0)  # flags=0 ensures grayscale

    # TODO: Compute edge image (img_edges)
    img_edges = cv2.Canny(img, 100, 200)    
    cv2.imwrite( os.path.join(output_dir, 'ps2-1-a-1.png'), img_edges)  # save as ps2-1-a-1.png

    # 2-a
    # Compute Hough Transform for lines on edge image
    H, rho, theta = hough_lines_acc(img_edges)  # TODO: implement this, try calling with different parameters

    # TODO: Store accumulator array (H) as ps2-2-a-1.png
    # Note: Write a normalized uint8 version, mapping min value to 0 and max to 255
    cv2.imwrite(os.path.join(output_dir, 'ps2-2-a-1.png'), normalize_accum_array(H))
    
    # 2-b
    # Find peaks (local maxima) in accumulator array
    peaks = hough_peaks(H, 10)  # TODO: implement this, try different parameters
    
    #lines = cv2.HoughLines(img_edges, 1, pi/180, 200)

    # TODO: Store a copy of accumulator array image (from 2-a), with peaks highlighted, as ps2-2-b-1.png 
    cv2.imwrite( os.path.join( output_dir, 'ps2-2-b-1.png'), highlight_peaks(H, peaks, rho, theta) )
    

    # 2-c
    # Draw lines corresponding to accumulator peaks
    img_out = cv2.cvtColor(img, cv2.COLOR_GRAY2BGR)  # copy & convert to color image
    hough_lines_draw(img_out, peaks, rho, theta)  # TODO: implement this
    cv2.imwrite( os.path.join(output_dir, 'ps2-2-c-1.png'), img_out )  # save as ps2-2-c-1.png
    

    # 3-a
    # TODO: Read ps2-input0-noise.png, compute smoothed image using a Gaussian filter
    img_noise = cv2.imread(os.path.join(input_dir, 'ps2-input0-noise.png'), 0)
    img_smoothed =  cv2.GaussianBlur(img_noise, (5,5), 5)
    cv2.imwrite( os.path.join(output_dir, 'ps2-3-a-1.png'), img_smoothed )

    # 3-b
    # TODO: Compute binary edge images for both original image and smoothed version
    img_edges_noise = cv2.Canny(img_noise, 100, 300)
    cv2.imwrite( os.path.join(output_dir, 'ps2-3-b-1.png'), img_edges_noise )
    img_edges_smooth = cv2.Canny(img_smoothed, 100, 250)
    cv2.imwrite( os.path.join(output_dir, 'ps2-3-b-2.png'), img_edges_smooth )

    # 3-c
    # TODO: Apply Hough methods to smoothed image, tweak parameters to find best lines
    H, rho, theta = hough_lines_acc(img_edges_smooth)
    peaks = hough_peaks(H,10)
    
    cv2.imwrite( os.path.join(output_dir, 'ps2-3-c-1.png'), highlight_peaks(H, peaks, rho, theta) )
    
    hough_lines_draw(img_noise, peaks, rho, theta)
    cv2.imwrite( os.path.join(output_dir, 'ps2-3-c-2.png'), img_noise )    

    # 4
    # TODO: Like problem 3 above, but using ps2-input1.png
    # 4a
    img = cv2.imread( os.path.join(input_dir, 'ps2-input1.png'), 0 )
    img_smoothed = cv2.GaussianBlur( img, (5,5), 3)
    cv2.imwrite( os.path.join(output_dir, 'ps2-4-a-1.png'), img_smoothed )
    
    # 4b
    img_edges = cv2.Canny( img_smoothed, 100, 200 )
    cv2.imwrite( os.path.join(output_dir, 'ps2-4-b-1.png'), img_edges )
    
    # 4c
    H, rho, theta = hough_lines_acc(img_edges)
    peaks = hough_peaks(H, 10)
    
    cv2.imwrite( os.path.join(output_dir, 'ps2-4-c-1.png'), highlight_peaks(H, peaks, rho, theta) )
    
    hough_lines_draw(img, peaks, rho, theta)
    cv2.imwrite( os.path.join(output_dir, 'ps2-4-c-2.png'), img)

    # 5
    # TODO: Implement Hough Transform for circles

    # 6
    # TODO: Find lines a more realtistic image, ps2-input2.png

    # 7
    # TODO: Find circles in the same realtistic image, ps2-input2.png

    # 8
    # TODO: Find lines and circles in distorted image, ps2-input3.png

if __name__ == "__main__":
    main()
