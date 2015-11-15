"""Problem Set 8: Motion History Images."""

import numpy as np
import cv2

import os

# I/O directories
input_dir = "input"
output_dir = "output"


# Assignment code
class MotionHistoryBuilder(object):
    """Builds a motion history image (MHI) from sequential video frames."""

    def __init__(self, frame, **kwargs):
        """Initialize motion history builder object.

        Parameters
        ----------
            frame: color BGR uint8 image of initial video frame, values in [0, 255]
            kwargs: additional keyword arguments needed by builder, e.g. theta, tau
        """
        # TODO: Your code here - initialize variables, read keyword arguments (if any)
        self.mhi = np.zeros(frame.shape[:2], dtype=np.float_)  # e.g. motion history image
        self.threshold = kwargs.get('threshold', 127)
        self.tau       = kwargs.get('tau', 45)
        self.kernelSize = kwargs.get('kSize', 11)
        self.blurSigma = kwargs.get('blurSigma', 5.0)
        frame_bw = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
        self.old_frame = cv2.GaussianBlur(frame_bw, (self.kernelSize,self.kernelSize), self.blurSigma, borderType=cv2.BORDER_REFLECT)

    def process(self, frame):
        """Process a frame of video, return binary image indicating motion areas.

        Parameters
        ----------
            frame: color BGR uint8 image of current video frame, values in [0, 255]

        Returns
        -------
            motion_image: binary image (type: bool or uint8), values: 0 (static) or 1 (moving)
        """
        # TODO: Your code here - compute binary motion image, update MHI
        # Blur new frame
        frame_copy = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
        frame_copy = cv2.GaussianBlur(frame_copy, (self.kernelSize,self.kernelSize), self.blurSigma, borderType=cv2.BORDER_REFLECT)
        
        # compute absolute difference between old frame and new frame
        diff_img = abs(self.old_frame - frame_copy)
        
        # threshold
        motion_image = diff_img > self.threshold
        
        # Use morphological open operator to remove noise
        kernel = np.ones((7,7), dtype=np.uint8)
        motion_image = cv2.morphologyEx(motion_image.astype(np.uint8), cv2.MORPH_OPEN, kernel)
        # Dilate to "fill in" some of the gaps
        motion_image = cv2.dilate(motion_image.astype(np.uint8), kernel, iterations=1)
        
        # Update motion history image
        self.update_MHI(motion_image)
        
        # Set up for next image
        self.old_frame = frame_copy
        
        return motion_image  # note: make sure you return a binary image with 0s and 1s

    def update_MHI(self, motion_image):
        '''Updates the motion history image'''
        for i in range(self.mhi.shape[0]):
            for j in range(self.mhi.shape[1]):
                if motion_image[i, j] == 1:
                    self.mhi[i,j] = self.tau
                else:
                    self.mhi[i,j] = max(self.mhi[i,j]-1, 0)
                #end if
            #end for
        #end for
    #end update_MHI
    
    def get_MHI(self):
        """Return motion history image computed so far.

        Returns
        -------
            mhi: float motion history image, values in [0.0, 1.0]
        """
        # TODO: Make sure MHI is updated in process(), perform any final steps here (e.g. normalize to [0, 1])
        # Note: This method may not be called for every frame (typically, only once)
        #norm_mhi = np.zeros( self.mhi.shape, dtype=np.float)
        norm_mhi = cv2.normalize(self.mhi, alpha=0.0, beta=1.0, norm_type=cv2.NORM_MINMAX, dtype=cv2.CV_64F)
        return norm_mhi


