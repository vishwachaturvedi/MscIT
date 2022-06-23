from tkinter import *
from tkinter import messagebox
import tkinter as t
import tkFont as f
root =Tk()
master.geometry("500x200")
def func():
 messagebox.showinfo( "Hello Educba", "Button having Lucida with bold font and size is 20")
bfont = tkFont.Font(family='Lucida Console', weight = 'bold', size = 20)
b1 = Button(text='Click me for Lucida', background='Cyan', fg='#000000', command = func)
b1['font'] = bfont
b1.pack()
def func1():
 messagebox.showinfo( "Hello Educba", "Button having Courier with Italic font and size is 10")
bfont1 = tkFont.Font(family='Courier', slant = 'italic', size = 10)
b2 = Button(text='Click me for Courier ', background='Orange', fg='#07F', command = func1)
b2['font'] = bfont1
b2.pack()
root.mainloop()
