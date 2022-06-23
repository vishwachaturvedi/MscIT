#include<iostream>
#include<cstring>
using namespace std;
#define size 5
class student
{
	int studid,marks;
	char sname[50];

	public:
		void getdata(int num,const char* name,int m )
		{
			studid=num;
			strcpy(sname,name);
			marks=m;
		}
		void displaydata()
		{
			cout<<studid<<"\t"<<sname<<" \t "<<marks<<endl;
		}
};

class stack
{
	int top;
	student st[size];
	
	public:
		stack()
		{ top=0;}
	
		void push(student s)
		{
			if(top>=size)
				cout<<"Stack is Full Insertion is not possible "<<endl;
			else
			{
				top=top+1;
				st[top]=s;			
			}	
		}
		student pop()
		{
			if(top==0)
				cout<<"Stack is Empty "<<endl;
			else
			{
				student s=st[top];
				top=top-1;
				return s;
			}
		}
		void display()
		{
			if(top==0)
				cout<<"Stack is EMPTY ";
			else
			{
				cout<<"ID \t Name \t Marks "<<endl;
				for(int i=top;i>=1;i--)
				{
					st[i].displaydata();
					cout<<endl;
				}
			}
		}	
};
int main()
{
	stack s1;
	student s;
	int id,marks,ch;
	char name[50];
	while(1)
	{
		cout<<"-------------------------------------------"<<endl;
		cout<<"Enter Your Choice : "<<endl;
		cout<<"1. Insert Student "<<endl;
		cout<<"2. Remove Student "<<endl;
		cout<<"3. DISPLAY "<<endl;		
		cout<<"4. EXIT "<<endl;
		cout<<"-------------------------------------------"<<endl;
		cin>>ch;
		cout<<"-------------------------------------------"<<endl;
		if(ch==4)
			break;
		
		switch(ch)
		{
			case 1: cout<<"Enter Student ID  : ";
				cin>>id;
				cout<<"Enter Student Name : ";
				cin>>name;
				cout<<"Enter Student Marks : ";
				cin>>marks;
				s.getdata(id,name,marks); 
				s1.push(s);
				break;
			case 2: s=s1.pop();
				cout<<"Following Record is Deleted from Stack"<<endl;
				s.displaydata();
				break;
			case 3: s1.display();
				break;
			default: cout<<"Invalid Input "<<endl;
		}
	}
	return 0;
}



