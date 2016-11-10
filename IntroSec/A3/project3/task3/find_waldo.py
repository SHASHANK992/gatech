#!/usr/bin/python
import json, sys, hashlib

def usage():
    print """Usage:
    python find_waldo.py student_id (i.e., qchenxiong3)"""
    sys.exit(1)

#TODO -- n1 and n2 share p or q?
def is_waldo(n1, n2):
    result = False

    #your code start here
    # Used the division Euclidean algorithm to find the 
    # greatest common divisor between the 2 keys
    # https://en.wikipedia.org/wiki/Euclidean_algorithm#Implementations
    if gcd(n1, n2) != 1:
        # If the GCD is not 1, then we have a shared prime
        # This is vulnerability and also my waldo
        result = True
    #your code ends here

    return result

#TODO -- get private key of n1
def get_private_key(n1, n2, e):
    d = 0

    #your code starts here
    
    # Find the gcd again
    # This is one prime (the common one)
    p = gcd(n1, n2)
    
    # We can get the other prime values by dividing by p
    q1 = n1/p
    q2 = n2/p
    
    d =  get_key(p, q1, e)
    
    #your code ends here

    return d
    
# Compute the private key
def get_key(p, q, e):
    d = 0

    # your code starts here
       
    totient = (p-1)*(q-1)
    
    # Need d*e % totient = 1
    # In other words
    # de = totient*k + 1 for integer k
    # Find d such that it is an integer
    for k in range(1, e):
        d = (totient*k + 1)/e
        
        # I don't know why, but fur some reason my algebra above
        # doesn't always work. So I explicitly check it here.
        # Finds the key fast enough
        if ((d*e) % totient) == 1:
            break    
    
    # your code ends here

    return int(d)
    

# Finds the greatest common divisor between 2 numbers
# Will return 1 if no common divisors (because 1 is always common) 
def gcd(a, b):
    while b != 0:
        temp = b
        b = a % b
        a = temp
        
    return a
    

def main():
    if len(sys.argv) != 2:
        usage()

    all_keys = None
    with open("keys.json", 'r') as f:
        all_keys = json.load(f)

    name = hashlib.sha224(sys.argv[1].strip()).hexdigest()
    if name not in all_keys:
        print sys.argv[1], "not in keylist"
        usage()

    pub_key = all_keys[name]
    n1 = int(pub_key['N'], 16)
    e = int(pub_key['e'], 16)
    d = 0
    waldo = "dolores"

    print "your public key: (", hex(n1).rstrip("L"), ",", hex(e).rstrip("L"), ")"

    for classmate in all_keys:
        if classmate == name:
            continue
        n2 = int(all_keys[classmate]['N'], 16)

        if is_waldo(n1, n2):
            waldo = classmate
            d = get_private_key(n1, n2, e)
            break
    
    print "your private key: ", hex(d).rstrip("L")
    print "your waldo: ", waldo


if __name__ == "__main__":
    main()
