from tkinter import *

root=Tk()
root.geometry("500x500")

def show():
    root.config(background="red")


b1=Button(text="CHANGE",command=show)
b1.pack()

root.mainloop()