class Moments(object):
    """Spatial moments of an image - unscaled and scaled."""

    def __init__(self, image):
        """Compute spatial moments on given image.

        Parameters
        ----------
            image: single-channel image, uint8 or float
        """
        # TODO: Your code here - compute all desired moments here (recommended)
        # Perhaps scale image so that it exists only over some defined range (say 0.0 to 1.0)
        image_copy = cv2.normalize(image, alpha=0.0, beta=1.0, norm_type=cv2.NORM_MINMAX, dtype=cv2.CV_64F)
                
        # array: [mu20, mu11, mu02, mu30, mu21, mu12, mu03, mu22]
        self.central_moments = self.compute_central_moments(image_copy)
        # array: [nu20, nu11, nu02, nu30, nu21, nu12, nu03, nu22]
        self.scaled_moments = self.compute_scaled_moments(self.central_moments, image_copy)
        # Note: Make sure computed moments are in correct order
    
    def compute_central_moments(self, image):
        ''' Compute the central moments of an image'''
        
        # Compute regular moments
        M00 = np.sum(image)
        yx_grid = np.mgrid[0:image.shape[0],0:image.shape[1]]
        x_grid = yx_grid[1]
        y_grid = yx_grid[0]
        # y moment
        M01 = np.sum(image*y_grid)
        # x moment
        M10 = np.sum(image*x_grid)
        
        xbar = M10/M00
        ybar = M01/M00
        
        mu20 = np.sum(((x_grid-xbar)**2)*image)
        mu11 = np.sum((y_grid-ybar)*(x_grid-xbar)*image)
        mu02 = np.sum(((y_grid-ybar)**2)*image)
        mu30 = np.sum(((x_grid-xbar)**3)*image)
        mu21 = np.sum((y_grid-ybar)*((x_grid-xbar)**2)*image)
        mu12 = np.sum(((y_grid-ybar)**2)*(x_grid-xbar)*image)
        mu03 = np.sum(((y_grid-ybar)**3)*image)
        mu22 = np.sum(((y_grid-ybar)**2)*((x_grid-xbar)**2)*image)
                
        moment_array = np.array([ mu20, mu11, mu02, mu30, mu21, mu12, mu03, mu22 ])
        return moment_array
    #end compute_central_moments
    
    def compute_scaled_moments(self, central_moments, image):
        """Compute scaled image moments
           M00 is the same as mu00            """
        M00 = np.sum(image)
        # [nu20, nu11, nu02, nu30, nu21, nu12, nu03, nu22]
        mu20 = central_moments[0]
        mu11 = central_moments[1]
        mu02 = central_moments[2]
        mu30 = central_moments[3]
        mu21 = central_moments[4]
        mu12 = central_moments[5]
        mu03 = central_moments[6]
        mu22 = central_moments[7]
        
        nu20 = mu20/(M00**(1+2/2.))
        nu11 = mu11/(M00**(1+2/2.))
        nu02 = mu02/(M00**(1+2/2.))
        nu30 = mu03/(M00**(1+3/2.))
        nu21 = mu21/(M00**(1+3/2.))
        nu12 = mu12/(M00**(1+3/2.))
        nu03 = mu03/(M00**(1+3/2.))
        nu22 = mu22/(M00**(1+4/2.))
        
        scaled_moments = np.array([ nu20, nu11, nu02, nu30, nu21, nu12, nu03, nu22 ])
        return scaled_moments
    #end compute_scaled_moments

    def get_central_moments(self):
        """Return central moments as NumPy array.

        Order: [mu20, mu11, mu02, mu30, mu21, mu12, mu03, mu22]

        Returns
        -------
            self.central_moments: float array of central moments
        """        
        return self.central_moments

    def get_scaled_moments(self):
        """Return scaled central moments as NumPy array.

        Order: [nu20, nu11, nu02, nu30, nu21, nu12, nu03, nu22]

        Returns
        -------
            self.scaled_moments: float array of scaled central moments
        """
        return self.scaled_moments  # note: make sure moments are in correct order


def compute_feature_difference(a_features, b_features):
    """Compute feature difference between two videos.

    Parameters
    ----------
        a_features: features from one video, MHI & MEI moments in a 16-element 1D array
        b_features: like a_features, from other video

    Returns
    -------
        diff: a single float value, difference between the two feature vectors
    """
    # TODO: Your code here - return feature difference using an appropriate measure
    # Tip: Scale/weight difference values to get better results as moment magnitudes differ
    # [nu20, nu11, nu02, nu30, nu21, nu12, nu03, nu22]
    
    # I NEED TO GET A BETTER DIFFERENCE COMPUTATION HERE!!!!!!!!!!!!
    # Weight by the type of moment being used
    
    # For iteration 1, I am just going to use Euclidean distance
    diff = a_features - b_features
    diff = np.sqrt(diff**2)
    diff = np.sum(diff)    
    
    return diff


