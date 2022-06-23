class kruti:
    def __init__(self):
        self.name= (input("enter name:"))
        self.enrollment=int(input("enter enrollment:"))

    def writeinfile(self):
        f1=open("vaishnavi.txt","a")
        f1.write("name="+self.name+"\n")
        f1.write("enrollment="+self.enrollment+"\n")
        f1.close()

    def displaydata(self):
         print("name="+self.name+"\n")
         print("enrollment="+self.enrollment+"\n")

k=kruti()
k.writeinfile()
k.displaydata()
        
