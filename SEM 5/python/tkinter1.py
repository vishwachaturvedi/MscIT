from tkinter import*
from tkinter import messagebox

root=Tk()
m1=Menu()
root.config(Menu=m1)
file=Menu(m1)
m1.add_cascade(label="file",Menu=file)
file.add_command(label="new")
file.add_command(label="open")
file.add_command(label="exit")

root.mainloop()
