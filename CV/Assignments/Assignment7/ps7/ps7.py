"""Problem Set 7: Particle Filter Tracking."""
""" NOTE: To get this to work, I had to do the following:
    1) From C:\opencv\sources\3rdparty\ffmpeg copy opencv_ffmpeg.dll into C:\Python27
    2) Rename opencv_ffmpeg.dll to opencv_ffmpeg2411.dll (the rename was required and the 2411 is in reference to the version of OpenCV I am running)
    """

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
        self.num_particles = kwargs.get('num_particles', 100)  # extract num_particles (default: 100)
        # TODO: Your code here - extract any additional keyword arguments you need and initialize state
        self.sigma_sensor = kwargs.get('sigma_MSE', 10) # sigma for the sensor model
        self.sigma_motion = kwargs.get('sigma_dyn', 10) # sigma for motion model
        # Starting estimate is in u,v (row, column) coordinates
        startingEstimate = kwargs.get('startingEst', (frame.shape[0]/2,frame.shape[1]/2))
        h = kwargs.get('height', 50)
        w = kwargs.get('width',  50)
        # Height and width of tracking window
        self.height = h
        self.width  = w
        # The state needs to contain the row, column locations for the number of particles
        self.state = np.zeros( (self.num_particles, 2) ) # location of center of bounding box
        # Using the starting estimate, spread the particles around and a little outside of the bounding
        # box. We want to have a decent estimate to start, but we also want to account for noise
        # and uncertainty. I am starting the state centered around the template and having a spread
        # of twice the width and height of the template
        self.state[:,0] = startingEstimate[0] + (np.random.rand(self.num_particles)*2*h).astype('int')
        self.state[:,1] = startingEstimate[1] + (np.random.rand(self.num_particles)*2*w).astype('int')
        # All particles have equal weight at the beginning
        self.weights = np.ones( (self.num_particles, 1) )*(1.0/self.num_particles)
        self.template = template
    #end init        

    def process(self, frame):
        """Process a frame (image) of video and update filter state.

        Parameters
        ----------
            frame: color BGR uint8 image of current video frame, values in [0, 255]
        """
        
         # TODO: Your code here - use the frame as a new observation (measurement) and update model
        
        # Sample num_particles from current distribution (state)
        particles = self.resample()
        
        # Update state using dynamics and the resampled particles
        self.updateModel( particles )
        
        # Reweight using sensor model
        # This takes care of the normalization
        self.weights = self.sensorModel( frame )
    #end process
    
    def resample(self):
        '''Takes samples from existing state to create a new distribution'''
        particles = np.zeros( (self.num_particles, 2) )
        index = 0
        # Convert self.weights into a sequence that np can understand
        weights_seq = []
        for i in range(self.num_particles):
            weights_seq.append( self.weights[i,0] )
        # num_samples contains how many particles at each index were drawn
        num_samples = np.random.multinomial(self.num_particles, weights_seq, size=1)
        # i is the index into the state vector
        for i in range(self.num_particles):
            # how many samples to draw at this index
            samplesToDraw = num_samples[0, i]
            #print samplesToDraw
            for j in range(samplesToDraw):
                particles[index,:] = self.state[i,:]
                index += 1
            #end for
        #end for
        
        return particles
    #end resample
    
    def sensorModel(self, frame):
        """ Compute the mean-squared error between the template and the current frame and use that to
        compute the sensor model weights
        
        NOTE: I may want to add some noise in here
        """
            
        # Find the mean-squared error for all the particles in the current state
        ms_err = self.mse(frame)
        # Now compute the measurement probability
        measure = np.zeros( (self.num_particles, 1) )
        for i in range(self.num_particles):
            measure[i,0] = np.exp( -1*ms_err[i,0]/float(2*self.sigma_sensor**2) )
        #endfor
        
        # Normalize weights
        # Find the sum of all the weights and divide out
        sum_measure = np.sum(measure)
        measure /= sum_measure
        
        return measure       
    #end sensorModel
    
    def mse(self, image):
        """ Compute mean-squared error for each particle"""
        # Find the section of the image that you need to compute the MSE for
        # Remember that the <u,v> is the center of the bounding box, not a corner
        rows = self.template.shape[0]
        cols = self.template.shape[1]
        err_v = np.zeros( (self.num_particles, 1) )
        for i in range(self.num_particles):
            u = self.state[i,0]
            v = self.state[i,1]
            
            cutout = self.getCutout(u, v, image)
            
            err = np.sum( (self.template.astype("float") - cutout.astype("float"))**2 )
            err /= float(rows*cols)
            err_v[i,0] = err
        #end for
        return err_v
    #end mse
    
    def getCutout(self, u, v, image):
        rows = self.template.shape[0]
        cols = self.template.shape[1]
        
        upper = u-rows/2
        if upper < 0:
            upper = 0
        elif upper >= image.shape[0]:
            upper = image.shape[0]-1
        else:
            upper = int(upper)
        
        lower = u+rows/2
        if lower > image.shape[0]:
            lower = image.shape[0]-1
        elif lower < 0:
            lower = 0
        else:
            lower = int(lower)
            
        left = v-cols/2
        if left < 0:
            left = 0
        elif left > image.shape[1]:
            left = image.shape[1]-1
        else:
            left = int(left)
            
        right = v+cols/2
        if right > image.shape[1]:
            right = image.shape[1]-1
        elif right < 0:
            right = 0
        else:
            right = int(right)
            
        cutout = np.zeros( self.template.shape )
        # I still think there is some problem here, but this is closer to being right
        cutout[0:lower-upper, 0:right-left] = image[upper:lower, left:right]
        
        return cutout        
    #end getCutout
    
    
    def updateModel(self, sampledState): # Different sigma from sensor model
        """ Update the current state according to the dynamics model
        Note: This is a different sigma from the sensor model
        """
        s = sampledState
        # The dynamics model is just independent, additive Gaussian noise
        s[:,0] = s[:,0] + np.random.normal(0, self.sigma_motion, self.num_particles)
        s[:,1] = s[:,1] + np.random.normal(0, self.sigma_motion, self.num_particles)
        
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
        avg = self.weightedMean()
        spread = self.stdDevEst(avg)
                       
        for i in range(self.num_particles):
            # Draw particles
            pt1 = (int(self.state[i,1]), int(self.state[i,0]))
            #print pt1
            cv2.circle(frame_out, pt1, 1, (0,255,0), thickness=2)
        #end for  
        
        # Draw the tracking window
        pt1 = ( int(avg[1]-self.width/2), int(avg[0]-self.height/2) )
        pt2 = ( int(avg[1]+self.width/2), int(avg[0]+self.height/2) )
        cv2.rectangle(frame_out, pt1, pt2, (0, 255, 0), thickness=2)
        
        # Draw the estimate for the standard deviation
        # avg is in (u,v) coordinates (row, columns). Switch to (x, y)
        cv2.circle(frame_out, (avg[1], avg[0]), spread.astype('int'), (0,0,255), thickness=2)
    #end render            
        
        
    def weightedMean(self):
        
        # Multiply weights
        weighted = np.zeros( self.state.shape )
        weighted[:,0] = np.reshape(self.weights, (1, self.num_particles))*self.state[:,0]
        weighted[:,1] = np.reshape(self.weights, (1, self.num_particles))*self.state[:,1]
        
        avg = (1/float(np.sum(self.weights)))*(np.sum(weighted, axis=0))
        
        return avg.astype('int')
    #end weightedMean
    
    def stdDevEst(self, mean ):
        # For every state, compute the difference between it and the weighted average
        diff = np.zeros( (self.num_particles, 1) )
        for i in range(self.num_particles):
            diff[i,0] = np.sqrt( (self.state[i,0]-mean[0])**2 + (self.state[i,1]-mean[1])**2 )
        #end for
        
        weighted_diff = np.sum(diff*self.weights)/float(np.sum(self.weights))
        
        return weighted_diff
    #end stdDevEst
    
