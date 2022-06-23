from tkinter import *
import os
def pass_not_reg():
    global pass_not_reg
    pass_not_reg=Toplevel(login_screen)
    pass_not_reg.title("Pass not reg")
    pass_not_reg.geometry("200x200")
    Label(pass_not_reg,text="Password is not registered").pack()
    Button(pass_not_reg,text="ok",command=closebtn2).pack()
def login_success():
    global login1_scrn
    login1_scrn=Toplevel(login_screen)
    login1_scrn.title("Login Success")
    login1_scrn.geometry("200x200")
    Label(login1_scrn,text="Login Success").pack()
    Button(login1_scrn,text="ok",command=closebtn1).pack()
def user_not_found():
    global user_not_found_scrn
    user_not_found_scrn=Toplevel(login_screen)
    user_not_found_scrn.title("User Not Found")
    user_not_found_scrn.geometry("200x200")
    Label(user_not_found_scrn,text="User Not found").pack()
    Button(user_not_found_scrn,text="ok",command=closebtn).pack()
def closebtn():
    user_not_found_scrn.destroy()
def closebtn1():
    login1_scrn.destroy()
def closebtn2():
    pass_not_reg.destroy()
def login():
    global login_screen
    global name3
    global password3
    global nam
    global pas
    login_screen=Toplevel(main_screen)
    login_screen.title("Login Screen")
    login_screen.geometry("300x250")
    Label(login_screen,text="Login Screen",height="2",width="300").pack()
    Label(text="").pack()
    Label(login_screen,text="User Name *").pack()
    name3=StringVar()
    password3=StringVar()
    nam=Entry(login_screen,textvariable=name3)
    nam.pack()
    Label(login_screen,text="Password *").pack()
    pas=Entry(login_screen,textvariable=password3,show= '*')
    pas.pack()
    Button(login_screen,text="login",command=login_user).pack()
def login_user():
    name=name3.get()
    passs=password3.get()
    nam.delete(0,END)
    pas.delete(0,END)
    list_of_dir=os.listdir()
    if name in list_of_dir:
        file1=open(name,"r")
        verify=file1.read()
        if passs in verify:
            login_success()
        else:
            pass_not_reg()
    else:
        user_not_found()
def registration():
    global register_screen
    global name2
    global pass2
    register_screen=Toplevel(main_screen)
    register_screen.title("Facebook Registration")
    register_screen.geometry("300x250")
    Label(register_screen,text="Facebook Registration",height="2",width="300").pack()
    Label(text="").pack()
    Label(register_screen,text="User Name *").pack()
    global name
    global password
    name=StringVar()
    password=StringVar()
    name2=Entry(register_screen,textvariable=name)
    name2.pack()
    Label(register_screen,text="Password *").pack()
    pass2=Entry(register_screen,textvariable=password,show= '*')
    pass2.pack()
    Button(register_screen,text="Register",command=register_user).pack()
def register_user():
    name1=name.get()
    pass1=password.get()
    file=open(name1,"w")
    file.write(name1 + "\n")
    file.write(pass1)
    file.close()
    name2.delete(0,END)
    pass2.delete(0,END)
    Label(register_screen,text="Register Successfully").pack()
    
def my_main_screen():
    global main_screen
    main_screen=Tk()
    main_screen.geometry("300x250")
    main_screen.title("Registration/login Screen")
    Label(text="My First Page!!! Select One",fg="purple",height="2",width="300").pack()
    Label(text="").pack()
    Button(text="Login",height="2",width="29", command=login).pack()
    Label(text="").pack()
    Button(text="Registration",height="2",width="30",command=registration).pack()
    main_screen.mainloop()
my_main_screen()
