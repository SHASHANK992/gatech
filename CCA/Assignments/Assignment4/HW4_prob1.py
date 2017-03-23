import pycosat

def reduce_it(G):
    """ Input: an adjacency matrix G of arbitrary size represented as a list of lists.
        Output: the clauses of the cnf formula output in pycosat format.  
        Each clause is be reprented as a list of nonzero integers.
        Positive numbers indicate positive literals, negatives negative literal.
        Thus, the clause (x_1 \vee \not x_5 \vee x_4) is represented 
        as [1,-5,4].  A list of such lists is returned."""
		
		# Requirements for Hamiltonian path that I need to convert into CNF
		# Each node must appear in path
		# No node appears twice (or more) in path
		# Every position on path must be occupied
		# No two nodes occupy the same position in the path
		# Nonadjacent nodes cannot be adjacent in the path
		
		# I will use the following notation
		# there will be n^2 literals (n nodes x n positions on path)
		# use an index (1 to n^2) and use mod to determine which vertex and what position on path currently under considerations
		
		numVertices = len(G[1])
		numLiterals = numVertices**2
		clauses = []
				
		# 1) Each node must appear in path
		for i in range(0,numVertices):
			j=1
			clause = []
			while j < numLiterals:
				clause.append(i+j)
				j = j + numVertices
			#end inner
			clauses.append(clause)
		#end out loop
		
		# 2) Every position on path must be occupied
		for i in range(1,numVertices+1):
			clause=[]
			j=1
			while j < numLiterals:
				clause.append(i*j)
				j += numVertices
			clauses.append(clause)
		
		

		return clauses
		
		
		in this example, 
		[1,6,11,16,21] [2,7,12,17,22] ....
		wrong[1,-6,-11,-16,-21] [-1,6,-11,-16,-21]....
		[1,2,3,4,5] [6,7,8,9,10]....
		
		
		
 
##End Your Code HERE...

def main():
    #A graph with a hamiltonian path
    G = [[0, 0, 0, 1, 1], 
    [0, 0, 0, 0, 1], 
    [0, 0, 0, 1, 0], 
    [1, 0, 1, 0, 1], 
    [1, 1, 0, 1, 0]]

    clauses = reduce_it(G)

    sol = pycosat.solve(clauses)

    assert(sol != 'UNSAT')

    #A graph without a hamiltonian path
    G = [[0, 1, 1, 1, 1], 
    [1, 0, 0, 0, 0], 
    [1, 0, 0, 0, 0], 
    [1, 0, 0, 0, 1], 
    [1, 0, 0, 1, 0]]

    clauses = reduce_it(G)

    sol = pycosat.solve(clauses)

    assert (sol == 'UNSAT')

if __name__ == "__main__":
    main()