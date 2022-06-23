#include <iostream>
using namespace std;
class UserAccount
{
public:
  string uname,email,passwd;

    UserAccount()
    {
        uname = "";
        email = "";
        passwd = "'";
    }

  void inputUserDetails ()
  {

    cout << "\nEnter username :";
    cin >> uname;
    cout << "\nEnter Email :";
    cin >> email;
    cout << "\nEnter Password :";
    cin >> passwd;
  }
 
  void DisplayUserDetails()
  {
    cout << "\n username :" << uname << endl;
    cout << "\n Email :" << email << endl;
    cout << "\n Password :" << passwd << endl;
  }

};

class Gmail:public UserAccount
{
    public:
  string securityQuestion,securityAnswer;
 
      Gmail()
    {
        securityAnswer = "";
        securityQuestion = "";
    }

  void Input ()
  {

    cout << "\nEnter Security Question :";
    cin >> securityQuestion;
    cout << "\nEnter Security Answer :";
    cin >> securityAnswer;
   
  }
 
  void Display()
  {
     
    cout << "\n Security Question :" << securityQuestion << endl;
    cout << "\n Security Answer :"  << securityAnswer << endl;
    
  }
 
};


int main ()
{
    Gmail g;
    g.inputUserDetails();
    g.Input();
    cout << "=================================================" << endl;
    cout << "\n\n ------- User Details -------" << endl;
    g.DisplayUserDetails();
    g.Display();
    cout << "===================================================" << endl;

  return 0;
}