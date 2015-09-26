"""Problem Set 5: Harris, SIFT, RANSAC."""

import numpy as np
import cv2

import os

# I/O directories
input_dir = "input"
output_dir = "output"


# Assignment code
def gradientX(image):
    """Compute image gradient in X direction.

    Parameters
    ----------
        image: grayscale floating-point image, values in [0.0, 1.0]

    Returns
    -------
        Ix: image gradient in X direction, values in [-1.0, 1.0]
    """

    # TODO: Your code here
    Ix = cv2.Sobel( image, cv2.CV_64F, 1, 0)
    
    return Ix


def gradientY(image):
    """Compute image gradient in Y direction.

    Parameters
    ----------
        image: grayscale floating-point image, values in [0.0, 1.0]

    Returns
    -------
        Iy: image gradient in Y direction, values in [-1.0, 1.0]
    """

    # TODO: Your code here
    Iy = cv2.Sobel( image, cv2.CV_64F, 0, 1)

    return Iy


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
        image_pair[0:image2.shape[0],image1.shape[1]+1:c,:] = image2[:,:,:]
    else:
        image_pair = np.zeros( (r,c) )
        image_pair[ 0:image1.shape[0], 0:image1.shape[1] ] = image1[:,:]
        image_pair[ 0:image2.shape[0], image1.shape[1]:c ] = image2[:,:] 
    #end if  
    return image_pair


def harris_response(Ix, Iy, kernel, alpha):
    """Compute Harris reponse map using given image gradients.

    Parameters
    ----------
        Ix: image gradient in X direction, values in [-1.0, 1.0]
        Iy: image gradient in Y direction, same size and type as Ix
        kernel: 2D windowing kernel with weights, typically square
        alpha: Harris detector parameter multiplied with square of trace

    Returns
    -------
        R: Harris response map, same size as inputs, floating-point
    """

    # TODO: Your code here
    # Note: Define any other parameters you need locally or as keyword arguments
    # Copy Ix and Iy
    extendBound = max( kernel.shape[0], kernel.shape[1] )
    Ix_copy = np.copy(Ix)
    Iy_copy = np.copy(Iy)
    #Extend copies
    Ix_copy = cv2.copyMakeBorder( Ix_copy, 0, extendBound, 0, extendBound, cv2.BORDER_REFLECT )
    Iy_copy = cv2.copyMakeBorder( Iy_copy, 0, extendBound, 0, extendBound, cv2.BORDER_REFLECT )
    
    R = np.zeros( Ix.shape )    
    # For every pixel in image
    for u in range( Ix.shape[0] ):
        for v in range( Ix.shape[1]):            
            # Compute M
            M = np.zeros((2,2), dtype=np.float_)
            for x in range(kernel.shape[0]):
                for y in range(kernel.shape[1]):
                    M = M + kernel[x,y]*np.array([ [(Ix_copy[u+x, v+y])**2,              Ix_copy[u+x, v+y]*Iy_copy[u+x, v+y]], 
                                                   [Ix_copy[u+x, v+y]*Iy_copy[u+x, v+y], (Iy_copy[u+x, v+y])**2]               ])
                #end for
            # end for
                        
            # Compute R from M
            R[u,v] = np.linalg.det(M) - alpha*(np.trace(M)**2)
        #end for
    #end for
    
    return R


