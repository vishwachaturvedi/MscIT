/*Write a C++ program that can take 4 student’s enrolment numbers (as 201903103410001, 201903103410003, 201903103410004, 201903103410009) from the user. 
Display all the student’s enrollment numbers on a screen. Insert enrolment number 201903103410008 at the 4th location in an array named ENRO.
Also try to take 5 student’s enrolment numbers (as 201903103410001, 201903103410003, 201903103410004, 201903103410009, 201903103410010) from the user. 
Then insert enrolment number 201903103410008 at the 4th location in an array named ENRO. Use appropriate message also like if the array is full, then display “Array is full!” else “Array is still empty!”*/
#include <iostream>
using namespace std;
class Enro
{
long long int rno;
public:
Enro() {
}
void display();
void addData(int);
};
void Enro :: addData(int i)
{
cout << "Enter Element " << i+1 << endl;
cin >> rno;
}
void Enro :: display()
{
cout << rno << " | ";
}
int main()
{
Enro E[5];
int n, top=-1, search, flag=1;
long long int rno;
do {
cout << "================" << endl;
cout << "1. Add Data " << endl;
cout << "2. Display Data " << endl;
cout << "3. Exit " << endl;
cout << "================" << endl << endl;
cin >> n;
switch(n)
{
case 1:
top++;
if(top == 5)
{
cout << "No Space." << endl;
}
E[top].addData(top);
break;
case 2:
if(top == -1)
{
cout << "No data. Add data." << endl;
}
else
{
for(int i=0; i<=top; ++i)
{
E[i].display();
}
cout << endl;
}
break;
case 3:
return -1;
break;
default:
cout << "Enter appropriate input." << endl;
break;
}
}while(n != 3);
return 0;
}