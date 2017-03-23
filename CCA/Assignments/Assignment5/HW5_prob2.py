#Consider an arbitrary string X = x_1...x_n.  
#A subsequence of X is a string of the form 
#x_i_1 x_i_2...x_i_k ,where 1 <= i_1< ... < i_k <= n.  
#A string is palindromic if it is equal to its 
#own reverse (i.e. the string is the same whether 
#read backwards or forwards).  

#a) Derive a recurrence for L(i, j), remembering to include the base case?
# In order for there to be a palindrome, characters at the beginning and
# at the end of the string must match. As such, we have three cases
#   1) Base Case 1: 0 characters - return 0
#   2) Base Case 2: 1 character - automatically a palindrome
#       return 1
#   2) Characters match - increment longest palindromic sequence by 2 and
#      call L on the remaining string
#   3) Characters do not match, so find the maximum subsequence recursively
# Here is an actual implementation for completeness
def L(i,j,s):
    # No characters remaining
    if( i == j):
        return 0
    # One character remaining
    if (i == j+1):
            return 1
    # Characters at the beginning and end of substring match
    if s[i] == s[j]:
        return L(i+1, j-1, s) + 2
    # Characters at the beginning and end of substring do not match
    else:
        return max(L(i+1,j,s), L(i,j-1,s))

#b) Why is your recurrence correct?
    # A palindrome must have pairs of matching letters. In the above recurrence, these
    # pairs are matched. When they are matched, we decrease the substring one characer
    # from each end. When no match is found, we decrease the substring 1 character from 
    # each end separately and compare which has a greater substring length.
    # The substring always becomes smaller, so it will terminate
    
#c) Write a dynamic programming algorithm based on the recurrence for L(i, j) in python.  Use backtracking to construct a longest palindromic subsequence.
    # See below
    
#d) What is its running time?
    # There are two for loops, so the running time is O(n^2)
    # Because of dynamic programming, we order the subproblems in the correct
    # order to not only avoid solving the same problem multiple times
    # but also to keep the memory structure to a minumum
    # Backtracking takes linear time, so it does not affect the
    # asymptotic running time

def lps(s):
    """Returns a longest palindromic subsequence of the string s."""
    # Create a table like the chain matrix multiplication one from lecture
    n = len(s)

    # Create table and fill in diagonal
    # Even though the lower diagonal is not used, it makes
    # indexing very hard if the values aren't present
    table = []
    for i in range(0,n):
        table.append([])
        for j in range(0,n):
            table[i].append(0)
        table[i][i] = 1
    # end for

    # Fill in table working along diagonals
    # Consider substrings of increasing length
    for sslen in range(2, n+1):
        for i in range(0, n-sslen+1):
            j = i+sslen-1
            # By construction, we won't encounter the 0 character case
            # We have already handled the 1 character case
            # Two characters remaining that match
            if( (s[i] == s[j]) and (sslen == 2)):
                table[i][j] = 2
            # More than two characters remain, match
            elif( s[i] == s[j] ):
                table[i][j] = table[i+1][j-1] + 2 
            # No match
            else:
                table[i][j] = max(table[i+1][j], table[i][j-1])
            #end if
        #end for
    #end for
    print(table)

    # So now we have the longest palindromic subsequence in table[0][n-1]
    # Use backtracking to determine the actual sequence
    # Begin at top right
    x = 0
    y = n-1
    palindrome = []
    while x < y:
        if s[x] == s[y]:
            palindrome.append(s[x])
            # Move diagonally
            x += 1
            y -= 1
        elif table[x][y-1] > table[x+1][y]:
            # Move left
            y -= 1
        else:
            # Move down
            x += 1
    # At this point we have reached the diagonal
    # Reverse what we have so far to append to the palindrome
    palindrome_copy = palindrome[::-1]
    if x == y:
        # We have an odd length palindrome, so
        # we need to append one middle character
        # and then the rest of the palindrome
        palindrome.append(s[x])
        palindrome.append(''.join(palindrome_copy))
        #for char in palindrome_copy:
        #    palindrome.append(char)
    else:
        # We have an even length palindrome
        # Append the reversed string
        palindrome.append(''.join(palindrome_copy))
        #for char in palindrome_copy:
        #    palindrome.append(char)

    final_palindrome = ''.join(palindrome)
    return final_palindrome
    



    
def main():
    assert(lps('axayyybaxca4baza') in ['aabacabaa','axayyyaxa', 'aabaxabaa'])
    #s = 'abyyyyycd'
    #print(lps(s))

                                        
if __name__ == "__main__":
    main()



    
