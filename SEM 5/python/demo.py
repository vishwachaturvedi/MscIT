from tkinter import *
from tkinter import messagebox
from tkinter.filedialog import askopenfilename

root=Tk()
root.title("menubar")
root.geometry("500x500")
    
m1=Menu()
root.config(menu=m1)
var=StringVar()
e=Entry()

def show():
    var=e.get()
    messagebox.showinfo("",var)

def new():
    l1=Label(text="name",bg="purple",font="20")
    l1.grid(row=1,column=1)
    e.grid(row=1,column=2)
    b1=Button(text="SUBMIT",command=show)
    b1.grid(row=2,column=2)

def open():
    name=askopenfilename()
    print(name)
    

file=Menu(m1)
m1.add_cascade(label="file",menu=file)
file.add_command(label="new",command=new)
file.add_command(label="open",command=open)
file.add_command(label="exit",command=root.destroy)

edit=Menu(m1)
m1.add_cascade(label="edit",menu=edit)
edit.add_command(label="undo")
edit.add_command(label="redo")

root.mainloop()
