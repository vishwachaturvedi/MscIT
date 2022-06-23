#multilevel inheritance
class Person:
    name=""
    gender=""
    age=0
    def getPersonDetail(this,name,gender,age):
        this.name=name
        this.gender=gender
        this.age=age        
    def showPersonDetail(this):
        print("employee name =",this.name)
        print("gender =",this.gender)
        print("age =",this.age)
class Employee(Person):
    company=""
    salary=0
    def getEmpDetail(this,company,salary):
        this.company=company
        this.salary=salary        
    def showEmpDetail(this):
        print("company =",this.company)
        print("salary =",this.salary)
class Typist(Employee):
    speed=0
    def getData(this,speed):
        this.speed=speed        
    def display(this):
        print("typing speed =",this.speed)
name=input("enter employee name:")
gender=input("enter gender:")
age=int(input("enter age:"))
company=input("enter company:")
salary=float(input("enter salary:"))
speed=int(input("enter speed:"))
obj=Typist()
obj.getPersonDetail(name,gender,age)
obj.getEmpDetail(company,salary)
obj.getData(speed)
print()
obj.showPersonDetail()
obj.showEmpDetail()
obj.display()
