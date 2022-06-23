class employee:
    name="null"
    salary=0
    def inputData(this):
        this.name=input("enter employee name:")
        this.salary=float(input("enter salary:"))
    def displayData(this):
        print("employee name=",this.name)
        print("employee salary=",this.salary)
e1=employee()
e1.inputData()
e1.displayData()
e2=employee()
e2.inputData()
e2.displayData()
e3=employee()
e3.inputData()
e3.displayData()
