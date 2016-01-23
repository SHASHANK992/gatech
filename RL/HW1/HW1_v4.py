
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
    
    ev = 0
    for val in A:
        # Find out if the expected value of the next state is worth the risk
        print val+stake
        ev_temp = (1.0/N)*(val+stake - len(B)*stake)
        
        # If the expected value is positive, then the reward
        # value is still increasing. Exploit this
        if ev_temp > 0:
            print "Recursion: ", val
            ev += (1.0/len(B))*DieN_expectedValue(N, B, val+stake)
        # Otherwise we don't want to keep calculating EV
        # However, we do want to continue iterating through the values
        # of A to see if there is a value we can roll that would 
        # increase the reward
        else:
            print "Return: ", val   
            ev = stake      
    #end for
    
    return ev

if __name__ == "__main__":
    
    ev = DieN_expectedValue(N=8, B=[1,0,1,0,1,1,1,0])
    
    print "Expected Value: ", ev
    
    '''
    ev = DieN_expectedValue(N=4, B=[0,1,1,1])
    print "Expected Value: ", ev
    '''