def find_corners(R, threshold, radius):
    """Find corners in given response map.

    Parameters
    ----------
        R: floating-point response map, e.g. output from the Harris detector
        threshold: response values less than this should not be considered plausible corners
        radius: radius of circular region for non-maximal suppression (could be half the side of square instead)

    Returns
    -------
        corners: peaks found in response map R, as a sequence (list) of (x, y) coordinates
    """

    # TODO: Your code here
    corners = []
    
    # Make radius odd
    r_copy = int(np.copy(radius))
    if r_copy % 2 == 0:
        r_copy += 1
    # Purposely truncate
    radius_half = r_copy/2
    
    # Create list of indices for all values that are above threshold
    # np.where outputs two lists, one with the rows and one with the columns
    indices = np.where( R > threshold )
    
    # For each index, build a box around it of according to radius
    boxes = np.zeros( (len(indices[0])*len(indices[1]), 4) )
    box_pos = 0
    for x in range( len(indices[0]) ):
        for y in range( len(indices[1]) ):
            r = indices[0][x]
            c = indices[1][y]
            
            # If the box of size radius around the index is entirely 
            # in the image, make the box of that size centered around
            # the index
            if( r-radius_half > 0 and r+radius_half < R.shape[0] and c-radius_half > 0 and c+radius_half < R.shape[1] ):
                boxes[box_pos, 0] = r-radius_half
                boxes[box_pos, 1] = c-radius_half
                boxes[box_pos, 2] = r+radius_half
                boxes[box_pos, 3] = c+radius_half
            # If the box does not fit, go the boundaries instead
            
            box_pos += 1
        #end for
    #end for
    
    # We now of an array defining bounding boxes
    # Use Adrian Rosebrock's nms algorithm to find boxes that belong
    real_boxes = non_max_suppression( boxes, 1 )
    
    # For all the real boxes, determine the actual index
    for i in range(real_boxes.shape[0] ):
        r = real_boxes[i, 0] + radius_half
        c = real_boxes[i, 1] + radius_half
        
        corners.append( (r, c) )
            
    return corners


