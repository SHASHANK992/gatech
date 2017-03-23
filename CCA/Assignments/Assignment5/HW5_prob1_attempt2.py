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
    #Your code here

    # This seems very similar to the matrix multiplication example from lecture

    # Keep a table like the matrix multiplication one
    # Fill in the diagonal first
    # If the entries to the immediate left and immediate below are both
    # true, then the current entry is also true
    # If they are not, then rcall inA on the substring being considered
    # Return the element in the top right

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
            tableEntry = False
            # if the entry on the left is true and the
            # entry below is true, this entry is also true
            if table[i+1][j-1] == True and table[i][j-1] == True:
                tableEntry = True
            # otherwise, we need to see if  the substring under
            # consideration is in A            
            else:
                table[i].append(inA(x[i:i+j+1]))
            # end if

            # We have tested if the substring up to the current character and the current
            # are both in A and we have tested if the entire substring is in A. Now we need
            # to consider if any combination of the 
            
            table[i].append(tableEntry)
        # end for
        i -= 1
    #end while
    print(table)
        
        
		

#This is run by "Test Run"
def main():
    def inA(x):
        return x in ['0','10']

    assert(inAstar('0101000010', inA))

    assert(not inAstar('000110010', inA))

if __name__ == '__main__':
    main()


