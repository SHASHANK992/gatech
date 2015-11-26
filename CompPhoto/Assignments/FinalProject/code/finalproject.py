import numpy as np
import cv2

import os
import sys

def moving_avg(arr, window_size):
    # Average along the depths of the array (i.e, along the time axis)
    time_cumsum = np.cumsum(arr, axis=2, dtype=float)
    
    time_cumsum[:,:,window_size:] = time_cumsum[:,:,window_size:] - time_cumsum[:,:,:-window_size]
    
    return time_cumsum[:,:,window_size-1:] / window_size
#end moving_avg



def main:
    # Get video to stabilize from the commandn line
    filename = sys.argv[1]
    
    # Open video
    video = cv2.VideoCapture(filename)
    # Get the number of frames
    numFrames = video.get(CV_CAP_PROP_FRAME_COUNT)
    
    # Take the first frame and determine good features to track
    retval, frame1 = video.read()
    
    # Determine good points to track
    maxNumCorners = 200
    qualityLevel = 1
    minDistance = 10
    prevPts = cv2.goodFeaturesToTrack(ff, maxNumCorners, qualityLevel, minDistance )
    
    # While there are still frames, iterate over the frames
    currIdx = 0
    transforms = np.zeros( (2, 3, numFrames-1) )
    retval, frame2 = video.read()
    while retval:
        nextPts, status, err = cv2.calcOpticalFlowPyrLK(frame1, frame2, prevPts, flags=OPTFLOW_USE_INITIAL_FLOW)
        
        # Here I think I can compute the flow by taking the difference between the prevPts and nextPts vector
        # However, this would only be for illustrative purposes. It is not necessary for computing the transformation
        # matrix
        
        # Determine transformation from flow
        # Just use a rigid transform (translation, rotation, uniform scale)
        transformMatrix = cv2.estimateRigidTransform(prevPts, nextPts, fullAffine=false)
        
        # Add transformation matrix to list
        transforms[:,:,currIdx] = transformMatrix
        
        # Swap out frames and points
        nextPts = prevPts
        frame1 = frame2
        retval, frame2 = video.read()
        currIdx += 1
    #end while
    
    # Here would be a good place to save off the transform matrices so we can plot the paths
    
    # Now that we have all the transformations, use a moving average window to calculate the
    # better camera path
    
    
    # Compute new transforms using new path
    
    # Apply transform


#end main


if __name__ == "__main__":
    main()