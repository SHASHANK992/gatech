"""Problem Set 4: Geometry."""

import numpy as np
import cv2
from random import randrange
import os

# I/O directories
input_dir = "input"
output_dir = "output"

# Input files
PIC_A = "pic_a.jpg"
PIC_A_2D = "pts2d-pic_a.txt"
PIC_A_2D_NORM = "pts2d-norm-pic_a.txt"
PIC_B = "pic_b.jpg"
PIC_B_2D = "pts2d-pic_b.txt"
SCENE = "pts3d.txt"
SCENE_NORM = "pts3d-norm.txt"

# Utility code
def read_points(filename):
    """Read point data from given file and return as NumPy array."""
    with open(filename) as f:
        lines = f.readlines()
        pts = []
        for line in lines:
            pts.append(map(float, line.split()))
    return np.array(pts)


# Assignment code
def solve_least_squares(pts3d, pts2d):
    """Solve for transformation matrix M that maps each 3D point to corresponding 2D point using the least squares method.

    Parameters
    ----------
        pts3d: 3D (object) points, NumPy array of shape (N, 3)
        pts2d: corresponding 2D (image) points, NumPy array of shape (N, 2)

    Returns
    -------
        M: transformation matrix, NumPy array of shape (3, 4)
        error: sum of squared residuals of all points
    """

    # TODO: Your code here
    # Build the array into something that can be solved
    N = pts3d.shape[0]
    A = np.zeros( (2*N, 11) )
    x = np.zeros( (2*N, 1) )
    
    for i in range(0, 2*N, 2):
        X = pts3d[ i/2, 0]
        Y = pts3d[ i/2, 1]
        Z = pts3d[ i/2, 2]
        u = pts2d[ i/2, 0]
        v = pts2d[ i/2, 1]
        # Used the equations from the lecture slides. Note that with M[3,4] constrained
        # to be 1, we only have 11 variables, not 12
        A[i]   = np.array([ [ X, Y, Z, 1, 0, 0, 0, 0, -u*X, -u*Y, -u*Z ] ])        
        A[i+1] = np.array([ [ 0, 0, 0, 0, X, Y, Z, 1, -v*X, -v*Y, -v*Z ] ])
        
        x[i]   = u
        x[i+1] = v
    #end for
    
    # Use this
    # http://docs.scipy.org/doc/numpy/reference/generated/numpy.linalg.lstsq.html#numpy.linalg.lstsq
    M, error, rank, s = np.linalg.lstsq(A, x)
    M = np.append( M, np.array([[1]]), axis=0) # Add the constrained variable back in
    M = np.reshape( M, (3, 4))
    
    return M, error


def project_points(pts3d, M):
    """Project each 3D point to 2D using matrix M.

    Parameters
    ----------
        pts3d: 3D (object) points, NumPy array of shape (N, 3)
        M: projection matrix, NumPy array of shape (3, 4)

    Returns
    -------
        pts2d_projected: projected 2D points, NumPy array of shape (N, 2)
    """

    # TODO: Your code here
    
    # Use equations given in lecture
    N = pts3d.shape[0]
    pts2d_projected = np.zeros( (N, 2) )
    
    for i in range(N):
        X = pts3d[i,0]
        Y = pts3d[i,1]
        Z = pts3d[i,2]
        
        denom = M[2,0]*X + M[2,1]*Y + M[2,2]*Z + M[2,3]
        
        pts2d_projected[i, 0] = (M[0,0]*X + M[0,1]*Y + M[0,2]*Z + M[0,3])/denom
        pts2d_projected[i, 1] = (M[1,0]*X + M[1,1]*Y + M[1,2]*Z + M[1,3])/denom
    #end for    
    
    return pts2d_projected    


def get_residuals(pts2d, pts2d_projected):
    """Compute residual error for each point.

    Parameters
    ----------
        pts2d: observed 2D (image) points, NumPy array of shape (N, 2)
        pts2d_projected: 3D (object) points projected to 2D, NumPy array of shape (N, 3)

    Returns
    -------
        residuals: residual error for each point (L2 distance between observed and projected 2D points)
    """

    # TODO: Your code here
    #L2 = ( (x-x')**2 + (y-y')**2 )*(1/2)
    N = pts2d.shape[0]
    # Find the difference between each point
    diff = pts2d - pts2d_projected
    # square each point
    diff_sq = np.multiply(diff, diff)
    # Sum along horizontal axis
    sum_sq = np.sum(diff_sq, axis=1)
    # Take square root
    residuals = np.reshape( np.sqrt(sum_sq), (N, 1) )
    
    return residuals