#end class

class AppearanceModelPF(ParticleFilter):
    """A variation of particle filter tracker that updates its appearance model over time."""

    def __init__(self, frame, template, **kwargs):
        """Initialize appearance model particle filter object (parameters same as ParticleFilter)."""
        super(AppearanceModelPF, self).__init__(frame, template, **kwargs)  # call base class constructor
        self.alpha = kwargs.get('alpha', 0.5)
        # TODO: Your code here - additional initialization steps, keyword arguments

    # TODO: Override process() to implement appearance model update
    def process(self, frame, iteration=0):
        """Process a frame (image) of video and update filter state.

        Parameters
        ----------
            frame: color BGR uint8 image of current video frame, values in [0, 255]
        """
        # I think I can just copy a lot of the code from ParticleFilter.process into here, with just the 
        # added step of updating the template to track
        # Sample num_particles from current distribution (state)
        
        particles = self.resample()
        
        # Update state using dynamics and the resampled particles
        self.updateModel( particles )
        
        # Reweight using sensor model
        # This takes care of the normalization
        self.weights = self.sensorModel( frame )
        
        # With the updated weights, calculated the weighted mean
        # Use the weighted mean to compute the best match, and update the template
        self.updateTemplate(frame)
        '''
        template_name = 'template' + str(iteration) + '.png'
        cv2.imwrite( os.path.join(output_dir, 'templates', template_name), self.template )
        frame_name = 'frame' + str(iteration) + '.png'
        frame_out = frame.copy()
        self.render(frame_out)
        cv2.imwrite( os.path.join(output_dir, 'frames', frame_name), frame_out)
        '''
        
    #end process        

    def updateTemplate(self, frame):
        ''' Update the template to track using the Infinite Impulse Response (IIR) filter'''
        # Compute the weighted average
        avg = self.weightedMean()
        
        # Using the weighted average, find the best match to the template
        best = self.getCutout( avg[0], avg[1], frame )
        
        # The new template is a weighted sum of the two templates, the old one and the new best match
        self.template = (self.alpha*best + (1-self.alpha)*self.template).astype('int')        

    #end updateTemplate
    
