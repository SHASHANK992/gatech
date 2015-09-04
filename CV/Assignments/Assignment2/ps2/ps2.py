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
    print radius
    # Create accumulator array (same size as original image)
    H = np.zeros( img_edges.shape )
    theta_res = pi/90
    theta = np.arange(0, 2*pi, theta_res)
    
    y_vals, x_vals = np.nonzero(img_edges)
    
    # For every edge pixel
    for i in range( len(x_vals) ):
        x = x_vals[i]
        y = y_vals[i]
        # For every possible gradient direction
        for t in range( len(theta) ):
            a = x - radius*cos( theta[t] )
            b = y + radius*sin( theta[t] )
            if not(a >= img_edges.shape[1] or b >= img_edges.shape[0]):         
                H[b,a] += 1
        #endfor
    #endfor    

    return H
#end hough_circles_acc


def hough_peaks(H, Q, threshold = 0):
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
    
    # First, threshold the accumulator array
    H[ H <= threshold ] = 0  
    
    indices = H.ravel().argsort()[-Q:]
    indices = (np.unravel_index(i,H.shape) for i in indices)
    
    peaks = np.array([])
    for i in indices:
        if  H[i[0], i[1]] != 0:
            peaks = np.append( peaks, [ i[0], i[1] ] )
    
    peaks = np.reshape( peaks, (len(peaks)/2 ,2) )          
    
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
        
    for peak in peaks:
        a = cos( theta[ peak[1] ] )
        b = sin( theta[ peak[1] ] )
        
        x0 = a*rho[ peak[0] ]
        y0 = b*rho[ peak[0] ]
        x1 = int( x0 + 1000*(-b) )
        y1 = int(y0 + 1000*a)
        x2 = int(x0-1000*(-b))
        y2 = int(y0-1000*a)
        
        cv2.line( img_out, (x1,y1), (x2,y2), (0,255,0), 2)       
    #endfor
        
    pass
    
def hough_circles_draw(img_out, peaks, radius):
    """ Draw circles on image corresponding to accumulator peaks"""
    
    for peak in peaks:
        a = peak[0]
        b = peak[1]
        
        cv2.circle( img_out, ( int(b), int(a) ), radius, 255 )
    #endfor
    
    pass
    
