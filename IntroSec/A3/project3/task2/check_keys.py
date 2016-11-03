# Check the keys



def main():
    # Public key
    N = 0xcd62a80947672c9
    e = 0x10001
    
    # Private key
    d = 0x803370c3c0ee601
    
    # hello in hex
    m = 0x68656c6c6f
    
    # encrypted message
    c = pow(m, e, N)
    
    # decrypted message
    m2 = pow(c,d,N)
    
    print m2 == m


if __name__ == "__main__":
    main()