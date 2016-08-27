a = 0
b = -1
c = 0
i = 100

while a != b:
    print 'a = ', a, ' b = ', b, ' c = ', c, ' i = ', i
    b = a
    c = c+1
    if c < i:
        a = a + 1
    

print ' Final a = ', a, ' b = ', b, ' c = ', c, ' i = ', i