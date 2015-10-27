"""Problem Set 7: Particle Filter Tracking."""

import numpy as np
import cv2

import os

# I/O directories
input_dir = "input"
output_dir = "output"


# Assignment code
class ParticleFilter(object):
    """A particle filter tracker, encapsulating state, initialization and update methods."""

    def __init__(self, frame, template, **kwargs):
        """Initialize particle filter object.

        Parameters
        ----------
            frame: color BGR uint8 image of initial video frame, values in [0, 255]
            template: color BGR uint8 image of patch to track, values in [0, 255]
            kwargs: keyword arguments needed by particle filter model, including:
            - num_particles: number of particles
        """
        h = frame.size[0]
        w = frame.size[1]
        self.num_particles = kwargs.get('num_particles', 100)  # extract num_particles (default: 100)
        # The state needs to contain the row, column locations for the number of particles
        self.state = np.zeros( (self.num_particles, 2) ) # location of center of bounding box
        # We want to get the particles distributed evenly and randomly
        self.state[:,0] = int(np.random.rand(self.num_particles,1)*w)
        self.state[:,1] = int(np.random.rand(self.num_particles,1)*h) 
        self.template = template
        # TODO: Your code here - extract any additional keyword arguments you need and initialize state

    def process(self, frame):
        """Process a frame (image) of video and update filter state.

        Parameters
        ----------
            frame: color BGR uint8 image of current video frame, values in [0, 255]
        """
        
        
        pass  # TODO: Your code here - use the frame as a new observation (measurement) and update model
    
    def sensorModel(self, frame, sigma=10):
        """ Compute the mean-squared error between the template and the current frame and use that to
        compute the sensor model
        """
        # Find the mean-squared error for all the particles in the current state
        ms_err = mse(frame)
        # Now compute the measurement probability
        measure = np.zeros( (self.num_particles, 1) )
        for i in range(self.num_particles):
            measure[i,0] = np.exp( -1*ms_err[i,0]/float(2*sigma**2) )
        #endfor
        
        return measure        
    #end sensorModel
    
    def mse(self, image):
        """ Compute mean-squared error for each particle"""
        # Find the section of the image that you need to compute the MSE for
        # Remember that the <u,v> is the center of the bounding box, not a corner
        rows = self.template.shape[0]
        cols = self.template.shape[1]
        err_v = np.zeros( (self.num_particles, 1) )
        for i in self.num_particles:
            u = self.state[i,0]
            v = self.state[i,1]
            # I think I will need to be a little more careful here
            # If the state is (0, 0), I can't go beyond the image
            cutout = image[u-rows/2:u+rows/2, v-cols/2:v+cols/2]
            
            err = np.sum( (self.template.astype("float") - cutout.astype("float"))**2 )
            err /= float(rows*cols)
            err_v[i,0] = err
        #end for
        return err_v
    #end mse
    
    
    def updateModel(self, sigma=5): # Different sigma from sensor model
        """ Update the current state according to the dynamics model
        Note: This is a different sigma from the sensor model
        """
        s = self.state
        
        s[:,0] = s[:,0] + np.random.normal(0, sigma, self.num_particles)
        s[:,1] = s[:,1] + np.random.normal(0, sigma, self.num_particles)
        
        self.state = s
        
    #end updateModel

    def render(self, frame_out):
        """Visualize current particle filter state.

        Parameters
        ----------
            frame_out: copy of frame to overlay visualization on
        """
        # Note: This may not be called for all frames, so don't do any model updates here!
        # Compute the weighted average
        avg, weights = weightedMean(frame_out)
        spread = stdDevEst(avg, weights)
        
        # Draw the tracking window
        # I have the center, but how do I know the dimensions?
        
        # Draw the estimate for the standard deviation
        frame_out = cv2.circle(frame_out, avg, spread.astype('int'), (0,255,0), thickness=2)
                
        for i in range(self.num_particles):
            # Draw particles
            pt1 = (self.state[i,0], self.state[i,1])
            frame_out = cv2.line(frame_out, pt1, pt1, (0,255,0), thickness=2)
        #end for              
        
        
    def weightedMean(self, frame):
        weights = sensorModel(frame)
        
        # Multiply weights
        weighted = np.zeros( self.state.shape )
        weighted[:0] = weights*self.state[:,0]
        weighted[:1] = weights*self.state[:,1]
        
        avg = (1/float(np.sum(weights)))*(np.sum(weighted, axis=0))
        
        return avg.astype('int'), weights
    #end weightedMean
    
    def stdDevEst(self, mean, weights):
        # For every state, compute the difference between it and the weighted average
        diff = np.zeros( (self.num_particles, 1) )
        for i in range(self.num_particles):
            diff[i,0] = np.sqrt( (self.state[i,0]-mean[0,0])**2 - (self.state[i,1]-mean[0,1])**2 )
        #end for
        
        weighted_diff = np.sum(diff*weights)/float(np.sum(weights))
        
        return weighted_diff
    #end stdDevEst
    
#end class

