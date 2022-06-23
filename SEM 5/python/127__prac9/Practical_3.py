import array as arr
a = arr.array('f', [0] * 10)
print(a)
for i in range(10):
    a[i] = float(input("Enter a number: "))

print(a)
