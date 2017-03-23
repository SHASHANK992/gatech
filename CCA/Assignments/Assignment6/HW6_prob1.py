#This exercise asks you to solve a problem using
#a maximum flow algorithm as a subroutine.  For 
#this purpose, you may use the provided maximumflow 
#module, which contains the following three functions
#
#(flow,cut) = maxflow_mincut(C,s,t):
#   C is assumed to be n x n numpy.ndarray and s and t are integers.
#
#   The flow network is defined by 
#   1) Vertices V = {0,...,n-1}
#   2) Edges E = {(i,j) | C[i][j] > 0}
#   3) Capacity given by the matrix C
#   4) Source vertex s
#   5) Sink vertex t
#
#   The flow is returned as an n x n numpy.ndarray.
#   The cut is returned as an array of length n where c[i] = 1
#   vertex i is in the same side of the partition as s and c[i] = 0
#   otherwise.
#
#v = flowValue(F,s,t):
#   F is assumed to be n x n numpy.ndarray representing the flow
#   and s and t are integers.  The function returns the value of 
#   the flow.
#
#v = cutValue(M,cut):
#   M is assumed to be n x n numpy.ndarray representing the capacites
#   and s and t are integers. The function the value sum of the edge
#   capacities of the cut.
#
#Implement the function below according to the documentation.

from maximumflow import maxflow_mincut
import numpy as np

#Run by "Submit" button
def minedgesmincut(C,s,t):
    """ Input: A flow network defined by C,s,t (see the documentation
        for the maximumflow module on how to interpret).
        
        Output: A minimum cost cut (again see above documentation for 
            maximumflow module) that also has the minimum number of edges."""
    #Your code here
	
	# Step 1 - find the number of edges in the network. Add 1 to this value
    numEdges = np.count_nonzero(C) + 1
	#for i < len(C[1]):
	#	for j < len(C[1]):
	#		if C[i][j] > 0:
	#			numEdges += 1
	
	# Step 2 - Multiply all the edge capacities by that value. This keeps the max-flow, min cut the same
    C = numEdges*C
	
	# Step 3 - Add 1 to all the edge capacities (that are non zero). This changes the max flow, min cut
	#          but because we multiplied by a number greater than the possible number of edges incident 
	#          to a single vertex, we now have a network that produces a min cut with the fewest edges
    for i in range(0,len(C[1])):
        for j in range(0,len(C[1])):
            if C[i][j] > 0:
                C[i][j] += 1
	
	# So now we have a network that has capacities scaled by the number of edges offset by the number
	# of edges incident to each vertex. We can find the max flow min cut and the cut returned will be the one
	# with the minimum number of edges   
    (flow,cut) = maxflow_mincut(C,s,t)
    return cut

#Run by "Test Run" button
def main():
    C = np.zeros((6,6), dtype=int)
    s = 4
    t = 5

    C[s][0] = 2
    C[s][1] = 2
    C[s][2] = 2
    C[0][3] = 1
    C[1][3] = 1
    C[2][3] = 1
    C[3][t] = 3

    cut = minedgesmincut(C,s,t)

    assert(np.all( cut == np.array([1,1,1,1,1,0])))

if __name__ == '__main__':
    main()

