from tkinter import *
from tkinter import messagebox
from tkinter.filedialog import askopenfilename

root = Tk()
root.title("Registration")
root.geometry('550x500')
menubar=Menu()
root.config(menu=menubar)
filemenu=Menu(menubar)

def newone():
    child =Toplevel(root)
    child.geometry('300x300')
    child.title("new child")
    lblname = label(child,text="Enter your name",bg="orange")
    lblname = grid(row=1,column=1)
    textname = Entry(child)
    textname = grid(row=1,column=2)

    def show():
        message.showinfo('Your Name',textname.get())
        button = button(child,text="submit", command=show)
        button = grid(row=2,column=2)
def op():
    name=askopenfilename()
    print(name)
    
        
#menubar=Menu(root)
menubar.add_cascade(label = "File", menu = filemenu)
filemenu.add_command(label = "New", command = newone)
filemenu.add_command(label = "open", command = openfile)
filemenu.add_command(label = "options", command = op)
filemenu.add_seperator()
filemenu.add_command(label = "Exit", command = root.destroy)

editmenu = Menu(filemenu, tearoff = 0)
menubar.add_cascade(label = "Edit", menu = editmenu)
editmenu.add_command(label = "Undo")
editmenu.add_command(label = "Redo")
editmenu.add_command(lebel = "Copy")
editmenu.add_command(label = "paste")

opmenu = Menu(editmenu, tearoff =0)
menubar.add_cascade(label = "Options", menu=opmenu)
opmenu.add_command(label = "Configure")

helpmenu = Menu(opmenu, tearoff= 0)
menubar.add_cascade(label = "Help", menu = helpmenu)
helpmenu.add_command(label = "Aout us")
helpmenu.add_seperator()
helpmenu.add_command(label = "About IDE")

root.config(menu = menubar)
root.mainloop()
