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
    transforms = np.zeros( (3, 3, numFrames-1) )
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
        transformMatrix, mask = cv2.findHomography(prevPts, nextPts, method=cv2.RANSAC, ransacReprojThreshold=5.0)
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
    
    transforms_cum = np.zeros( (3,3, transforms.shape[2]) )
    
    transforms_sum = np.zeros( (3,3) )
    for i in range(transforms.shape[2]):
        transforms_sum += transforms[:,:,i]
        transforms_cum[:,:,i] = transforms_sum
    #end for
    
    #*******************************************************
    # Smooth camera path
    #*******************************************************
    # Now that we have all the transformations, use a moving average window to calculate the
    # better camera path
    smooth = np.zeros(transforms_cum.shape)
    smooth[0,0,:] = moving_avg(transforms_cum[0,0,:], 50)
    smooth[0,1,:] = moving_avg(transforms_cum[0,1,:], 50)
    smooth[0,2,:] = moving_avg(transforms_cum[0,2,:], 50)
    smooth[1,0,:] = moving_avg(transforms_cum[1,0,:], 50)
    smooth[1,1,:] = moving_avg(transforms_cum[1,1,:], 50)
    smooth[1,2,:] = moving_avg(transforms_cum[1,2,:], 50)
    smooth[2,0,:] = moving_avg(transforms_cum[2,0,:], 50)
    smooth[2,1,:] = moving_avg(transforms_cum[2,1,:], 50)
    smooth[2,2,:] = moving_avg(transforms_cum[2,2,:], 50)
    
    #************************************************************
    # Compute new transforms using smoothed path
    #************************************************************
    new_transforms = np.zeros( transforms.shape )

    transform_sum = np.zeros( (3,3) )
    for i in range(transforms.shape[2]):
        # Keep track of where the camera position is
        transform_sum += transforms[:,:,i]
        
        # Find the difference between where the camera is and
        # where it should be (i.e, smoothed trajectory)
        diff_transform = smooth[:,:,i] - transforms[:,:,i]
        
        # Now use this difference with the old path to find
        # the new set of differences
        new_transforms[:,:,i] = transforms[:,:,i] + diff_transform
    #end for
    
    #********************************************
    # Apply new transforms to video
    #********************************************
    crop_size = 100
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
        
        # Apply the transform
        frame_warp = cv2.warpPerspective(frame, new_transforms[:,:,i], dsize=(frame.shape[1], frame.shape[0]) )
        
        # Crop frame 
        frame_warp = frame_warp[crop_size:frame_warp.shape[0]-crop_size, crop_size:frame_warp.shape[1]-crop_size]
        
        video_out.write(frame_warp)
    #end for
    video.release()
    video_out.release()
    
#end main


if __name__ == "__main__":
    main()