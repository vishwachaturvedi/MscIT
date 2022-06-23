list=[]
for i in range(1,16):
    str="Enter mark of student {0}:"
    m=int(input(str.format(i)))
    list.append(m)
fail=0
sum=0
fail_list=[]
for i in list:
    sum=sum+i
    if(i<42):
        fail=fail+1
        fail_list.append(i)
avg=sum//15
print("Summary Report:")
print("Minimum Marks: ",end="")
print(min(list))
print("Maximum Marks: ",end="")
print(max(list))
str="Avarage Marks of 15 Student is :: {0}. "
print(str.format(avg))
print("Number of student who fail in exam (passing criteria is 42): ",end="")
print(fail)
print("list of marks for student who are fail: ",end="")
print(fail_list)
m1=int(input("Enter first new marks: "))
m2=int(input("Enter Second new marks: "))
list.append(m1)
list.append(m2)
print("list of marks after adding new 2 marks: ",end="")
print(list)
