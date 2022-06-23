#include<iostream>
using namespace std;
class Student 
{
	
	private:
    

	int enro;
    string sname;
    string course;
    string gender;
	float percentage12;	
	
	public:
	

	void input()
	{
		cout << "-----------------------------------\n";
		cout << "Enter the enro number :";
		cin >> enro;
		cout << "Enter the student name :";
		cin >> sname;
		cout << "Enter the course :";
		cin >> course;
		cout << "Enter the gender(male/female) :";
		cin >> gender;
		cout << "Enter the 12th percentage :";
		cin >> percentage12;
		cout << "-----------------------------------\n";
	}
	
	void display()
	{
		cout << "========================================" <<endl;
		cout << "Enro number :" << enro <<endl;
		cout << "Student name :" << sname <<endl;
		cout << "Course :" << course <<endl;
		cout << "Gender :" << gender <<endl;
		cout << "12th percentage :" << percentage12 <<endl;
		cout << "========================================" <<endl;
		cout << "++++++++++++++++++++++++++++++++++++++++++" <<endl;

	}
	
	float getPer()
	{
		return percentage12;
	}
	
};

int main() {
	
	Student s1[4];
	float per=0.0;

	cout << "Enter the 4 students details!!\n";
	cout << "++++++++++++++++++++++++++++++++\n";
	for(int i=0; i<4; i++)
	{ 
    	s1[i].input(); 
 	}
 	
 	cout << "\n \n \n DEATILS OF STUDENT WHO HAVE THEIR 12TH PERCENTAGE MORE THAN 60% \n";
 	for(int i=0; i<4; i++)
 	{
 		per=s1[i].getPer();
 		if(per>60)
 		{
 			s1[i].display();
		}
	}
	 
  return 0;
}
