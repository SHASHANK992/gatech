'''
Inputs:
    n: length of input arrays (must be odd for median to be defined)
    xPresent: one input array, not necessarily ordered
    yPresent: second input array, not necessarily ordered
    xMissing: index of missing element in x array
    yMissing: index of missing element in y array
    k: 
    
    Linf is the largest of the absolute value of the components of the input arrays
'''
def findMissingComponents(n, xPresent, yPresent, xMissing, yMissing, k):
    # I have two unknows (x component and y component). To solve for them
    # I need two equations. Unfortunately they are not exactly equations, 
    # more like constraints. 

    # Order input arrays from least to greatest to calculate median
    xOrdered = sorted(xPresent)
    yOrdered = sorted(yPresent)
    
    for i in range(n):
        median_x = 0
        for j in range(n):
            # For each possible location for the missing component, 
            # apply the median constraint equation to par down the 
            # possible values
            median_y = 0
            
    
    
    # Find missing component for input arrays
    
    # Using missing component, find L infinity norm

    return bestX, bestY, Linf
#end findMissingComponents

if __name__ == "__main__":
    '''
    print "\n\n\n*************************************************"
    print " Test 0"
    print "*************************************************"
    x = [ -70, 110 ]
    y = [ 32, -240 ]
    n = 3
    xMissing = 1
    yMissing = 1
    k = 115
    print findMissingComponents(n, x, y, xMissing, yMissing, k)
    '''
    
    '''
    print "\n\n\n*************************************************"
    print "Problem 2"
    print "*************************************************"
    x = [ -127, 54, 225, 221, -15, -237, 242, -87, 233, 127, 18, 17, -128, 132 ]
    y = [ 25, 208, -224, 235, -86, 125, -115, -231, 106, 12, -184, 254, -78, -94 ]
    print "X ordered: ", sorted(x)
    print "Y ordered: ", sorted(y)
    '''
    
    
    print "\n\n\n*************************************************"
    print "Problem 3"
    print "*************************************************"
    x = [ -53, 117, 119, 217, -28, -42, -241, 238, -8, 132, -13, -53 ]
    y = [ -218, -157, -61, -104, 68, -255, -138, -159, 20, 39, 248, -253 ]  
    print "X ordered: ", sorted(x)
    print "Y ordered: ", sorted(y)
    
    

#end main