class AppearanceModelPF(ParticleFilter):
    """A variation of particle filter tracker that updates its appearance model over time."""

    def __init__(self, frame, template, **kwargs):
        """Initialize appearance model particle filter object (parameters same as ParticleFilter)."""
        super(AppearanceModelPF, self).__init__(frame, template, **kwargs)  # call base class constructor
        # TODO: Your code here - additional initialization steps, keyword arguments

    # TODO: Override process() to implement appearance model update
    def process(self, frame):
        """Process a frame (image) of video and update filter state.

        Parameters
        ----------
            frame: color BGR uint8 image of current video frame, values in [0, 255]
        """
        pass  # TODO: Your code here - use the frame as a new observation (measurement) and update model

    # TODO: Override render() if desired (shouldn't have to, ideally)


# Driver/helper code
def get_template_rect(rect_filename):
    """Read rectangular template bounds from given file.

    The file must define 4 numbers (floating-point or integer), separated by whitespace:
    <x> <y>
    <w> <h>

    Parameters
    ----------
        rect_filename: path to file defining template rectangle

    Returns
    -------
        template_rect: dictionary specifying template bounds (x, y, w, h), as float or int

    """
    with open(rect_filename, 'r') as f:
        values = [float(v) for v in f.read().split()]
        return dict(zip(['x', 'y', 'w', 'h'], values[0:4]))


def run_particle_filter(pf_class, video_filename, template_rect, save_frames={}, **kwargs):
    """Instantiate and run a particle filter on a given video and template.

    Create an object of type pf_class, passing in initial video frame,
    template (extracted from first frame using template_rect), and any keyword arguments.

    Parameters
    ----------
        pf_class: particle filter class to instantiate (e.g. ParticleFilter)
        video_filename: path to input video file
        template_rect: dictionary specifying template bounds (x, y, w, h), as float or int
        save_frames: dictionary of frames to save {<frame number>|'template': <filename>}
        kwargs: arbitrary keyword arguments passed on to particle filter class
    """

    # Open video file
    video = cv2.VideoCapture(video_filename)

    # Initialize objects
    template = None
    pf = None
    frame_num = 0

    # Loop over video (till last frame or Ctrl+C is presssed)
    while True:
        try:
            # Try to read a frame
            okay, frame = video.read()
            if not okay:
                break  # no more frames, or can't read video

            # Extract template and initialize (one-time only)
            if template is None:
                template = frame[int(template_rect['y']):int(template_rect['y'] + template_rect['h']),
                                 int(template_rect['x']):int(template_rect['x'] + template_rect['w'])]
                if 'template' in save_frames:
                    cv2.imwrite(save_frames['template'], template)
                pf = pf_class(frame, template, **kwargs)

            # Process frame
            pf.process(frame)  # TODO: implement this!

            # Render and save output, if indicated
            if frame_num in save_frames:
                frame_out = frame.copy()
                pf.render(frame_out)
                cv2.imwrite(save_frames[frame_num], frame_out)

            # Update frame number
            frame_num += 1
        except KeyboardInterrupt:  # press ^C to quit
            break


def main():
    # Note: Comment out parts of this code as necessary

    # 1a
    # TODO: Implement ParticleFilter
    run_particle_filter(ParticleFilter,  # particle filter model class
        os.path.join(input_dir, "pres_debate.avi"),  # input video
        get_template_rect(os.path.join(input_dir, "pres_debate.txt")),  # suggested template window (dict)
        # Note: To specify your own window, directly pass in a dict: {'x': x, 'y': y, 'w': width, 'h': height}
        {
            'template': os.path.join(output_dir, 'ps7-1-a-1.png'),
            28: os.path.join(output_dir, 'ps7-1-a-2.png'),
            84: os.path.join(output_dir, 'ps7-1-a-3.png'),
            144: os.path.join(output_dir, 'ps7-1-a-4.png')
        },  # frames to save, mapped to filenames, and 'template' if desired
        num_particles=50)  # TODO: specify other keyword args that your model expects, e.g. measurement_noise=0.2

    # 1b
    # TODO: Repeat 1a, but vary template window size and discuss trade-offs (no output images required)

    # 1c
    # TODO: Repeat 1a, but vary the sigma_MSE parameter (no output images required)
    # Note: To add a parameter, simply pass it in here as a keyword arg and extract it back in __init__()

    # 1d
    # TODO: Repeat 1a, but try to optimize (minimize) num_particles (no output images required)

    # 1e
    run_particle_filter(ParticleFilter,
        os.path.join(input_dir, "noisy_debate.avi"),
        get_template_rect(os.path.join(input_dir, "noisy_debate.txt")),
        {
            14: os.path.join(output_dir, 'ps7-1-e-1.png'),
            32: os.path.join(output_dir, 'ps7-1-e-2.png'),
            46: os.path.join(output_dir, 'ps7-1-e-3.png')
        },
        num_particles=50)  # TODO: Tune parameters so that model can continuing tracking through noise

    # 2a
    # TODO: Implement AppearanceModelPF (derived from ParticleFilter)
    # TODO: Run it on pres_debate.avi to track Romney's left hand, tweak parameters to track up to frame 140

    # 2b
    # TODO: Run AppearanceModelPF on noisy_debate.avi, tweak parameters to track hand up to frame 140

    # EXTRA CREDIT
    # 3: Use color histogram distance instead of MSE (you can implement a derived class similar to AppearanceModelPF)
    # 4: Implement a more sophisticated model to deal with occlusions and size/perspective changes


if __name__ == "__main__":
    main()
