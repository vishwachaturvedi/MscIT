from tkinter import *
root=Tk()
m1=Menu()
root.config(menu=m1)

file=Menu(m1)
m1.add_cascade(label="file",menu=file)
file.add_command(label="new")
file.add_command(label="open")
file.add_command(label="exit")

edit=Menu(m1)
m1.add_cascade(label="edit",menu=edit)
edit.add_command(label="undo")
edit.add_command(label="redo")
edit.add_command(label="cut")

Format=Menu(m1)
m1.add_cascade(label="Format",menu=Format)
Format.add_command(label="indent")
Format.add_command(label="dedent")



root.mainloop()
