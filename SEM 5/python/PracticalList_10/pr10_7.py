class Student:
    enro=0
    name=""
    course=""
    sem=0
    java=0
    python=0
    dba=0
    cg=0
    mvc=0
    def __init__(this):
        this.enro=0
        this.name=""
        this.course=""
        this.sem=0
        this.java=0
        this.python=0
        this.dba=0
        this.cg=0
        this.mvc=0
    def setValue(this,enro,name,course,sem,java,python,dba,cpi,mvc):
        this.enro=enro
        this.name=name
        this.course=course
        this.sem=sem
        this.java=java
        this.python=python
        this.dba=dba
        this.cg=cg
        this.mvc=mvc
    def result(this):
        total=this.java+this.python+this.dba+this.cg+this.mvc
        per=total*100/500
        grade=""
        if( per>=50 and per<60 ):
            grade='C'
        elif( per>=60 and per<70 ):
            grade='B'
        elif( per>=70 and per<80 ):
            grade='A'
        elif( per>=80 ):
            grade='O'
        else:
            grade='D'
        print("Grade =",grade)
obj=Student()
enro=int(input("enter enrollment no:"))
name=input("enter name:")
course=input("enter Course:")
sem=int(input("enter Semester:"))
java=int(input("enter java Marks:"))
python=int(input("enter python Marks:"))
dba=int(input("enter dba Marks:"))
cg=int(input("enter cpi Marks:"))
mvc=int(input("enter mvc Marks:"))
obj.setValue(enro,name,course,sem,java,python,dba,cg,mvc)
obj.result()
