#!/usr/bin/python
import json, sys, hashlib

def usage():
    print """Usage:
        python get_pri_key.py student_id (i.e., qchenxiong3)"""
    sys.exit(1)

# TODO -- get n's factors
# reminder: you can cheat ;-), as long as you can get p and q
def get_factors(n):
    p = 0
    q = 0

    # your code starts here
    
    # Use the fancy algorithm here
    # http://www2.mae.ufl.edu/~uhk/FACTORING-LARGE-COMPOSITE-NUMBERS.pdf
    
    littleN = int(n**0.5)+1
    
    # I just set some arbitrary range to search
    for i in range(littleN, littleN+100000):
        p = littleN - ((littleN**2 - n)**0.5)
        
        if float(p).is_integer:
            q = littleN + ((littleN**2 - n)**0.5)
            break
    #end for
    
    p = int(p)
    q = int(q)
    
    # your code ends here
    return (p, q)

# TODO: write code to get d from p, q and e
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

def main():
    if len(sys.argv) != 2:
        usage()

    n = 0
    e = 0

    all_keys = None
    with open("keys.json", 'r') as f:
        all_keys = json.load(f)
    
    name = hashlib.sha224(sys.argv[1].strip()).hexdigest()
    if name not in all_keys:
        print sys.argv[1], "not in keylist"
        usage()
    
    pub_key = all_keys[name]
    n = int(pub_key['N'], 16)
    e = int(pub_key['e'], 16)

    print "your public key: (", hex(n).rstrip("L"), ",", hex(e).rstrip("L"), ")"

    (p, q) = get_factors(n)
    d = get_key(p, q, e)
    print "your private key:", hex(d).rstrip("L")

if __name__ == "__main__":
    main()
