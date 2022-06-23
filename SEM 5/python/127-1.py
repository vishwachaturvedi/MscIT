from tkinter import *
from tkinter import messagebox as m

root=Tk()
root.geometry('300x300')
root.title('Home')
data=StringVar()

def write():
    f=open('demo.txt','a')
    f.write('\n'+data.get())
    f.close()

txtData=Entry(root,textvariable=data).pack()
btnSubmit=Button(text='Submit',command=write).pack()

root.mainloop()
