class SHAPE:
    r=0
    a=0
    h=0
    b=0
    l=0
    w=0
    areac=0
    arear=0
    areas=0
    areat=0
    def __init__(this,r=2.3,a=3,h=2,b=3,l=5,w=2):
        this.r=r
        this.a=a
        this.h=h
        this.b=b
        this.l=l
        this.w=w
    def areaOfCircle(this):
        this.areac=3.14*(this.r*this.r)
        print("Area of circle =",this.areac)
    def areaOfSquare(this):
        this.areas=this.a*this.a
        print("Area of square =",this.areas)
    def areaOfRectangle(this):
        this.arear=this.w*this.l
        print("Area of rectangle =",this.arear)
    def areaOfTriangle(this):
        this.areat=(this.h*this.b)/2
        print("Area of triangle =",this.areat)
obj=SHAPE()
obj.areaOfCircle()
obj.areaOfSquare()
obj.areaOfRectangle()
obj.areaOfTriangle()
