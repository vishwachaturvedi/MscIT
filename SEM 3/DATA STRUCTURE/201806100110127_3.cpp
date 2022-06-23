/*Write a C++ program which can take 10 student’s enrolment numbers (as 101, 102, 201, 202, 301, 302, 401, 402, 501, 502) from user. 
Display all the student’s enrollments on screen.
Also search and display the position of 501 enrolment number.*/
#include <iostream>
using namespace std;
class Enro
{
	private:
		int rollno;
	public:
	Enro()
	{
		cout << "Enter Roll Number " << endl;
		cin >> rollno;
	}	
	void display();
	int searchData(int);
};
void Enro::display()
{
	cout << rollno << " ";
}
int Enro :: searchData(int num)
{
	if(rollno == num)
	{
		return 1;
	}
	else
	{
		return -1;
	}
}
int main()
{
	Enro E[10];
	int n, search, i;
	do{
		cout <<"1. Display" << endl;
		cout <<"2. Search " << endl;
		cout <<"3. Exit " << endl;
		cin >> n;
		switch(n)
		{
			case 1:
				for(i=0; i<10; ++i)
				{
					E[i].display();
				}
				cout << endl;
				break;
			case 2:
			cout << "Enter search element" << endl;
			cin >> search;
			for(i=0; i<10; ++i)
			{
				int rtn = E[i].searchData(search);
				if(rtn==1)
				{
					cout << "Data Found at " << i << "th position" << endl;
					break;
				}
			}
				if(i==10)
				{	
				cout << "Data not Found" << endl;
				}			
		}
	}while(n!=3);
}
