
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
    ev_state = (1.0/N)*(sum(A) - len(B_list)*stake)
    ev = 0 
    # If this value is positive, roll again!
    if ev_state > 0:
        for val in A:
            #print "Roll again! Stake =  ", val+stake
            ev_temp = DieN_expectedValue(N, B, val+stake)
            
            ev += ev_temp/float(N)
        #end for
    # Otherwise, I want to quit the game and return my current winnings
    else:
        #print "Quitting. Winnings = ", stake
        ev = stake
    #end if
    
    return ev

if __name__ == "__main__":
    
    ev = DieN_expectedValue(N=8, B=[1,0,1,0,1,1,1,0])
    print "Expected Value: ", ev
    
    
    ev = DieN_expectedValue(N=4, B=[0,1,1,1])
    print "Expected Value: ", ev
    