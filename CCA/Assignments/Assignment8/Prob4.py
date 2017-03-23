#The following is known as the maximum acyclic subgraph problem.
#Given a directed graph G=(V,E), pick a maximum cardinality set 
#of edges from E so that the resulting subgraph is acyclic.  

#There is a simple algorithm that gives a 1/2 factor 
#approximation for this problem.  In fact, it returns 1/2 of the 
#edges in total (not just the ones forming a maximum acyclic subgraph).
#Implement such an approximation below.

import numpy as np

def acyclicsubgraph(G):
    """ Input: adjacency matrix of a directed graph G as numpy array
        Output: the adjacency matrix of an acyclic subgraph of G that
                has at least half the edges of G."""

    n = G.shape[0]

    G1 = np.zeros((n,n), dtype=np.int)
    G2 = np.zeros((n,n), dtype=np.int)

    for i in range(0,n):
        for j in range(0,n):
            if i < j:
                G1[i][j] = G[i][j]
            elif i > j:
                G2[i][j] = G[i][j]
            #endif
        #end for
    #end for

    #Return the one with the most edges
    sumG1 = 0
    sumG2 = 0
    for i in range(0,n):
        for j in range(0,n):
            if G1[i][j] == 1:
                sumG1 += 1
            if G2[i][j] == 1:
                sumG2 += 1
    

    return G1 if sumG1 > sumG2 else G2

#Your code here...

def main():
    #Choosing the number of vertices
    n = 10

    #Creating a random directed graph (no antiparallel edges)
    G = np.random.random_integers(0,1,(n,n))
    for i in range(n):
        for j in range(i,n):
            if G[i][j] + G[j][i] == 2:
                G[i][j] = 0
                G[j][i] = 0

    #Finding an acyclic subgraph
    ans = acyclicsubgraph(G)

    assert(type(ans) is np.ndarray)

    assert(np.issubdtype(ans.dtype, int))

    GE_sz = np.sum(np.reshape(G,n*n))
    ansE_sz = np.sum(np.reshape(ans,n*n))

    assert (ansE_sz * 2 >= GE_sz)

if __name__ == "__main__":
    main()
