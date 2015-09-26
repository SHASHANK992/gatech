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
    # For all values less than threshold, set to zeros
    
    # Create list of indices for all values that are above threshold
    indices = np.where( R > threshold )
    
    # For each index, if there are no values greater than it within the window, add it to corners list
    for i in range(len(indices[0]):
        for j in range(len(indices[1])):
            r = indices[0][i]
            c = indices[1][j]
            val = R[r, c]
            
            max_val = val
            max_val_r = r
            max_val_c = c
            
            # For all values in window around (r,c), if value of R > val
    
            # The order might need reversed
            corners.append( (max_val_r, max_val_c) )
        #end for
    #end for
            
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
    image_out = cv2.cvtColor( image_out, cv2.CV_GRAY2RGB )
    
    for corner in corners:
        image_out = cv2.circle(image_out, corner, 1, (0, 255, 0) )
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


# Driver code
def main():
    # Note: Comment out parts of this code as necessary

    # 1a
    transA = cv2.imread(os.path.join(input_dir, "transA.jpg"), cv2.IMREAD_GRAYSCALE).astype(np.float_) / 255.0
    transA_Ix = gradientX(transA)  # TODO: implement this
    transA_Iy = gradientY(transA)  # TODO: implement this
    transA_pair = make_image_pair(transA_Ix, transA_Iy)  # TODO: implement this
    transA_pair_norm = 0
    transA_pair_norm = cv2.normalize( transA_pair, transA_pair_norm, 0, 255, cv2.NORM_MINMAX, cv2.CV_8UC1 )
    cv2.imwrite(os.path.join(output_dir, "ps5-1-a-1.png"), transA_pair_norm)  # Note: you may have to scale/type-cast image before writing
    
    # TODO: Similarly for simA.jpg
    
    # 1b
    transA_R = harris_response(transA_Ix, trans_Iy, np.ones((3, 3), dtype=np.float_) / 9.0, 0.04)  # TODO: implement this, tweak parameters for best response
    # TODO: Scale/type-cast response map and write to file

    # TODO: Similarly for transB, simA and simB (you can write a utility function for grouping operations on each image)
    '''
    # 1c
    transA_corners = find_corners(transA_R, 0.0, 2.5)  # TODO: implement this, tweak parameters till you get good corners
    transA_out = draw_corners(transA, transA_corners)  # TODO: implement this
    # TODO: Write image to file

    # TODO: Similarly for transB, simA and simB (write a utility function if you want)

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
