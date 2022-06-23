from tkinter import *

root=Tk()
root.title('Reverse Number')
root.geometry('500x500')
num=StringVar()
rev=StringVar()

def reverse():
    n=int(num.get())
    r=0
    rem=0
    while(n>0):
        rem=n%10
        r=r*10+rem
        n=n//10
    rev.set(str(r))

lblNum=Label(text='Enter Number : ').grid(row=1,column=1)
txtNum=Entry(textvariable=num).grid(row=1,column=2)
lblRev=Label(text='Reversed Number : ').grid(row=2,column=1)
btnRev=Button(text='Do Reverse',command=reverse).grid(row=3,column=2)
txtRev=Entry(textvariable=rev).grid(row=2,column=2)

root.mainloop()
