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

    # your code ends here
    return (p, q)

# TODO: write code to get d from p, q and e
def get_key(p, q, e):
    d = 0

    # your code starts here

    # your code ends here
    return d

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
