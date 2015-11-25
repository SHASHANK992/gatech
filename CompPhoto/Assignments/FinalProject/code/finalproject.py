import numpy as np
import cv2

import os






def main:
    # Ask for video to stabilize from user
    
    # Determine good points to track
    cv2.goodFeaturesToTrack()
    
    
    # Determine flow
    cv2.calcOpticalFlowLK()
    
    # Determine transformation from flow
    # For now this will just be translation and rotation (rigid transform)
    cv2.estimateRigidTransform()
    
    # Accumulate transforms and smooth to determine new path
    # Use moving average window
    
    # Compute new transforms using new path
    
    # Apply transform


#end main


if __name__ == "__main__":
    main()