import numpy as np
import cv2

import os
import sys

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
        # Just use a rigid transform (translation, rotation)
        transformMatrix = cv2.estimateRigidTransform(prevPts, nextPts, fullAffine=False)
        # For future work, try doing a full homography
        
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
    crop_size = 30
    fourcc = cv2.cv.CV_FOURCC('D','I','V','X')
    video_out = cv2.VideoWriter('output.avi', 
                                 fourcc,
                                 30,
                                 (frame1.shape[1]-2*crop_size, frame1.shape[0]-2*crop_size)    )
    
    # Return video reading to the beginning
    video.set(cv2.cv.CV_CAP_PROP_POS_FRAMES, 0)
    for i in range(int(numFrames)-1):
        # Get the frame and make sure it is valid
        retval, frame = video.read()
        if retval == False:
            break;
        
        # Construct the transform
        transform_temp = np.zeros( (2, 3) )
        transform_temp[0,0] =  np.cos(da[i])
        transform_temp[0,1] = -np.sin(da[i])
        transform_temp[1,0] =  np.sin(da[i])
        transform_temp[1,1] =  np.cos(da[i])
        
        transform_temp[0,2] = new_dx[i]
        transform_temp[1,2] = new_dy[i]
        
        # Apply the transform
        frame_warp = cv2.warpAffine(frame, transform_temp, dsize=(frame.shape[1], frame.shape[0]))
        
        # Crop frame 
        frame_warp = frame_warp[crop_size:frame_warp.shape[0]-crop_size, crop_size:frame_warp.shape[1]-crop_size]
        
        #cv2.imwrite( '..\\video\\output\\frame' + str(i) + '.png', frame_warp)
        video_out.write(frame_warp)
    #end for
    video.release()
    video_out.release()
    
#end main


if __name__ == "__main__":
    main()