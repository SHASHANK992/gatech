import math as m

# Use definitions from here
# https://en.wikipedia.org/wiki/Standard_deviation

# We don't have the fancy numpy library to do the calculations
# in a vector/matrix way, so we will have to iterate over lists

'''
Assumptions:
- The data will be passed in as a list, so it will have a length
- The data passed in the list will be of numeric types, i.e., strings
   will not be handled
- Some edge cases are handled - empty lists and 'nan'
'''

# calculate the population standard deviation
def stdev_p(data):
    # Make sure that the list is not empty
    if len(data) == 0:
        return float('nan')

    len_data = len(data)
    sum_data = sum(data)
    # Compute average
    xbar = float(sum_data)/len_data
    
    sum_sq_diff = 0
    for x in data:
        sum_sq_diff += (x-xbar)**2
    #end for
    
    result = m.sqrt( sum_sq_diff/len_data )
    
    return result

# calculate the sample standard deviation
def stdev_s(data):
    # Make sure that the list is not empty
    # For sample std dev, a list of length is also undefined
    if len(data) == 0:
        return float('nan')
    elif len(data) == 1:
        return float('nan')

    len_data = len(data)
    sum_data = sum(data)
    # Compute average
    xbar = float(sum_data)/len_data
    
    sum_sq_diff = 0
    for x in data:
        sum_sq_diff += (x-xbar)**2
    #end for
    
    result = m.sqrt( sum_sq_diff/(len_data-1) )
    return result