#include <iostream>
using namespace std;
class Student
{
private:
  int enro;
  string sname;

public:

  void setEnro ()
  {
    cout << "\nEnter Enrollment number :";
    cin >> enro;
  }

  void getenro ()
  {
    cout << "\n Student Enrollment is : " << enro << endl;
  }

  void setsname ()
  {
    cout << "\nEnter Student name :";
    cin >> sname;
  }

  void getsname ()
  {
    cout << "\n Student name is : " << sname << endl;
  }
};

class Exam:public Student
{
private:
  int marks1;
  int marks2;
  int marks3;

public:

  void setm1 ()
  {

    cout << "\nEnter Marks 1 :";
    cin >> marks1;
  }

  int getm1 ()
  {
    return marks1;
  }

  void setm2 ()
  {
    cout << "\nEnter marks 2 :";
    cin >> marks2;
  }

  int getm2 ()
  {
    return marks2;
  }

  void setm3 ()
  {

    cout << "\nEnter marks 3:";
    cin >> marks3;
  }

  int getm3 ()
  {
    return marks3;
  }

};

class Result:public Exam
{
public:
  int total_marks;

  void PrintTotalMarks ()
  {
    total_marks = getm1 () + getm2 () + getm3 ();

    cout << "\n\n Total Marks are :" << total_marks << endl;
    cout <<"======================================================"<<endl;
  }
};

int main ()
{
  Result r;
  r.setEnro ();
  r.setsname ();
  r.setm1 ();
  r.setm2 ();
  r.setm3 ();

  cout << "\n\n ------- Student Details -------" << endl;
  r.getenro ();
  r.getsname ();
  cout << "\n Marks 1 :" << r.getm1 () << endl;
  cout << "\n Marks 2 :" << r.getm2 () << endl;
  cout << "\n Marks 3 :" << r.getm3 () << endl;
  r.PrintTotalMarks ();

  return 0;
}