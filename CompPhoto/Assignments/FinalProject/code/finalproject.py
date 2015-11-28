import numpy as np
import cv2

import os
import sys

def moving_avg_poor(vector, window_size):
    returnVal = np.zeros(vector.shape)
    returnVal[0:window_size] = vector[0:window_size]

    time_cumsum = np.cumsum(vector, dtype=float)
    
    time_cumsum[window_size:] = time_cumsum[window_size:] - time_cumsum[:-window_size]
    
    return time_cumsum[window_size-1:] / window_size
#end moving_avg

def moving_avg(vector, window_size):
    '''
    Apply a moving average filter in both directions (i.e., filter window is centered)
    
    Inputs:
    vector: 1D stream of data
    window_size: size of averaging window. Note: This will be doubled because of the 2way 
                 nature of the averaging
    
    Returns:
    averaged data
    
    Notes
    To make the output vector the same size as the input vector, this 
    method implements a variation of the traditional moving average filter.
    '''
    avg_vec = np.zeros(vector.shape)
    
    # Iterate over all positions in the input vector
    for i in range(vector.shape[0]):
        curr_sum = 0
        count = 0
        # Iterate over a window within the input vector
        for j in range(-window_size, window_size):
            # For all the points that a valid within the window, average
            if(i+j >= 0 and i+j < vector.shape[0]):
                curr_sum += vector[i+j]
                count += 1
            #end if
        #end for
        
        avg_vec[i] = curr_sum / count
    #end for
    
    return avg_vec
#def moving_avg


def moving_avg_3d(arr, window_size):
    '''
    Input: arr - a 3 dimensional array
           window_size: the window over which you wish to use the moving average filter
    
    '''
    # I had trouble getting the multidimensional moving average filter working, so
    # I am just going to break the array into vectors and feed into the 1D filter
    
    averaged = np.zeros( arr.shape )
    
    for i in range(arr.shape[0]):
        for j in range(arr.shape[1]):
            # Take the time vector of the row and column and pass to 
            # the 1D moving average filter
            curr_vec = arr[i, j, :]
            avg_vec = moving_avg(curr_vec, window_size)
            averaged[i,j,:] = avg_vec
    #end for
    return averaged
#ennd moving_avg_3d


