/*Design a menu driven program in C++ to demonstrate Traffic Signal Lights functioning for the following operations on the circular queue using an array:

Insert Item (Enqueue)
Delete Item (Dequeue)
Display Item(s)
          (With Numbers of items in queue) 

Consider the items for insertion as…

           Red, Amber, Green, Steady Green Arrow,

After removing two items, consider the items for insertion as…

           Flashing Red, Flashing Amber*/
#include <iostream>
#include <string>
using namespace std;
class Queue {
private:
string name;
public:
Queue()
{
}
void getData();
void displayData();
};
void Queue :: getData()
{
cout << "Enter Name" << endl;
cin.ignore();
getline(cin, name);
cout << endl << endl << endl << endl;
displayData();
}
void Queue :: displayData()
{
cout << "| " << name << " ";
}
int main()
{
Queue Q[20];
int num, front,rear;
front=rear=-1;
do{
cout << endl;
cout << "**************************************" << endl;
cout << "**************************************" << endl;
cout << "*** ***" << endl;
cout << "*** ***" << endl;
cout << "*** 1. Insert Item (Enqueue) ***" << endl;
cout << "*** 2. Delete Item (Dequeue) ***" << endl;
cout << "*** 3. Display Item(s) ***" << endl;
cout << "*** 4. Exit ***" << endl;
cout << "*** ***" << endl;
cout << "*** ***" << endl;
cout << "**************************************" << endl;
cout << "**************************************" << endl;
cin >> num;
switch (num)
{
case 1:
if(front == -1)
{
front++;
rear++;
}
else if(front > -1)
{
Q[rear].getData();
// cout << "REAR VALUE " << rear << endl;
rear++;
}
else if(rear == 20)
{
cout << "Queue is Full. Cannot Add." << endl;
}
break;
case 2:
// cout << " CASE 2 REAR VALUE " << rear << endl;
// cout << " CASE 2 FRONT VALUE " << front << endl;
if(front == -1)
{
cout << "Queue Empty. Cannot Delete." << endl;
}
else
{
//cout << "Deleting " << Q[front].displayData() << " From Queue. " << endl;
front++;
cout << "Updated Queue " << endl;
for(int i=front; i<=rear; ++i)
{
Q[i].displayData();
}
}
break;
case 3:
if(rear ==-1)
{
cout << "Queue Empty. Operation Abort." << endl;
}
else
{
cout << endl << endl << "Number of Items in the queue : " << rear << endl;
for(int i=0; i<=rear; ++i)
{
if(i < front)
{
cout << "| EMPTY ";
}
else
{
Q[i].displayData();
}
}
}
break;
case 4:
return -1;
default:
cout << "ENTER VALID INPUT" << endl;
break;
}
}while (num != 4);
return 0;
}