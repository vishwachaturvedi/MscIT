class FLOAT:
    fa=0
    def __init__(this,f=0):
        this.fa=f
    def getdata(this,value):
        this.fa=f
    def display(this):
        print(this.fa)
    def __iadd__(this,add):
        return this.fa+add.this.add.fa
    def __isub__(this,sub):
        return this.fa-sub.fa
f1=FLOAT()
f=float(input("enter Value 1:"))
f1.getdata(f)
f1.display()
f3=FLOAT()
f=float(input("Eenter Value 2:"))
f3.getdata(f)
f3.display()
f2=FLOAT()
f=float(input("enter value For addition & subtract:"))
f2.getdata(1)
f1 += f2
print(f1)
f3 -= f2
print(f3)
