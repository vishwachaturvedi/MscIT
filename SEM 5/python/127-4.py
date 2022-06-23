from tkinter import *

root=Tk()
root.title('Home')
root.geometry('300x300')

def bgRed():
    root.config(bg='red',cursor='circle')

def bgYellow():
    root.config(bg='light yellow',cursor='cross')

def bgPink():
    root.config(bg='light pink',cursor='dotbox')

def bgBlue():
    root.config(bg='light blue',cursor='heart')

def ext():
    root.destroy()

m1=Menu()
root.config(menu=m1)

Color_Menu=Menu(m1)
m1.add_cascade(label='Color Menu',menu=Color_Menu)
Color_Menu.add_command(label='Red',command=bgRed)
Color_Menu.add_command(label='Light Yellow',command=bgYellow)
Color_Menu.add_command(label='Light Pink',command=bgPink)
Color_Menu.add_command(label='Light Blue',command=bgBlue)
Color_Menu.add_command(label='Exit',command=ext)

root.mainloop()