# Driver/helper code
def build_motion_history_image(builder_class, video_filename, save_frames={}, mhi_frame=None, mhi_filename=None, **kwargs):
    """Instantiate and run a motion history builder on a given video, return MHI.

    Creates an object of type builder_class, passing in initial video frame,
    and any additional keyword arguments.

    Parameters
    ----------
        builder_class: motion history builder class to instantiate
        video_filename: path to input video file
        save_frames: output binary motion images to save {<frame number>: <filename>}
        mhi_frame: which frame to obtain the motion history image at
        mhi_filename: output filename to save motion history image
        kwargs: arbitrary keyword arguments passed on to constructor

    Returns
    -------
        mhi: float motion history image generated by builder, values in [0.0, 1.0]
    """

    # Open video file
    video = cv2.VideoCapture(video_filename)
    print "Video: {} ({}x{}, {:.2f} fps, {} frames)".format(
        video_filename,
        int(video.get(cv2.cv.CV_CAP_PROP_FRAME_WIDTH)),
        int(video.get(cv2.cv.CV_CAP_PROP_FRAME_HEIGHT)),
        video.get(cv2.cv.CV_CAP_PROP_FPS),
        int(video.get(cv2.cv.CV_CAP_PROP_FRAME_COUNT)))

    # Initialize objects
    mhi_builder = None
    mhi = None
    frame_num = 0

    # Loop over video (till last frame or Ctrl+C is presssed)
    while True:
        try:
            # Try to read a frame
            okay, frame = video.read()
            if not okay:
                break  # no more frames, or can't read video

            # Initialize motion history builder (one-time only)
            if mhi_builder is None:
                mhi_builder = builder_class(frame, **kwargs)

            # Process frame
            motion_image = mhi_builder.process(frame)  # TODO: implement this!

            # Save output, if indicated
            if frame_num in save_frames:
                cv2.imwrite(save_frames[frame_num], np.uint8(motion_image * 255))  # scale [0, 1] => [0, 255]
            
            # Grab MHI, if indicated
            if frame_num == mhi_frame:
                mhi = mhi_builder.get_MHI()
                print "MHI frame: {}".format(mhi_frame)
                break  # uncomment for early stop

            # Update frame number
            frame_num += 1
        except KeyboardInterrupt:  # press ^C to quit
            break

    # If not obtained earlier, get MHI now
    if mhi is None:
        mhi = mhi_builder.get_MHI()

    # Save MHI, if filename is given
    if mhi_filename is not None:
        cv2.imwrite(mhi_filename, np.uint8(mhi * 255))  # scale [0, 1] => [0, 255]

    return mhi


def match_features(a_features_dict, b_features_dict, n_actions):
    """Compare features, tally matches for each action pair to produce a confusion matrix.

    Note: Skips comparison for keys that are identical in the two dicts.

    Parameters
    ----------
        a_features_dict: one set of features, as a dict with key: (<action>, <participant>, <trial>)
        b_features_dict: another set of features like a_features
        n_actions: number of distinct actions present in the feature sets

    Returns
    -------
        confusion_matrix: table of matches found, n_actions by n_actions
    """
    
    confusion_matrix = np.zeros((n_actions, n_actions), dtype=np.float_)
    for a_key, a_features in a_features_dict.iteritems():
        min_diff = np.inf
        best_match = None
        for b_key, b_features in b_features_dict.iteritems():
            if a_key == b_key:
                continue  # don't compare with yourself!
            diff = compute_feature_difference(a_features, b_features)  # TODO: implement this!
            if diff < min_diff:
                min_diff = diff
                best_match = b_key
        if best_match is not None:
            #print "{} matches {}, diff: {}".format(a_key, b_key, min_diff)  # [debug]
            confusion_matrix[a_key[0] - 1, best_match[0] - 1] += 1  # note: 1-based to 0-based indexing

    confusion_matrix /= confusion_matrix.sum(axis=1)[:, np.newaxis] # normalize confusion_matrix along each row
    return confusion_matrix


