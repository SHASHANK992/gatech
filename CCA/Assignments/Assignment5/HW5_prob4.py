# Given two sets A and B of integers, their sum set C is defined to be 
# C = {a+b: aA, bB}.  For each c \in C, let m(c)denote the number of ways in
# which c can be obtained, i.e., m(c) = |{(a,b) : a A, b B, a+c = c}|.
# For example, if A = {1,2,3} and B={0,1,4}, then their sum set is 
# C = {1,2,5,3,6,4,7} and 
# m(1) = 1, m(2) = 2, m(3) = 2, m(4) = 1, m(5)=1, m(6) = 1, and m(7) = 1. 

# Answer the following:
# a) For two arbitrary sets A and B of integers, what is the worst-case 
#   complexity of computing their sum set?
	# The worst case would be the brute force method, where you pair
	# each element from one set to each element from the other set
	# This would take time proportional to the size of A times the 
	# size of B, i.e., O(|A||B|)

# b) Suppose now that A,B consist of integers in the range [0,n). Give 
#   an upper bound on the number of distinct elements in their sum set.
	# An upper bound needs to encompass the largest set that can be formed
	# for any set A and B. In general, summing sets A and B each of which can
	# go from 0 to n-1, the maximum number of distinct elements can be from
	# 0 to 2*(n-1), or in other words from 0 to 2*n-1. Conveniently, this is 
	# also the size of two sets of size n convolved together. 


# c) With the above assumption, implement the sumset procedure below
#   using an O(nn)to find (c,m(c)) for each c \in C.

# Hint: Use numpy's convolve routine, which takes only O(n log n) 
# time to produce an algorithm that is O(n log n) overall.
#Example uses of convolve
#print np.convolve([3, 0, 2], [1, 1, 1, 1]))
#or
#print np.convolve(np.array([3, 0, 2]), np.array([1, 1, 1, 1]))

import numpy as np

def sumset(n,A,B):
    #Replace the naive implementation below with one that runs
    #in O(n log n) time.
    # Use an indicator function
    I_a = np.zeros(n, dtype=int)
    I_b = np.zeros(n, dtype=int)
    
	# Takes up to n time
    for a in A:
        I_a[a] = 1
    for b in B:
        I_b[b] = 1
        
	# Take n log n time
    C = np.convolve(I_a, I_b)
	
	# Takes n time
    return [ (i,C[i]) for i in range(len(C)) if C[i] > 0]

def main():
    A = [1,2,3]
    B = [0,1,4]

    C = sumset(5,A,B)

    C.sort()

    assert (C == [(1, 1), (2, 2), (3, 2), (4, 1), (5, 1), (6, 1), (7, 1)])

if __name__ == "__main__":
    main()

