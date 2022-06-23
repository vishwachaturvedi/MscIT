/*Design a menu driven program in C++ to demonstrate the following operations on the stack using an array:

1.Insert Item (PUSH)
2.Delete Item (POP)
3.Last Item (STATUS)
          (With Numbers of items in stack and Percentage of the free stack) 

4.Display Item(s)
Consider the items as…

           Gift, GiftBox, GiftWrap, GiftTags, GiftBo, PuffBow.*/
#include <iostream>
#include <cmath>
using namespace std;
class Enro
{
long long int rno;
public:
Enro() {
}
void display();
void addData(int);
int searchData(long long int);
};
void Enro :: addData(int i)
{
cout << "Enter Element " << i+1 << endl;
cin >> rno;
}
void Enro :: display()
{
cout << "| " << rno << " | ";
}
int Enro :: searchData(long long int i)
{
if(i == rno)
{
return 1;
}
else
{
return -2;
}
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
cout << "3. Search Data " << endl;
cout << "4. Delete Data " << endl;
cout << "5. Status " << endl;
cout << "6. Exit " << endl;
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
if(top == -1)
{
cout << "No data. Add data." << endl;
}
else
{
cout << "Enter element you want to search " << endl;
cin >> rno;
for(int i=0; i<=top; ++i)
{
search = E[i].searchData(rno);
if(search == 1)
{
cout << "Element found at " << i+1 <<
"Position" << endl;
flag = 0;
break;
}
}
if(flag)
{
cout << "Element not in the array" << endl;
}
}
break;
case 4:
if(top == -1)
{
cout << "No data. Add data." << endl;
}
else
{
cout << "Enter element you want to delete " << endl;
cin >> rno;
for(int i=0; i<=top; ++i)
{
search = E[i].searchData(rno);
if(search == 1)
{
cout << "Element Deleted at " << i+1 << " Position" << endl;
flag = 0;
for(int j=i; j<top; ++j)
{
E[j] = E[j+1];
}
top--;
break;
}
}
if(flag)
{
cout << "Element not found " << endl;
}
}
break;
case 5:
cout << "Number of Items = " << top+1 << endl;
cout << "Empty stack in percentage = " <<100 - ((100*(top+1))/5)
<<"%"<< endl;
break;
case 6:
return -1;
break;
default:
cout << "Enter appropriate input." << endl;
break;
}
}while(n != 6);
return 0;
}