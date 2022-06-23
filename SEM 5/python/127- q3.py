n = int(input("Enter a number of value that you want to store in dictionary : "))
d = {}

for i in range(n):
    keys = int(input("Enter a key : ")) 
    values = keys 
    d[keys] = values
print(d)

print()
print("1.The keys are")
print(d.keys())
print()
print()

print("2.The values are")
print(d.values())
print()
print()

print("3.Update dictionary by inserting new value")
k = int(input("Enter a new key : "))
v = int(input("Enter a new value : "))
d.update({k:
          v})
print("value updated successfully!!")
print()
print()


print("4.Copy dictionary:")
new = d.copy()
print("old dictionary")
print(d)
print("new copied dictionary")
print(new)
