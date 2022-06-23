class Company:
    cname="null"
    oname="null"
    def __init__(this,cname,oname):
        this.cname=cname
        this.oname=oname
    def __eq__(this,obj):
        if(this.cname==obj.cname):
            print("Both Company Are Same")
        else:
            print("Both Company Are Different")
            
print("Enter Details For Company 1")
c1=Company(input("Enter Company Name:"),input("enter owner name:"))
print("\nEnter Details For Company 2")
c2=Company(input("Enter Company Name:"),input("enter owner name:"))
c1==c2
