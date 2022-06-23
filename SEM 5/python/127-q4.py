#string is Aeioua
s=input("Enter string: ")
x=s.startswith("A")
print("String starts with A:",x)
x=s.endswith("a")
print("String ends with a:",x)
x=s.count("a")
print("Number of a's are:",x)
x=s.istitle()
print("String is in title case",x)