def calibrate_camera(pts3d, pts2d):
    """Find the best camera projection matrix given corresponding 3D and 2D points.

    Parameters
    ----------
        pts3d: 3D (object) points, NumPy array of shape (N, 3)
        pts2d: corresponding 2D (image) points, NumPy array of shape (N, 2)

    Returns
    -------
        bestM: best transformation matrix, NumPy array of shape (3, 4)
        error: sum of squared residuals of all points for bestM
    """

    # TODO: Your code here
    # NOTE: Use the camera calibration procedure in the problem set
    min_resid = 100
    bestM = 0
    N = pts3d.shape[0]
    
    k_list = [ 8, 12, 16 ]
    for k in k_list:
        # Repeat 10 times
        for i in range(10):
            mypts3D = np.copy(pts3d)
            mypts2D = np.copy(pts2d)
            
            # Choose k points from 2D list and the corresponding points in the 3D list
            curr2d = np.zeros( (k, 2) )
            curr3d = np.zeros( (k, 3) )
            for j in range(k):
                index = randrange(N-j)
                curr2d[ j,: ] = mypts2D[ index, : ]
                curr3d[ j,: ] = mypts3D[ index, : ]
                
                # Remove points from my arrays
                mypts2D = np.delete(mypts2D, index, axis=0)
                mypts3D = np.delete(mypts3D, index, axis=0)
            # end for            
            
            # Compute projection matrix based on the selected points
            M, error = solve_least_squares( curr3d, curr2d )
            
            # Select 4 points not in selected points
            notSelected_2d = np.zeros( (4, 2) )
            notSelected_3d = np.zeros( (4, 3) )
            for j in range(4):
                index = randrange( N-k )
                notSelected_2d[j,:] = mypts2D[index,:]
                notSelected_3d[j,:] = mypts3D[index,:]
            #end for
            
            # Project not selected 3D points to 2D using M
            notSelected_projected = project_points( notSelected_3d, M )
            
            # Compute average residual using the 4 points above
            resid = get_residuals( notSelected_2d, notSelected_projected )
            avg_resid = np.average( resid )
            
            print "For k = " + str(k) + " and iteration " + str(i) + " average residual is " + str(avg_resid)
            
            if avg_resid < min_resid:
                min_resid = avg_resid
                bestM = M           
            #end if
        #end for
    #end for
    
    error = min_resid
    
    return bestM, error


def compute_fundamental_matrix(pts2d_a, pts2d_b):
    """Compute fundamental matrix given corresponding points from 2 images of a scene.

    Parameters
    ----------
        pts2d_a: 2D points from image A, NumPy array of shape (N, 2)
        pts2d_b: corresponding 2D points from image B, NumPy array of shape (N, 2)

    Returns
    -------
        F: the fundamental matrix
    """

    # TODO: Your code here
    # Build the array into something that can be solved
    N = pts2d_a.shape[0]
    A = np.zeros( (N, 8) )
    X = np.zeros( (N, 1) )
    
    for i in range(N):
        u1 = pts2d_a[i, 0]
        v1 = pts2d_a[i, 1]
        
        u2 = pts2d_b[i, 0]
        v2 = pts2d_b[i, 1]
        
        # Used the equations from the lecture slides. Note that with F[3,3] constrained
        # to be 1, we only have 8, not 9
        A[i]   = np.array([ [ u1*u2, u1*v2, u1, v1*u2, v1*v2, v1, u2, v2 ] ])        
        
        X[i]   = -1
    #end for
    
    # Use this
    # http://docs.scipy.org/doc/numpy/reference/generated/numpy.linalg.lstsq.html#numpy.linalg.lstsq
    F, error, rank, s = np.linalg.lstsq(A, X)
    F = np.append( F, np.array([[1]]), axis=0) # Add the constrained variable back in
    F = np.reshape( F, (3, 3))
    
    return F


# Driver code
def main():
    """Driver code."""

    # 1a
    # Read points
    pts3d_norm = read_points(os.path.join(input_dir, SCENE_NORM))
    pts2d_norm_pic_a = read_points(os.path.join(input_dir, PIC_A_2D_NORM))

    # Solve for transformation matrix using least squares
    M, error = solve_least_squares(pts3d_norm, pts2d_norm_pic_a)  # TODO: implement this

    # Project 3D points to 2D
    pts2d_projected = project_points(pts3d_norm, M)  # TODO: implement this

    # Compute residual error for each point
    residuals = get_residuals(pts2d_norm_pic_a, pts2d_projected)  # TODO: implement this

    # TODO: Print the <u, v> projection of the last point, and the corresponding residual
    print 'M matrix:'
    print M
    print 'Last point: ' + str(pts2d_projected[-1,:])
    print 'Residual of last point: ' + str(residuals[-1,0])

    # 1b
    # Read points
    pts3d = read_points(os.path.join(input_dir, SCENE))
    pts2d_pic_b = read_points(os.path.join(input_dir, PIC_B_2D))
    # NOTE: These points are not normalized

    # TODO: Use the functions from 1a to implement calibrate_camera() and find the best transform (bestM)
    bestM, error = calibrate_camera( pts3d, pts2d_pic_b )
    print "Best M is "
    print bestM
    print "Best residual error is " + str(error)
    
    # 1c
    # TODO: Compute the camera location using bestM
    Q = bestM[:, 0:3]
    m4 = bestM[:,3]
    C = -1 *np.dot( np.linalg.inv(Q), m4 )
    print 'Camera center'
    print C

    # 2a
    # TODO: Implement compute_fundamental_matrix() to find the raw fundamental matrix
    pts2d_a = read_points( os.path.join(input_dir, PIC_A_2D))
    pts2d_b = read_points( os.path.join(input_dir, PIC_B_2D))
    
    F = compute_fundamental_matrix( pts2d_a, pts2d_b)
    print 'Fundamental matrix F'
    print F

    # 2b
    # TODO: Reduce the rank of the fundamental matrix
    # Decompose F
    U, D, V = np.linalg.svd(F, compute_uv=1)
    D = np.diag(D)
    D[2,2] = 0
    F = np.dot( U, np.dot(D, V) )
    print 'Reduced Rank F'
    print F

    # 2c
    # TODO: Draw epipolar lines
    pic_a = cv2.imread( os.path.join(input_dir, PIC_A))
    pic_b = cv2.imread( os.path.join(input_dir, PIC_B))
    
    # Compute points with which to draw epipolar lines
    
    
    
    # Save images
    cv2.imwrite( os.path.join(output_dir, 'ps4-2-c-1.png'), pic_a )
    cv2.imwrite( os.path.join(output_dir, 'ps4-2-c-2.png'), pic_b )
#end main


if __name__ == '__main__':
    main()
