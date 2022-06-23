from tkinter import *

root=Tk() #helps in creating window
'''
root.minsize(300,300) # minimum size of window cant minimise anymore
root.maxsize(700,700) # maximum size of window cant maximise anymore

root.geometry("400x400") #actual size of window but can be resizeable
root.resizable(0,0) #actual size only no resize able
un=Label(root,text="Enter name",font=("Arial",15),bg="red",fg="white",width="15",height="1") #no msg will display & height means rows
un.pack() #after packing the widget then only it will display
name=Entry(root) # entry method is used as a input method and widhth means no. of character
name.pack()
submit=Button(root,text="submit")
submit.pack(root)
'''
root.geometry("500x500") #actual size of window but can be resizeable
root.resizable(0,0) #actual size only no resize able

un=Label(root,text="Enter Name",font=("Arial",20))
un.grid(row=0,column=0,pady=25,sticky=W) #create table and then put the widgets as per row and column no given in parameter and sticky means adjusting text align in the row column as per N,S,E,W

name=Entry(root,font=("Arial",20))
name.grid(row=0,column=1,pady=25) #pady will leave space on top

p=Label(root,show="*",text="Enter Password",font=("Arial",20)) #show attribute will help in hiding password
p.grid(row=1,column=0,pady=25) #create table and then put the widgets as per row and column no given in parameter

password=Entry(root,font=("Arial",20))
password.grid(row=1,column=1,pady=25) #pady will leave space on top

submit=Button(root,text="Login",font=("Arial",20))
submit.grid(row=2,column=0,columnspan=2,pady=25 )

root.mainloop() #when window is closed then only code after this line will exceute
print("hello world")
