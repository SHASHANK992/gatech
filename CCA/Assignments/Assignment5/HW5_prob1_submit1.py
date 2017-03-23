import numpy as np

#Suppose there is a procedure inA that decides a language A.  
#Use dynamic programming (not memoization) to create an 
#algorithm that decides A* in O(n^2) time, where n is the 
#length of the input string.

#This is run by "Submit"
def inAstar(x, inA):
    """ Returns true if x is in A^* and false otherwise.
    The input inA should be assumed to be a function 
    that takes are string as input and return True or False."""

    # This seems very similar to the matrix multiplication example from lecture

    # Keep a table like the matrix multiplication one
    # create table and fill in diagonal
    table = []
    for i in range(0,len(x)):
        table.append([])
        table[i].append(inA(x[i]))
    # end for

    # Fill in table from the bottom
    i = len(x)-2
    while i >= 0:
        for j in range(1,len(x)-i):
            # Check if the current substring is in A
            if(inA(x[i:i+j+1])):
                table[i].append(True)
            # Otherwise, we need to check all substring combinations
            # Fortunately, this is just checking the table since we have
            # already computed these values
            else:
                # Consider combinations with the character you just added
                tableEntry = False
                for k in range(0, j):
                    if(table[i][j-k-1] and table[i+j-k][k] ):
                        tableEntry = True
                        break
                #end for
                table[i].append(tableEntry)
            # end if
        # end for
        i -= 1
    #end while
    return(table[0][len(x)-1]) 
        
		

#This is run by "Test Run"
def main():
    def inA(x):
        return x in ['0','10']

    assert(inAstar('0101000010', inA))

    assert(not inAstar('000110010', inA))

if __name__ == '__main__':
    main()


