#One approach to finding a maximum cut in a graph is
#to simply partition the vertices uniformly at random, i.e.
#for each vertex there is probabilty 1/2 that it is in each
#side of the partition.  Apply method of conditional 
#expectation gives a deterministic algorithm that always
#cuts at least 1/2 of the edges.  Implement this algorithm
#in the approxmaxcut procedure below.

import numpy as np

def approxmaxcut(G):
    """ Input: adjacency matrix of an undirected graph G as numpy array
        Output: a numpy array partitioning the vertices of the graph
                so that entry equal to 1 are in one set and those equal
                to -1 are in the other.""" 
    n = G.shape[0]

    # n vertices, so create a numpy array of size n
    output = np.zeros(n, dtype=int)

    # For each vertex
    for i in range(0,n):
        # Look at the neighbors of vertex i
        # if more of the neighbors are in set A than set B, put
        # vertex i in set B
        # Otherwise, put vertex i in set A

        # Look at neighbors
        neighborSum = 0
        for j in range(0,n):
            # vertex j is a neighbor of vertex i, add to sum
            if G[i][j] == 1:
                neighborSum += output[j]
            #end if
        #end for

        if neighborSum > 0:
            output[i] = -1
        else:
            output[i] = 1
        #end if
    # end for
    
    print output
    return output

def main():
    #Choosing the number of vertices
    n = 6

    #Creating a random undirected graph
    G = np.array([[0, 0, 1, 1, 1, 1],
                 [0, 0, 0, 1, 1, 1],
                 [1, 0, 0, 1, 1, 1],
                 [1, 1, 1, 0, 0, 1],
                 [1, 1, 1, 0, 0, 0],
                 [1, 1, 1, 1, 0, 0]],
                 dtype=int)

    #Finding an acyclic subgraph
    ans = approxmaxcut(G)

    assert(type(ans) is np.ndarray)

    assert(np.issubdtype(ans.dtype, int))

    #Checking that every entry is either -1 or 1
    for i in range(n):
        assert (ans[i] in (-1,1))

    #Checking that at least 1/2 of the edges are cut
    diff = 0
    for i in range(n):
        for j in range(n):
            diff += ans[i]*ans[j]*G[i][j]

    assert(diff <= 0)

if __name__ == "__main__":
    main()
