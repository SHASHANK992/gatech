import math as m

# Use definitions from here
# https://en.wikipedia.org/wiki/Standard_deviation

# We don't have the fancy numpy library to do the calculations
# in a vector/matrix way, so we will have to iterate over lists

# calculate the population standard deviation
def stdev_p(data):
    len_data = len(data)
    sum_data = sum(data)
    # Compute average
    xbar = sum_data/len_data
    
    sum_sq_diff = 0
    for x in data:
        sum_sq_diff += (x-xbar)**2
    #end for
    
    result = m.sqrt( sum_sq_diff/len_data )
    
    return result

# calculate the sample standard deviation
def stdev_s(data):
    len_data = len(data)
    sum_data = sum(data)
    # Compute average
    xbar = sum_data/len_data
    
    sum_sq_diff = 0
    for x in data:
        sum_sq_diff += (x-xbar)**2
    #end for
    
    result = m.sqrt( sum_sq_diff/(len_data-1) )
    return result