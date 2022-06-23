from tkinter import *
from tkinter import messagebox as msgs

root=Tk()
root.title('Marksheet')
root.geometry('500x500')

maxi=IntVar()
eng=IntVar()
math=IntVar()
sci=IntVar()
ss=IntVar()
hin=IntVar()
g=StringVar()

def cal():
    grade=''
    g1=''
    mx=float(maxi.get())
    msg='Mark Can not be lesser than 0.'
    msg1='Marks Can not be greater than '+str(mx)
    e=float(eng.get())
    if(e<0):
        msgs.showinfo('Incorrect Value',msg)
    if(e>mx):
        msgs.showinfo('Incorrect Value',msg1)
    if(e<40):
        g1='FAIL'
    mt=float(math.get())
    if(mt<0):
        msgs.showinfo('Incorrect Value',msg)
    if(mt>mx):
        msgs.showinfo('Incorrect Value',msg1)
    if(mt<40):
        g1='FAIL'
    sc=float(sci.get())
    if(sc<0):
        msgs.showinfo('Incorrect Value',msg)
    if(sc>mx):
        msgs.showinfo('Incorrect Value',msg1)
    if(sc<40):
        g1='FAIL'
    s=float(ss.get())
    if(s<0):
        msgs.showinfo('Incorrect Value',msg)
    if(s>mx):
        msgs.showinfo('Incorrect Value',msg1)
    if(s<40):
        g1='FAIL'
    h=float(hin.get())
    if(h<0):
        msgs.showinfo('Incorrect Value',msg)
    if(h>mx):
        msgs.showinfo('Incorrect Value',msg1)
    if(h<40):
        g1='FAIL'
    total=e+mt+sc+s+h
    t=5*mx
    per=(total/t)*100
    p=int(per)
    if(g1==''):
        if(p<40):
            grade='FAIL'
        elif(p<=45):
            grade='PASS'
        elif(p<=60):
            grade='SECOND'
        elif(p<=75):
            grade='FIRST'
        elif(p>75):
            grade='DISTINCTION'
        g.set(grade)
    else:
        g.set(g1)

lEnro=Label(text='Enrollment No. ').grid(row=1,column=1)
lName=Label(text='Name ').grid(row=2,column=1)
lMax=Label(text='Maximum Marks ').grid(row=3,column=1)
lEng=Label(text='English ').grid(row=4,column=1)
lMath=Label(text='Mathematics ').grid(row=5,column=1)
lSci=Label(text='Science ').grid(row=6,column=1)
lSs=Label(text='Social Science ').grid(row=7,column=1)
lHin=Label(text='Hindi ').grid(row=8,column=1)
lGrade=Label(textvariable=g).grid(row=10,column=2)

tEnro=Entry().grid(row=1,column=2)
tName=Entry().grid(row=2,column=2)
tMax=Entry(textvariable=maxi).grid(row=3,column=2)
tEng=Entry(textvariable=eng).grid(row=4,column=2)
tMath=Entry(textvariable=math).grid(row=5,column=2)
tSci=Entry(textvariable=sci).grid(row=6,column=2)
tSs=Entry(textvariable=ss).grid(row=7,column=2)
tHin=Entry(textvariable=hin).grid(row=8,column=2)

btnCal=Button(text='Calculate Grade',command=cal).grid(row=9,column=2)

root.mainloop()