def main():
    #*******************************************
    # Getting started
    #*******************************************
    # Get video to stabilize from the commandn line
    filename = sys.argv[1]
    # Open video
    video = cv2.VideoCapture(filename)
    # Get the number of frames
    numFrames = video.get(cv2.cv.CV_CAP_PROP_FRAME_COUNT)


    #**************************************************************
    # Get the camera positions
    #**************************************************************
    # Take the first frame and determine good features to track
    retval, frame1 = video.read()

    # Make frame B&W for use with the features to track
    frame1_bw = cv2.cvtColor(frame1, cv2.COLOR_BGR2GRAY)
    # Determine good points to track
    # TODO: Tweak to optimize
    maxNumCorners = 200
    qualityLevel = 0.01
    minDistance = 30
    prevPts = cv2.goodFeaturesToTrack(frame1_bw, maxNumCorners, qualityLevel, minDistance )
    
    '''
    # Draw points on image
    frame1_copy = np.copy(frame1)
    for i in range(200):
        cv2.circle(frame1_copy, (prevPts[i,0,0], prevPts[i,0,1]), 2, (0,255,0))
    #end for
    cv2.imwrite('ptsToTrack.png', frame1_copy)
    '''
    
    # While there are still frames, iterate over the frames
    currIdx = 0
    transforms = np.zeros( (2, 3, numFrames-1) )
    retval, frame2 = video.read()
    while retval:
        nextPts, status, err = cv2.calcOpticalFlowPyrLK(frame1, frame2, prevPts)
                
        # Use the status flag to remove bad matches
        nextPts_lst = []
        prevPts_lst = []
        for i in range(status.shape[0]):
            if status[i]:
                nextPts_lst.append( nextPts[i] )
                prevPts_lst.append( prevPts[i] )
        #end for
        nextPts = np.array(nextPts_lst)
        prevPts = np.array(prevPts_lst)
        
        # Here I think I can compute the flow by taking the difference between the prevPts and nextPts vector
        # However, this would only be for illustrative purposes. It is not necessary for computing the transformation
        # matrix
        
        # Determine transformation from flow
        # Just use a rigid transform (translation, rotation, uniform scale)
        transformMatrix = cv2.estimateRigidTransform(prevPts, nextPts, fullAffine=False)
        
        # Add transformation matrix to list
        transforms[:,:,currIdx] = transformMatrix
        
        # Swap out frames and points
        frame1 = frame2
        retval, frame2 = video.read()
        # At first I thought I would take the initial set of points and use those for tracking
        # However, I think know it would be better to find the points at frame and track those, 
        # especially since the function to calculate optical flow supports this
        if retval:
            frame1_bw = cv2.cvtColor(frame1, cv2.COLOR_BGR2GRAY)
            prevPts = cv2.goodFeaturesToTrack(frame1_bw, maxNumCorners, qualityLevel, minDistance )
        
        currIdx += 1
    #end while
    
    #*********************************************************
    # Get the camera path from the differences
    #*********************************************************
    # At this point, we have the sequence of matrices that have the deltas between each frame
    # However, I need the actual path. 
    # Use the pairwise differences to build the actual camera path
    # TODO: CHECK THIS!
    # I think this is right
    dx = transforms[0,2,:]
    dy = transforms[1,2,:]
    da = np.arctan2(transforms[1,0,:], transforms[0,0,:])
    
    x_path = np.zeros(dx.shape)
    y_path = np.zeros(dy.shape)
    a_path = np.zeros(da.shape)
    x = 0.0
    y = 0.0
    a = 0.0
    for i in range(dx.shape[0]):
        x += dx[i]
        y += dy[i]
        a += da[i]
        
        x_path[i] = x
        y_path[i] = y
        a_path[i] = a
    #end for
    
    # Here would be a good place to save off the transform matrices so we can plot the paths
    #np.savetxt('xpath.txt', x_path)
    
    #*******************************************************
    # Smooth camera path
    #*******************************************************
    # Now that we have all the transformations, use a moving average window to calculate the
    # better camera path
    x_path_avg = moving_avg(x_path, 30)
    y_path_avg = moving_avg(y_path, 30)
    a_path_avg = moving_avg(a_path, 30)
    
    #np.savetxt('xpath_avg.txt', x_path_avg)
    
    #************************************************************
    # Compute new transforms using smoothed path
    #************************************************************
    new_dx = np.zeros(dx.shape)
    new_dy = np.zeros(dy.shape)
    new_da = np.zeros(da.shape)
    
    x = 0
    y = 0
    a = 0
    for i in range(dx.shape[0]):
        # Keep track of where the camera position is
        x += dx[i]
        y += dy[i]
        a += da[i]
        
        # Find the diffence between where the camera is and
        # where it should be (i.e, smoothed trajectory)
        diff_x = x_path_avg[i] - x
        diff_y = y_path_avg[i] - y
        diff_a = a_path_avg[i] - a
        
        # Now use this difference with the old path dx to find
        # the new set of differences
        new_dx[i] = dx[i] + diff_x
        new_dy[i] = dy[i] + diff_y
        new_da[i] = da[i] + diff_a
    #end for
    
    #********************************************
    # Apply new transforms to video
    #********************************************
    # Return video reading to the beginning
    video.set(cv2.CV_CAP_PROP_POS_FRAMES, 0)
    
    for i in range(numFrames-1):
        retval, frame = video.read()
        if retval == false:
            break;
        
        transform_temp = np.zeros( (2, 3) )
        transform_temp[0,0] =  cos(da[i])
        transform_temp[0,1] = -sin(da[i])
        transform_temp[1,0] =  sin(da[i])
        transform_temp[1,1] =  cos(da[i])
        
        transform_temp[0,2] = new_dx[i]
        transform_temp[1,2] = new_dy[i]
        
        frame_warp = cv2.warpAffine(frame, transform_temp, frame.shape)
        
        cv2.imwrite( '..\\video\\frame' + i + '.png', frame_warp)
        
    #end for
    
#end main


if __name__ == "__main__":
    main()