def draw_corners(image, corners):
    """Draw corners on (a copy of) given image.

    Parameters
    ----------
        image: grayscale floating-point image, values in [0.0, 1.0]
        corners: peaks found in response map R, as a sequence (list) of (x, y) coordinates

    Returns
    -------
        image_out: copy of image with corners drawn on it, color (BGR), uint8, values in [0, 255]
    """

    # TODO: Your code here
    image_out = np.copy(image)
    image_out = cv2.normalize( image_out, image_out, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    image_out = cv2.cvtColor( image_out, cv2.COLOR_GRAY2RGB )
    
    for corner in corners:
        coord = ( corner[1], corner[0] )
        image_out = cv2.circle(image_out, coord, 1, (0, 255, 0) )
    #end for
    
    return image_out


def gradient_angle(Ix, Iy):
    """Compute angle (orientation) image given X and Y gradients.

    Parameters
    ----------
        Ix: image gradient in X direction
        Iy: image gradient in Y direction, same size and type as Ix

    Returns
    -------
        angle: gradient angle image, each value in degrees [0, 359)
    """

    # TODO: Your code here
    # Note: +ve X axis points to the right (0 degrees), +ve Y axis points down (90 degrees)
    return angle


def get_keypoints(points, R, angle, _size, _octave=0):
    """Create OpenCV KeyPoint objects given interest points, response and angle images.

    Parameters
    ----------
        points: interest points (e.g. corners), as a sequence (list) of (x, y) coordinates
        R: floating-point response map, e.g. output from the Harris detector
        angle: gradient angle (orientation) image, each value in degrees [0, 359)
        _size: fixed _size parameter to pass to cv2.KeyPoint() for all points
        _octave: fixed _octave parameter to pass to cv2.KeyPoint() for all points

    Returns
    -------
        keypoints: a sequence (list) of cv2.KeyPoint objects
    """

    # TODO: Your code here
    # Note: You should be able to plot the keypoints using cv2.drawKeypoints() in OpenCV 2.4.9+
    return keypoints


def get_descriptors(image, keypoints):
    """Extract feature descriptors from image at each keypoint.

    Parameters
    ----------
        keypoints: a sequence (list) of cv2.KeyPoint objects

    Returns
    -------
        descriptors: 2D NumPy array of shape (len(keypoints), 128)
    """

    # TODO: Your code here
    # Note: You can use OpenCV's SIFT.compute() method to extract descriptors, or write your own!
    return descriptors


def match_descriptors(desc1, desc2):
    """Match feature descriptors obtained from two images.

    Parameters
    ----------
        desc1: descriptors from image 1, as returned by SIFT.compute()
        desc2: descriptors from image 2, same format as desc1

    Returns
    -------
        matches: a sequence (list) of cv2.DMatch objects containing corresponding descriptor indices
    """

    # TODO: Your code here
    # Note: You can use OpenCV's descriptor matchers, or roll your own!
    return descriptors


def draw_matches(image1, image2, kp1, kp2, matches):
    """Show matches by drawing lines connecting corresponding keypoints.

    Parameters
    ----------
        image1: first image
        image2: second image, same type as first
        kp1: list of keypoints (cv2.KeyPoint objects) found in image1
        kp2: list of keypoints (cv2.KeyPoint objects) found in image2
        matches: list of matching keypoint index pairs (as cv2.DMatch objects)

    Returns
    -------
        image_out: image1 and image2 joined side-by-side with matching lines; color image (BGR), uint8, values in [0, 255]
    """

    # TODO: Your code here
    # Note: DO NOT use OpenCV's match drawing function(s)! Write your own :)
    return image_out


def compute_translation_RANSAC(kp1, kp2, matches):
    """Compute best translation vector using RANSAC given keypoint matches.

    Parameters
    ----------
        kp1: list of keypoints (cv2.KeyPoint objects) found in image1
        kp2: list of keypoints (cv2.KeyPoint objects) found in image2
        matches: list of matches (as cv2.DMatch objects)

    Returns
    -------
        translation: translation/offset vector <x, y>, NumPy array of shape (2, 1)
        good_matches: consensus set of matches that agree with this translation
    """

    # TODO: Your code here
    return translation, good_matches


def compute_similarity_RANSAC(kp1, kp2, matches):
    """Compute best similarity transform using RANSAC given keypoint matches.

    Parameters
    ----------
        kp1: list of keypoints (cv2.KeyPoint objects) found in image1
        kp2: list of keypoints (cv2.KeyPoint objects) found in image2
        matches: list of matches (as cv2.DMatch objects)

    Returns
    -------
        transform: similarity transform matrix, NumPy array of shape (2, 3)
        good_matches: consensus set of matches that agree with this transform
    """

    # TODO: Your code here
    return transform
    
def norm_and_save( img, filename ):
    normed = 0
    normed = cv2.normalize( img, normed, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1)
    cv2.imwrite( os.path.join(output_dir, filename), normed)
#end norm_and_save

# Taken from http://www.pyimagesearch.com/2015/02/16/faster-non-maximum-suppression-python/
def non_max_suppression(boxes, overlapThresh):
    # if there are no boxes, return an empty list
	if len(boxes) == 0:
		return []
 
	# if the bounding boxes integers, convert them to floats --
	# this is important since we'll be doing a bunch of divisions
	if boxes.dtype.kind == "i":
		boxes = boxes.astype("float")
 
	# initialize the list of picked indexes	
	pick = []
 
	# grab the coordinates of the bounding boxes
	x1 = boxes[:,0]
	y1 = boxes[:,1]
	x2 = boxes[:,2]
	y2 = boxes[:,3]
 
	# compute the area of the bounding boxes and sort the bounding
	# boxes by the bottom-right y-coordinate of the bounding box
	area = (x2 - x1 + 1) * (y2 - y1 + 1)
	idxs = np.argsort(y2)
    
    # keep looping while some indexes still remain in the indexes
	# list
	while len(idxs) > 0:
		# grab the last index in the indexes list and add the
		# index value to the list of picked indexes
		last = len(idxs) - 1
		i = idxs[last]
		pick.append(i)
 
		# find the largest (x, y) coordinates for the start of
		# the bounding box and the smallest (x, y) coordinates
		# for the end of the bounding box
		xx1 = np.maximum(x1[i], x1[idxs[:last]])
		yy1 = np.maximum(y1[i], y1[idxs[:last]])
		xx2 = np.minimum(x2[i], x2[idxs[:last]])
		yy2 = np.minimum(y2[i], y2[idxs[:last]])
 
		# compute the width and height of the bounding box
		w = np.maximum(0, xx2 - xx1 + 1)
		h = np.maximum(0, yy2 - yy1 + 1)
 
		# compute the ratio of overlap
		overlap = (w * h) / area[idxs[:last]]
 
		# delete all indexes from the index list that have
		idxs = np.delete(idxs, np.concatenate(([last],
			np.where(overlap > overlapThresh)[0])))
 
	# return only the bounding boxes that were picked using the
	# integer data type
	return boxes[pick].astype("int")


# Driver code
def main():
    # Note: Comment out parts of this code as necessary

    # 1a
    '''
    transA = cv2.imread(os.path.join(input_dir, "transA.jpg"), cv2.IMREAD_GRAYSCALE).astype(np.float_) / 255.0
    transA_Ix = gradientX(transA)  # TODO: implement this
    transA_Iy = gradientY(transA)  # TODO: implement this
    transA_pair = make_image_pair(transA_Ix, transA_Iy)  # TODO: implement this
    norm_and_save( transA_pair, "ps5-1-a-1.png" ) # Note: you may have to scale/type-cast image before writing
    '''
    check = cv2.imread( os.path.join(input_dir, "check_rot.bmp"), cv2.IMREAD_GRAYSCALE).astype(np.float_)/255.0
    check_Ix = gradientX(check)
    check_Iy = gradientY(check)
    check_pair = make_image_pair( check_Ix, check_Iy)
    norm_and_save( check_pair, "check-1a.png")
    
    '''
    # TODO: Similarly for simA.jpg
    simA = cv2.imread(os.path.join(input_dir, "simA.jpg"), cv2.IMREAD_GRAYSCALE).astype(np.float_)/255.0
    simA_Ix = gradientX(simA)
    simA_Iy = gradientY(simA)
    simA_pair = make_image_pair(simA_Ix, simA_Iy)
    norm_and_save( simA_pair, "ps5-1-a-2.png" )
    '''
    
    # 1b
    kernel = np.ones((3, 3), dtype=np.float_)/9.0
    '''
    transA_R = harris_response(transA_Ix, transA_Iy, kernel, 0.04)  # TODO: implement this, tweak parameters for best response
    # TODO: Scale/type-cast response map and write to file
    norm_and_save( transA_R, "ps5-1-b-1.png" )  
    '''
    check_R = harris_response(check_Ix, check_Iy, kernel, 0.04)
    norm_and_save(check_R, "check-1b.png")  

    # TODO: Similarly for transB, simA and simB (you can write a utility function for grouping operations on each image)
    
    # 1c
    print "Finding corners"
    '''
    transA_corners = find_corners(transA_R, 5.0, 2)  # TODO: implement this, tweak parameters till you get good corners
    transA_out = draw_corners(transA, transA_corners)  # TODO: implement this
    # TODO: Write image to file
    cv2.imwrite( os.path.join(output_dir, "ps5-1-c-1.png"), transA_out )
    '''
    check_corners = find_corners(check_R, 0.0, 2)
    check_out = draw_corners( check, check_corners)
    cv2.imwrite( os.path.join(output_dir, "check-1c.png"), check_out )

    # TODO: Similarly for transB, simA and simB (write a utility function if you want)
    '''
    # 2a
    transA_angle = gradient_angle(transA_Ix, transA_Iy)  # TODO: implement this
    transA_kp = get_keypoints(transA_corners, transA_R, transA_angle, _size=5.0, _octave=0)  # TODO: implement this, update parameters
    # TODO: Draw keypoints on transA
    # TODO: Similarly, find keypoints for transB and draw them
    # TODO: Combine transA and transB images (with keypoints drawn) using make_image_pair() and write to file

    # TODO: Ditto for (simA, simB) pair

    # 2b
    transA_desc = get_descriptors(transA, transA_kp)  # TODO: implement this
    # TODO: Similarly get transB_desc
    # TODO: Find matches: trans_matches = match_descriptors(transA_desc, transB_desc)
    # TODO: Draw matches and write to file: draw_matches(transA, transB, transA_kp, transB_kp, trans_matches)

    # TODO: Ditto for (simA, simB) pair (may have to vary some parameters along the way?)

    # 3a
    # TODO: Compute translation vector using RANSAC for (transA, transB) pair, draw biggest consensus set

    # 3b
    # TODO: Compute similarity transform for (simA, simB) pair, draw biggest consensus set

    # Extra credit: 3c, 3d, 3e
    '''

if __name__ == "__main__":
    main()
