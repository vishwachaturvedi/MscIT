import array as arr
a = arr.array('i',[10,20,30,40,50])
print(a)

a.insert(3,60)
a.insert(6,70)
print("After adding two elements :",a)
a.append(80)
print("After adding one element at end: ",a)
print("Fifth element:",a[4])
print("Length of an array:", len(a))
for i in a:
    print(i, end=" ")