# end class AppearanceModelPF


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
    '''
    template_r = get_template_rect(os.path.join(input_dir, "pres_debate.txt"))
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
        num_particles=300,
        startingEst = (template_r['y'],template_r['x']),
        height = template_r['h'],
        width = template_r['w'])  # TODO: specify other keyword args that your model expects, e.g. measurement_noise=0.2
    '''
    '''
    # 1b
    # TODO: Repeat 1a, but vary template window size and discuss trade-offs (no output images required)
    # Smaller window does not have enough of subject to track
    # Larger window is trying to track stuff that does not move with the subject
    template_r = get_template_rect(os.path.join(input_dir, "pres_debate.txt"))
    template_large = {'x': template_r['x'], 'y': template_r['y'], 'w': template_r['w']+10, 'h': template_r['h']+10}
    template_small = {'x': template_r['x'], 'y': template_r['y'], 'w': template_r['w']-10, 'h': template_r['h']-10}
    run_particle_filter(ParticleFilter,  # particle filter model class
        os.path.join(input_dir, "pres_debate.avi"),  # input video
        template_large,
        # Note: To specify your own window, directly pass in a dict: {'x': x, 'y': y, 'w': width, 'h': height}
        {
            'template': os.path.join(output_dir, 'ps7-1-a-1.png'),
            28: os.path.join(output_dir, 'ps7-1-a-2.png'),
            84: os.path.join(output_dir, 'ps7-1-a-3.png'),
            144: os.path.join(output_dir, 'ps7-1-a-4.png')
        },  # frames to save, mapped to filenames, and 'template' if desired
        num_particles=300,
        startingEst = (template_r['y'],template_r['x']),
        height = template_r['h'],
        width = template_r['w'])

    # 1c
    # TODO: Repeat 1a, but vary the sigma_MSE parameter (no output images required)
    # Note: To add a parameter, simply pass it in here as a keyword arg and extract it back in __init__()
    template_r = get_template_rect(os.path.join(input_dir, "pres_debate.txt"))
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
        num_particles=300,
        startingEst = (template_r['y'],template_r['x']),
        height = template_r['h'],
        width = template_r['w'],
        sigma_MSE = 5)

    # 1d
    # TODO: Repeat 1a, but try to optimize (minimize) num_particles (no output images required)
    template_r = get_template_rect(os.path.join(input_dir, "pres_debate.txt"))
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
        num_particles=20,
        startingEst = (template_r['y'],template_r['x']),
        height = template_r['h'],
        width = template_r['w'])
    '''
    '''
    # 1e    
    template_r = get_template_rect(os.path.join(input_dir, "noisy_debate.txt"))
    run_particle_filter(ParticleFilter,
        os.path.join(input_dir, "noisy_debate.avi"),
        get_template_rect(os.path.join(input_dir, "noisy_debate.txt")),
        {
            14: os.path.join(output_dir, 'ps7-1-e-1.png'),
            32: os.path.join(output_dir, 'ps7-1-e-2.png'),
            46: os.path.join(output_dir, 'ps7-1-e-3.png')
            # At frame 200 it diverged a little bit, at 300 it was back on
            #300:  os.path.join(output_dir, 'test.png')
        },
        num_particles=50,
        startingEst = (template_r['y'],template_r['x']),
        height = template_r['h'],
        width = template_r['w'] )  # TODO: Tune parameters so that model can continuing tracking through noise
    '''
    # 2a
    # TODO: Implement AppearanceModelPF (derived from ParticleFilter)
    # TODO: Run it on pres_debate.avi to track Romney's left hand, tweak parameters to track up to frame 140
    # Get the template for Romney's hand
    template_r = get_template_rect(os.path.join(input_dir, "hand.txt"))
    run_particle_filter(AppearanceModelPF,
        os.path.join(input_dir, "pres_debate.avi"),
        get_template_rect(os.path.join(input_dir, "hand.txt")),
        {
            'template': os.path.join(output_dir, 'ps7-2-a-1.png'),
            15:  os.path.join(output_dir, 'ps7-2-a-2.png'),
            50:  os.path.join(output_dir, 'ps7-2-a-3.png'),
            140: os.path.join(output_dir, 'ps7-2-a-4.png')
            # At frame 200 it diverged a little bit, at 300 it was back on
            #300:  os.path.join(output_dir, 'test.png')
        },
        num_particles=300,
        startingEst = (template_r['y'],template_r['x']),
        height = template_r['h'],
        width = template_r['w'],
        sigma_MSE = 10,
        sigma_dyn = 20,
        alpha = 0.5 ) 
    

    # 2b
    # TODO: Run AppearanceModelPF on noisy_debate.avi, tweak parameters to track hand up to frame 140

    # EXTRA CREDIT
    # 3: Use color histogram distance instead of MSE (you can implement a derived class similar to AppearanceModelPF)
    # 4: Implement a more sophisticated model to deal with occlusions and size/perspective changes


if __name__ == "__main__":
    main()