def find_circles( img_edges, radii ):
    """ Iterate through edges and find circles """
    
    # Create vector of radii (inclusive)
    r_vector = np.arange( radii[0], radii[1]+1, 1)
    centers_exist = []
    
    r_exist = []
    j = 0
        
    for i in range(len(r_vector)):
        # Generate Hough accumulator array
        r = r_vector[i]
        H = hough_circles_acc(img_edges, r)
        centers = hough_peaks( H, 10, 55 )
        
        if len(centers) > 0:
            r_exist.append( r )
            
            temp = []
        
            # We have the centers as a numpy array
            # To return it, I want to take the centers and turn them into tuples
            # putting all the centers for a given radius in the same row
            for j in range( centers.shape[0] ):
                temp.append( (centers[j,0], centers[j,1]) )
            #end for 
            centers_exist.append(  temp  )            
        #end if       
    #end for   
    
    return centers_exist, r_exist

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
    peaks = hough_peaks(H, 10, 100)  # TODO: implement this, try different parameters
    #lines = cv2.HoughLines(img_edges, 1, pi/180, 200)

    # TODO: Store a copy of accumulator array image (from 2-a), with peaks highlighted, as ps2-2-b-1.png 
    cv2.imwrite( os.path.join( output_dir, 'ps2-2-b-1.png'), highlight_peaks(H, peaks, rho, theta) )

    # 2-c
    # Draw lines corresponding to accumulator peaks
    img_out = cv2.cvtColor(img, cv2.COLOR_GRAY2BGR)  # copy & convert to color image
    hough_lines_draw(img_out, peaks, rho, theta)  # TODO: implement this
    cv2.imwrite( os.path.join(output_dir, 'ps2-2-c-1.png'), img_out )  # save as ps2-2-c-1.png
   
    #***********************************************************************************
    # 3-a
    # TODO: Read ps2-input0-noise.png, compute smoothed image using a Gaussian filter
    img_noise = cv2.imread(os.path.join(input_dir, 'ps2-input0-noise.png'), 0)
    img_smoothed =  cv2.GaussianBlur(img_noise, (5,5), 5)
    cv2.imwrite( os.path.join(output_dir, 'ps2-3-a-1.png'), img_smoothed )

    #************************************
    # 3-b
    # TODO: Compute binary edge images for both original image and smoothed version
    img_edges_noise = cv2.Canny(img_noise, 100, 300)
    cv2.imwrite( os.path.join(output_dir, 'ps2-3-b-1.png'), img_edges_noise )
    img_edges_smooth = cv2.Canny(img_smoothed, 100, 250)
    cv2.imwrite( os.path.join(output_dir, 'ps2-3-b-2.png'), img_edges_smooth )

    #************************************
    # 3-c
    # TODO: Apply Hough methods to smoothed image, tweak parameters to find best lines
    H, rho, theta = hough_lines_acc(img_edges_smooth)
    peaks = hough_peaks(H,10, 80)
   
    cv2.imwrite( os.path.join(output_dir, 'ps2-3-c-1.png'), highlight_peaks(H, peaks, rho, theta) )
    
    hough_lines_draw(img_noise, peaks, rho, theta)
    cv2.imwrite( os.path.join(output_dir, 'ps2-3-c-2.png'), img_noise )    
    
    #****************************************************************************
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
    peaks = hough_peaks(H, 10, 75)
    
    cv2.imwrite( os.path.join(output_dir, 'ps2-4-c-1.png'), highlight_peaks(H, peaks, rho, theta) )
    
    hough_lines_draw(img, peaks, rho, theta)
    cv2.imwrite( os.path.join(output_dir, 'ps2-4-c-2.png'), img)
    #********************************************************************************
 
    # 5
    # 5a
    #read
    img = cv2.imread( os.path.join(input_dir, 'ps2-input1.png'), 0 )
    # Smooth
    img_smoothed = cv2.GaussianBlur( img, (5,5), 3)
    cv2.imwrite( os.path.join(output_dir, 'ps2-5-a-1.png'), img_smoothed )
    #edges
    img_edges = cv2.Canny( img_smoothed, 100, 200 )
    cv2.imwrite( os.path.join(output_dir, 'ps2-5-a-2.png'), img_edges )
    # Find and draw circles    
    H = hough_circles_acc(img_edges, 20)
    peaks = hough_peaks(H,10,55)   
    hough_circles_draw(img, peaks, 20) 
    cv2.imwrite( os.path.join(output_dir, 'ps2-5-a-3.png'), img ) 
    
    #******************************* 
 
    # 5b
    #read
    img = cv2.imread( os.path.join(input_dir, 'ps2-input1.png'), 0 )
    # Smooth
    img_smoothed = cv2.GaussianBlur( img, (5,5), 3)
    cv2.imwrite( os.path.join(output_dir, 'ps2-5-b-1.png'), img_smoothed )
    #edges
    img_edges = cv2.Canny( img_smoothed, 100, 200 )
    cv2.imwrite( os.path.join(output_dir, 'ps2-5-b-2.png'), img_edges )
    centers, radii = find_circles(img_edges, (20,50))
    
    # For each radius, draw the circles
    for i in range(len(radii)):
        # Convert centers list to numpy array
        c_array = np.zeros( ( len(centers[i]), 2 ) )       
        for j in range( len(centers[i]) ):
            c_array[j,0] = centers[i][j][0]
            c_array[j,1] = centers[i][j][1]
        #end for  
        hough_circles_draw( img, c_array, radii[i] )
    #end for
    
    cv2.imwrite( os.path.join(output_dir, 'ps2-5-b-3.png'), img )
    
    '''
    #***********************************************************************************
    
    # 6
    # TODO: Find lines a more realtistic image, ps2-input2.png
    # 6a
    img = cv2.imread( os.path.join(input_dir, 'ps2-input2.png'), 0 )
    # Smooth 
    img_smoothed = cv2.GaussianBlur( img, (5,5), 3)
    # Edges
    img_edges = cv2.Canny( img_smoothed, 100, 200)
    # Save copy for my experimentation
    cv2.imwrite( os.path.join(output_dir, 'jrk_test.png'), img_edges )
    # Find and draw lines
    H, rho, theta = hough_lines_acc( img_edges )
    peaks = hough_peaks(H, 10)
    hough_lines_draw( img_smoothed, peaks, rho, theta )
    cv2.imwrite( os.path.join(output_dir, 'ps2-6-a-1.png'), img_smoothed )
    
    #*******************************
    # 6c - better part to 6a
    img = cv2.imread( os.path.join(input_dir, 'ps2-input2.png'), 0 )
    # Smooth 
    img_smoothed = cv2.GaussianBlur( img, (5,5), 3)
    # Edges
    img_edges = cv2.Canny( img_smoothed, 100, 200)
    # Save copy for my experimentation
    #cv2.imwrite( os.path.join(output_dir, 'jrk_test.png'), img_edges )
    # Find and draw lines
    H, rho, theta = hough_lines_acc( img_edges )
    peaks = hough_peaks(H, 10)
    hough_lines_draw( img_smoothed, peaks, rho, theta )
    cv2.imwrite( os.path.join(output_dir, 'ps2-6-a-2.png'), img_smoothed )

    #*************************************************************************************
    # 7
    # TODO: Find circles in the same realtistic image, ps2-input2.png
    # centers, radii = find_circles(img_edges, (20,50) )
    #*************************************************************************************

    # 8
    # TODO: Find lines and circles in distorted image, ps2-input3.png
    img = cv2.imread( os.path.join(input_dir, 'ps2-input3.png'), 0 )
    # Smooth 
    img_smoothed = cv2.GaussianBlur( img, (5,5), 3)
    # Edges
    img_edges = cv2.Canny( img_smoothed, 100, 200)
    # Save copy for my experimentation
    #cv2.imwrite( os.path.join(output_dir, 'jrk_test.png'), img_edges )
    # Find and lines
    H, rho, theta = hough_lines_acc( img_edges )
    peaks = hough_peaks(H, 10)
    # Find circles
    
    # Draw circles and lines
    hough_lines_draw( img_smoothed, peaks, rho, theta )
    cv2.imwrite( os.path.join(output_dir, 'ps2-8-a-1.png'), img_smoothed )
    '''

if __name__ == "__main__":
    main()
