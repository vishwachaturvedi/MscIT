class Time:
    hours=0
    minutes=0
    seconds=0
    sumh=0
    summ=0
    sums=0
    def __init__(this,h,m,s):
        this.hours=h
        this.minutes=m
        this.seconds=s
    def __add__(this,obj):
        sumh=this.hours+obj.hours
        summ=this.minutes+obj.minutes
        sums=this.seconds+obj.seconds
        while sums>=60 or summ>=60:
            if(sums>=60):
                summ=summ+1
                sums=sums-60
            if(summ>=60):
                sumh=sumh+1
                summ=summ-60
                print(sumh,"hours,",summ,"minutes,",sums,"seconds")
t1=Time(int(input("enter hours:")),int(input("enter minutes:")),int(input("enter seconds:")))
t2=Time(int(input("enter hours:")),int(input("enter minutes:")),int(input("enter seconds:")))
print(t1+t2)
