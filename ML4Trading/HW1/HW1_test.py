import time
from stdev_code import stdev_p
from stdev_code import stdev_s

def test_population_accuracy():
    test = [2.0, 4.0, 4.0, 4.0, 5.0, 5.0, 7.0, 9.0]
    std_dev_p = stdev_p(test)
    
    print "Population std dev: ", std_dev_p
    
    test = [2, 4, 4, 4, 5, 5, 7, 9]
    std_dev_p = stdev_p(test)
    
    print "Population std dev: ", std_dev_p
    return 0
    
def test_sample_accuracy():
    test = [2.0, 4.0, 4.0, 4.0, 5.0, 5.0, 7.0, 9.0]
    std_dev_s = stdev_s(test)
    
    print "Sample std dev: ", std_dev_s
    
    test = [2, 4, 4, 4, 5, 5, 7, 9]
    std_dev_s = stdev_s(test)
    print "Sample std dev: ", std_dev_s
    return 0
    
def test_population_speed():
    # Create a long list
    test = []
    for i in range(0,1000):
        test.append(i)
    
    # Time how long it takes to run the standard deviation calculation
    t1 = time.time()
    std_dev_p = stdev_p(test)
    t2 = time.time()
    
    print "Time difference for population is: ", t2-t1
    
    return 0
    
def test_sample_speed():
    # Create a long list
    test = []
    for i in range(0,1000):
        test.append(i)
    
    # Time how long it takes to run the standard deviation calculation
    t1 = time.time()
    std_dev_p = stdev_s(test)
    t2 = time.time()
    
    print "Time difference for sample is: ", t2-t1
    
    return 0

def test_population_empty():
    test = []
    std_dev_p = stdev_p(test)
    
    print "Population std dev: ", std_dev_p
    return 0

def test_population_nan():
    test = [1, 2, float('nan')]
    std_dev_p = stdev_p(test)
    
    print "Population std dev: ", std_dev_p
    
    test = [ float('nan')]
    std_dev_p = stdev_p(test)
    
    print "Population std dev: ", std_dev_p
    return 0
    
def test_sample_empty():
    test = []
    std_dev_s = stdev_s(test)
    
    print "Sample std dev: ", std_dev_s
    return 0

def test_population_one():
    test = [1]
    std_dev_p = stdev_p(test)
    print "Population std dev: ", std_dev_p
    return 0

def test_sample_one():
    test = [1]
    std_dev_s = stdev_s(test)
    
    print "Sample std dev: ", std_dev_s
    return 0
    
def test_sample_nan():
    test = [1, 2, float('nan')]
    std_dev_s = stdev_s(test)
    
    print "Sample std dev: ", std_dev_s
    return 0
   
def test_population_none():
    test = None
    std_dev_p = stdev_p(test)
    
    print "Population std dev: ", std_dev_p
    return 0


if __name__ == "__main__":
    test_population_accuracy()
    
    test_sample_accuracy()
    
    test_population_speed()
    
    test_sample_speed()
    
    test_population_empty()
    
    test_population_nan()
    
    test_population_one()
    
    test_sample_empty()
    
    test_sample_one()
    
    test_sample_nan()
    
    #test_population_none()