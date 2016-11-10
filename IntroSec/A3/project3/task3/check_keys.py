# Check the keys



def main():
    # Public key
    N = 0xda4bba04ec636a9d9cde96924ca8f12d8bb0b5e4cd1ac9c0ae06973e24948a8264c56e2b72ea35595132ac4c5e57e3f53f8fe6decb7f23eb1e1c1090ebbf0b1409736736debb84ecd0e5c94acfc5174188a76239baff470e326150324e1cb7fca8d93e4baca17d602fdd7781f9f17efdd18e40009d704b1f96024167219928ef
    e = 0x10001
    
    # Private key
    d = 0x82099a46548ae477ff7a99378d7316388b7e38dc9351e1dd65cd874afd7f7f032e046e1c73d810efa3ef0bb4727ee8ccaf9089772ec20e23814c36921ddd303b25b74f6087eae58b6b26adf72312e4e47b4d65f17bd2f54ee456d5dd00747ab17138e2055d966b47503439a0e74056e28039de2df900acf302008e5d62e1481
    
    # hello in hex
    m = 0x68656c6c6f
    
    # encrypted message
    c = pow(m, e, N)
    
    # decrypted message
    m2 = pow(c,d,N)
    
    print m2 == m


if __name__ == "__main__":
    main()