def main():
    # Note: Comment out parts of this code as necessary
    
    # 1a
    build_motion_history_image(MotionHistoryBuilder,  # motion history builder class
        os.path.join(input_dir, "PS8A1P1T1.avi"),  # input video
        save_frames={                # output motion images to save, mapped to filenames
            10: os.path.join(output_dir, 'ps8-1-a-1.png'),
            20: os.path.join(output_dir, 'ps8-1-a-2.png'),
            30: os.path.join(output_dir, 'ps8-1-a-3.png')
        },
        threshold=200,
        tau=45,
        kSize=25,
        blurSigma=15.0)  
    
    # 1b
    build_motion_history_image(MotionHistoryBuilder,  # motion history builder class
        os.path.join(input_dir, "PS8A1P1T1.avi"),  # TODO: choose sequence (person, trial) for action A1
        mhi_frame=100,  # TODO: pick a good frame to obtain MHI at, i.e. when action just ends
        mhi_filename=os.path.join(output_dir, 'ps8-1-b-1.png'),
        threshold=200,
        tau=90,
        kSize=25,
        blurSigma=15.0)
    # TODO: Specify any other keyword args that your motion history builder expects, e.g. theta, tau

    # TODO: Similarly for actions A2 & A3
    build_motion_history_image(MotionHistoryBuilder,  # motion history builder class
        os.path.join(input_dir, "PS8A2P1T1.avi"),  # TODO: choose sequence (person, trial) for action A1
        mhi_frame=71,  # TODO: pick a good frame to obtain MHI at, i.e. when action just ends
        mhi_filename=os.path.join(output_dir, 'ps8-1-b-2.png'),
        threshold=200,
        tau=70,
        kSize=25,
        blurSigma=15.0)
    # TODO: Specify any other keyword args that your motion history builder expects, e.g. theta, tau

    build_motion_history_image(MotionHistoryBuilder,  # motion history builder class
        os.path.join(input_dir, "PS8A3P1T1.avi"),  # TODO: choose sequence (person, trial) for action A1
        mhi_frame=105,  # TODO: pick a good frame to obtain MHI at, i.e. when action just ends
        mhi_filename=os.path.join(output_dir, 'ps8-1-b-3.png'),
        threshold=200,
        tau=100,
        kSize=25,
        blurSigma=15.0)
    # TODO: Specify any other keyword args that your motion history builder expects, e.g. theta, tau
    '''
    # 2a
    # Compute MHI and MEI features (unscaled and scaled central moments) for each video
    central_moment_features = {}  # 16 features (8 MHI, 8 MEI) as one vector, key: (<action>, <participant>, <trial>)
    scaled_moment_features = {}  # similarly, scaled central moments
    
    default_params = dict(mhi_frame=60)  # params for build_motion_history(), overriden by custom_params for specified videos
    # Note: To specify custom parameters for a video, add to the dict below:
    #   (<action>, <participant>, <trial>): dict(<param1>=<value1>, <param2>=<value2>, ...)    
    custom_params = {
        (1, 1, 1): dict(mhi_frame=106, threshold=200, tau=100, kSize=25, blurSigma=15.0),
        (1, 1, 2): dict(mhi_frame=93,  threshold=200, tau=90,  kSize=25, blurSigma=15.0),             
        (1, 1, 3): dict(mhi_frame=110, threshold=200, tau=105, kSize=25, blurSigma=15.0),  # PS8A1P1T3.avi
        (1, 2, 1): dict(mhi_frame=70,  threshold=200, tau=65,  kSize=25, blurSigma=15.0), 
        (1, 2, 2): dict(mhi_frame=64,  threshold=200, tau=64,  kSize=25, blurSigma=15.0),
        (1, 2, 3): dict(mhi_frame=68,  threshold=200, tau=65,  kSize=25, blurSigma=15.0),  # PS8A1P2T3.avi
        (1, 3, 1): dict(mhi_frame=83,  threshold=200, tau=78,  kSize=25, blurSigma=15.0),
        (1, 3, 2): dict(mhi_frame=79,  threshold=200, tau=75,  kSize=25, blurSigma=15.0),
        (1, 3, 3): dict(mhi_frame=77,  threshold=200, tau=74,  kSize=25, blurSigma=15.0),
        (2, 1, 1): dict(mhi_frame=71,  threshold=200, tau=70,  kSize=25, blurSigma=15.0),
        (2, 1, 2): dict(mhi_frame=83,  threshold=200, tau=82,  kSize=25, blurSigma=15.0),
        (2, 1, 3): dict(mhi_frame=84,  threshold=200, tau=84,  kSize=25, blurSigma=15.0),
        (2, 2, 1): dict(mhi_frame=60,  threshold=200, tau=60,  kSize=25, blurSigma=15.0),
        (2, 2, 2): dict(mhi_frame=64,  threshold=200, tau=63,  kSize=25, blurSigma=15.0),
        (2, 2, 3): dict(mhi_frame=73,  threshold=200, tau=72,  kSize=25, blurSigma=15.0),
        (2, 3, 1): dict(mhi_frame=78,  threshold=200, tau=75,  kSize=25, blurSigma=15.0),
        (2, 3, 2): dict(mhi_frame=76,  threshold=200, tau=74,  kSize=25, blurSigma=15.0),
        (2, 3, 3): dict(mhi_frame=81,  threshold=200, tau=80,  kSize=25, blurSigma=15.0),
        (3, 1, 1): dict(mhi_frame=105, threshold=200, tau=100, kSize=25, blurSigma=15.0),
        (3, 1, 2): dict(mhi_frame=100, threshold=200, tau=99,  kSize=25, blurSigma=15.0),
        (3, 1, 3): dict(mhi_frame=95,  threshold=200, tau=94,  kSize=25, blurSigma=15.0),
        (3, 2, 1): dict(mhi_frame=75,  threshold=200, tau=75,  kSize=25, blurSigma=15.0),
        (3, 2, 2): dict(mhi_frame=84,  threshold=200, tau=83,  kSize=25, blurSigma=15.0),
        (3, 2, 3): dict(mhi_frame=78,  threshold=200, tau=77,  kSize=25, blurSigma=15.0),
        (3, 3, 1): dict(mhi_frame=77,  threshold=200, tau=76,  kSize=25, blurSigma=15.0),
        (3, 3, 2): dict(mhi_frame=93,  threshold=200, tau=92,  kSize=25, blurSigma=15.0),
        (3, 3, 3): dict(mhi_frame=88,  threshold=200, tau=87,  kSize=25, blurSigma=15.0)
    }

    # Loop for each action, participant, trial
    n_actions = 3
    n_participants = 3
    n_trials = 3
    print "Computing features for each video..."
    for a in xrange(1, n_actions + 1):  # actions
        for p in xrange(1, n_participants + 1):  # participants
            for t in xrange(1, n_trials + 1):  # trials
                video_filename = os.path.join(input_dir, "PS8A{}P{}T{}.avi".format(a, p, t))
                mhi = build_motion_history_image(MotionHistoryBuilder, video_filename, **dict(default_params, **custom_params.get((a, p, t), {})))
                #cv2.imshow("MHI: PS8A{}P{}T{}.avi".format(a, p, t), mhi)  # [debug]
                #cv2.waitKey(1)  # uncomment if using imshow
                #cv2.imwrite(os.path.join(output_dir, "MHI", "MHI_A{}P{}T{}.png".format(a,p,t)), mhi*255)
                mei = np.uint8(mhi > 0)
                mhi_moments = Moments(mhi)
                mei_moments = Moments(mei)
                central_moment_features[(a, p, t)] = np.hstack((mhi_moments.get_central_moments(), mei_moments.get_central_moments()))
                scaled_moment_features[(a, p, t)] = np.hstack((mhi_moments.get_scaled_moments(), mei_moments.get_scaled_moments()))

    # Match features in a leave-one-out scheme (each video with all others)
    central_moments_confusion = match_features(central_moment_features, central_moment_features, n_actions)
    print "Confusion matrix (unscaled central moments):-"
    print central_moments_confusion

    # Similarly with scaled moments
    scaled_moments_confusion = match_features(scaled_moment_features, scaled_moment_features, n_actions)
    print "Confusion matrix (scaled central moments):-"
    print scaled_moments_confusion
        
    # 2b
    # Match features by testing one participant at a time (i.e. taking them out)
    # Note: Pick one between central_moment_features and scaled_moment_features
    features_P1 = {key: feature for key, feature in scaled_moment_features.iteritems() if key[1] == 1}
    features_sans_P1 = {key: feature for key, feature in scaled_moment_features.iteritems() if key[1] != 1}
    confusion_P1 = match_features(features_P1, features_sans_P1, n_actions)
    print "Confusion matrix for P1:-"
    print confusion_P1

    # TODO: Similarly for participants P2 & P3
    features_P2 = {key: feature for key, feature in scaled_moment_features.iteritems() if key[1] == 2}
    features_sans_P2 = {key: feature for key, feature in scaled_moment_features.iteritems() if key[1] != 2}
    confusion_P2 = match_features(features_P2, features_sans_P2, n_actions)
    print "Confusion matrix for P2:-"
    print confusion_P2
    
    features_P3 = {key: feature for key, feature in scaled_moment_features.iteritems() if key[1] == 3}
    features_sans_P3 = {key: feature for key, feature in scaled_moment_features.iteritems() if key[1] != 3}
    confusion_P3 = match_features(features_P3, features_sans_P3, n_actions)
    print "Confusion matrix for P3:-"
    print confusion_P3

    # Note: Feel free to modify this driver function, but do not modify the interface for other functions/methods!
    '''

if __name__ == "__main__":
    main()
