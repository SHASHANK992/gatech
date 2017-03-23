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

    # Start from the left
    table = []
    table.append(inA(x[0]))
    for i in range (1,len(x)):
        # We need to keep a connection between the substrings
        # in A, so we will do a lot of searching the table
        # for True values
        
        # if the current character is in A and the substring
        # so far is in A, we record it
        # in the table and move on
        if table[i-1] == True and inA(x[i]):
            table.append(True)
        # if the current character is not in A or the substring
        # so far is not in A, we need
        # to search back to the beginning of the string
        # If we find a substring that is inA, we need to
        # test if the substring from the current position
        # to this substring in A is also a substring in A
        else:
            j = i
            validss = False
            # Search up to the first character
            while j > 0:
                if table[j-1] == True:
                    validss = (validss or inA(x[j:i+1]))
                j -= 1
            #end while
            # Also check if the whole substring so far is in A
            validss = validss or inA(x[0:i+1])
            table.append(validss)
        #end if
    #end for
    return table[len(x)-1]
		

#This is run by "Test Run"
def main():
    def inA(x):
        return x in ['0','10']

    assert(inAstar('0101000010', inA))

    assert(not inAstar('000110010', inA))

if __name__ == '__main__':
    main()


