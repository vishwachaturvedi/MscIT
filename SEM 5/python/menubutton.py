'''
The Menubutton widget can be defined as the drop-down menu that is shown
to the user all the time. It is used to provide the user a option to select
the appropriate choice exist within the application.

A Menu is associated with the Menubutton that can display the choices of the
Menubutton when clicked by the user.
'''
'''
from tkinter import *
root = Tk()
root.geometry('200x200')

menubutton  =  Menubutton ( root, text = "City", relief = RAISED )
menubutton.grid()
menubutton.menu  =  Menu (menubutton)#initialization of menu in menu button
menubutton ["menu"]  =  menubutton.menu #set the property of menu button

menubutton.menu.add_checkbutton ( label = "Bardoli",variable = IntVar())
menubutton.menu.add_checkbutton ( label = "Surat",
                          variable = IntVar())

menubutton.pack()
root.mainloop()
'''
'''
What is Menubutton widget?
MenuButton widget is used to create and display all kind of menus
used by an application.
MenuButton is previously used to create top-level menus,but in the newer
version, only with Menu widget,we can create top-level menus.

Example
The following Python script creates a window containing one MenuButton
widget with some drop down options.
'''
from tkinter import *
# Top level window
root = Tk()
root.title("Person")
root.geometry('250x200')
# Create a menu button
menubutton = Menubutton(root, text="File")
menubutton.grid()
# Create pull down menu
menubutton.menu = Menu(menubutton, tearoff = 0)#Tearoff allows you to detach menus for the main window creating floating menus. 
menubutton["menu"] = menubutton.menu
# Add some commands
menubutton.menu.add_command(label="Emploee")
menubutton.menu.add_command(label="Student")
menubutton.menu.add_separator()
menubutton.menu.add_command(label="Exit")
menubutton.pack()
root.mainloop()
