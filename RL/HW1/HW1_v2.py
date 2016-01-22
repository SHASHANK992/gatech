
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
    
    # Iterate until expected value no longer increases
    stake = 0
    ev = 0
    ev_old = 0
    num_rolls = 0
    avg_A = sum(A)/len(A)
    while True:
        if num_rolls == 0:
            ev = stake + (1.0/N)*(sum(A))
        else:
            # For the second roll on, you have to take into account all the different branches
            # you might take
            ev_temp = 0
            for val in A:
                ev_temp += stake + (1.0/N)*(sum(A) - len(B)*val)
            #end for
            
            ev = ev_temp/len(A)
            
            #ev = stake + (1.0/N)*(sum(A) - len(B)*(avg_A))
        
        if ev < ev_old:
            break
        else:
            stake = ev
            ev_old = ev
            num_rolls += 1
    #end while
    
    return ev_old, num_rolls
    

if __name__ == "__main__":
    ev, rolls = DieN_expectedValue(N=8, B=[1,0,1,0,1,1,1,0])
    
    print "Expected Value: ", ev
    print "Number of rolls: ", rolls

