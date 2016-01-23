
'''
Input:
    N: Number of sides to the die
    B: A list of of length N that has a 1 to note "bad" sides
'''
def DieN_expectedValue(N=30, B=[0,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0], stake=0):
    # Set some things up first
    
    B_list = []
    for i in range(1,N+1):
        if B[i-1] == 1:
            B_list.append(i)
    #end for
    
    A = []
    for i in range(1,N+1):
        if i not in B_list:
            A.append(i)
    #endfor
        
    # With your current stakes, calculate value of rolling again
    ev = (1.0/N)*(sum(A) - len(B)*stake)
    print ev
    
    # If this value is positive, then I want to find the path that gives me
    # maximum reward
    if ev >= 0:
        ev_max = 0
        for val in A:
            print "Recursion: ", val
            ev_temp = DieN_expectedValue(N, B, val+stake)
            
            if ev_temp > ev_max:
                ev_max = ev_temp
        #end for
        
        ev = ev_max/len(B)
        
    # Otherwise, I want to quit the game and return my current winnings
    else:
        print "Returning: ", stake
        ev = stake
    #end if
    
    return ev

if __name__ == "__main__":
    ev = DieN_expectedValue(N=8, B=[1,0,1,0,1,1,1,0])
    
    print "Expected Value: ", ev