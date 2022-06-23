import array as arr 

a = arr.array('i',[10,20,30,40,50])
b = []
c = len(a) - 1
for i in range(len(a)):
    b.append(a[c])
    c -= 1
print(b)
