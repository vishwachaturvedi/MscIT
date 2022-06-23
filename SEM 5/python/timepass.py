class timepass:
    def  __init__(self):
        self.name=input("enter name=")
        self.enrollment=int(input("enter enrollment"))
        self.percentage=float(input("enter percentage"))

    def writeinfile(self):
        f1=open("food.txt","a")
        f1.write("name ="+self.name+"\n")
        f1.write("enrollment="+self.enrollment+"\n")
        f1.write("percentage="+self.percentage+"\n")
        f1.close()

    def displaydata(self):
        print("name ="+self.name+"\n")
        print("enrollment="+self.enrollment+"\n")
        print("percentage="+self.percentage+"\n")

t=timepass()
t.writeinfile()
t.displaydata()
    
    
    
    
