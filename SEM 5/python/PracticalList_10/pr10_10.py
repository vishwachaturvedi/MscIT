class CollegeCourse:
    dept=""
    coursenum=0
    ch=0
    tution=0
    def getAllDetails(this,dept,coursenum,ch,tution):
        this.dept=dept
        this.coursenum=coursenum
        this.ch=ch
        this.tution=tution
    def showDetails(this):
        print("department =",this.dept)
        print("course Number =",this.coursenum)
        print("credit Hours =",this.ch)
        print("tution Fee =",this.tution)     
class LabCourse(CollegeCourse):
    labfee=0
    def getAllDetails(this,dept,coursenum,ch,tution,labfee):
        CollegeCourse.getAllDetails(this,dept,coursenum,ch,tution)
        this.labfee=labfee
    def showDetails(this):
        CollegeCourse.showDetails(this)
        print("lab fee =",this.labfee)
        print("total fee =",this.tution+this.labfee)
obj=LabCourse()
dept=input("enter department:")
coursenum=int(input("enter course name:"))
ch=int(input("enter credit hours:"))
tution=int(input("enter tution fee:"))
labfee=int(input("enter lab fee:"))
obj.getAllDetails(dept,coursenum,ch,tution,labfee)
print()
obj.showDetails()
