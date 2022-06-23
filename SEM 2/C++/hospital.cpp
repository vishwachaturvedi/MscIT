#include<iostream>
#include<string.h>
#include<stdlib.h>

using namespace std;


#define MAXPATIENTS 100


struct patient
{
   char FirstName[50];
   char LastName[50];
   char ID[20];
};


class queue
{
   public:
   queue (void);
   int AddPatientAtEnd (patient p);
   int AddPatientAtBeginning (patient p);
   patient GetNextPatient (void);
   int RemoveDeadPatient (patient * p);
   void OutputList (void);
   char DepartmentName[50];
   private:
   int NumberOfPatients;
   patient List[MAXPATIENTS];
};




queue::queue ()
{
   
   NumberOfPatients = 0;
}


int queue::AddPatientAtEnd (patient p)
{
  if (NumberOfPatients >= MAXPATIENTS)
   {
      return 0;
   }
     
      else
      List[NumberOfPatients] = p;  NumberOfPatients++;
      return 1;
}


int queue::AddPatientAtBeginning (patient p)
{
  
   int i;
   if (NumberOfPatients >= MAXPATIENTS)
   {
      
      return 0;
   }

  
   for (i = NumberOfPatients-1; i >= 0; i--)
   {
      List[i+1] = List[i];
   }
   
   List[0] = p;  NumberOfPatients++;
   return 1;
}


patient queue::GetNextPatient (void)
{
   

   int i;  patient p;
   if (NumberOfPatients == 0) {
   
   strcpy(p.ID,"");
   return p;
    }
  
   p = List[0];
   
   NumberOfPatients--;
   for (i=0; i<NumberOfPatients; i++)
   {
      List[i] = List[i+1];
   }
  
   return p;
}


int queue::RemoveDeadPatient (patient * p)
{
   
   int i, j, found = 0;
   
   for (i=0; i<NumberOfPatients; i++)
    {
              if (strcmp(List[i].ID, p->ID) == 0)
        {
         
         *p = List[i];  found = 1;
         
         NumberOfPatients--;
             for (j=i; j<NumberOfPatients; j++)
                {
                        List[j] = List[j+1];
                }
        }
    }
   return found;
}


void queue::OutputList (void)
{
   
   int i;
   if (NumberOfPatients == 0)
    {
              cout << "Queue is empty\n";
    }
   else
    {

        for (i=0; i<NumberOfPatients; i++)
        {
            cout << "" << List[i].FirstName;
             cout << " " << List[i].LastName;
             cout << " " << List[i].ID<<"\n";
        }
            cout<<"\n";
    }
}



patient InputPatient (void)
{
   
   patient p;
   cout<<"\n**********************************************\n";
   cout << "Please enter data for new patient"<<endl;
   cout<<"first name: ";
   cin.getline(p.FirstName, sizeof(p.FirstName));
   cout << "Last name: ";
   cin.getline(p.LastName, sizeof(p.LastName));
   cout << "Social security number: ";
   cin.getline(p.ID, sizeof(p.ID));
   
   if (p.FirstName[0]==0 || p.LastName[0]==0 || p.ID[0]==0)
    {
              
              strcpy(p.ID,"");
              cout << "Error: Data not valid. Operation cancelled.";
              
    }
   return p;
}


void OutputPatient (patient * p)
{
   
   if (p == NULL || p->ID[0]==0)
    {
              cout << "No patient";
              return;
    }
   else
   cout << "Patient data: \n"<<endl;
   cout << "First name: " << p->FirstName<<endl;
   cout << "Last name: " << p->LastName<<endl;
   cout << "Social security number: " << p-> ID  <<endl ;
}


int ReadNumber()
{
   
   char buffer[20];
   cin.getline(buffer, sizeof(buffer));
   return atoi(buffer);
}


void DepartmentMenu (queue * q)
{
   
   int choice = 0, success;  patient p;
   while (choice != 6)
    {
           
             cout << "\n \t WELCOME TO DEPARTMENT: \n" <<"\t\t"<< q->DepartmentName<<"\n";
             cout << "Please select your choice: \n";
             cout << "1:  Add normal patient \n";
             cout << "2:  Add critically ill patient \n";
             cout << "3:  Take out patient for operation \n";
             cout << "4:  Remove dead patient from queue \n";
             cout << "5:  List queue \n";
             cout << "6:  Change department or exit \n";
       cout<<"\nEnter your choice here= ";
       
          
             choice = ReadNumber();
              
          switch (choice)
      {
              case 1:  
         p = InputPatient();
         if (p.ID[0])
           {
                success = q->AddPatientAtEnd(p);
                
                  if (success)
                {
                       cout << "\nPatient added:\n";

                }
            else
           {
                   
                   cout << "Error: The queue is full. Cannot add patient:";
           }
                OutputPatient(&p);
                
      }
     break;

      case 2:   
     p = InputPatient();
     if (p.ID[0])
         {
            success = q->AddPatientAtBeginning(p);
            
              if (success)
            {
                     cout << "\nPatient added:\n";
                 }
           else
                 {
                     
                     cout << "Error: The queue is full. Cannot add patient:";
            }

              OutputPatient(&p);
                  //cout << "Press any key \n";
                
         }
     break;

      case 3:  
     p = q->GetNextPatient();
     
     if (p.ID[0])
        {
           cout << "Patient to operate:";
           OutputPatient(&p);}
     else
        {
           cout << "There is no patient to operate.";
        }
         //  cout << "Press any key \n";
         
           break;

      case 4:   
     p = InputPatient();
     if (p.ID[0])
       {
            success = q->RemoveDeadPatient(&p);
         
              if (success)
              {
                   cout << "Patient removed:";
              }
              else
              {
                   
                   cout << "Error: Cannot find patient:";
              }
           OutputPatient(&p);
            //cout << "Press any key \n";
       
       }
     break;

      case 5:  
     q->OutputList();
     //cout << "Press any key \n";
    
      break;
     }
      }
}



int main ()
{
   int i, MenuChoice = 0;
	cout<<"***************************************************************************************\n";	
	cout<<"DEVELOPED BY:                                                                          \n";
	cout<<"              khusboo bajaj        201806100110112                                     \n";
	cout<<"              neelam pandidar      201806100110108                                     \n";
	cout<<"              vishwa chaturvedi    201806100110127                                     \n";
	cout<<"TOPIC:                                                                                 \n";
	cout<<"         HOSPITAL MANAGEMENT                                                           \n";
	cout<<"***************************************************************************************\n";
   
   queue departments[3];
   
   strcpy(departments[0].DepartmentName, "Heart clinic");
   strcpy(departments[1].DepartmentName, "Lung clinic");
   strcpy(departments[2].DepartmentName, "Plastic surgery");
  
   while(MenuChoice != 4)
    {
             
             cout << "\t\t WELCOME TO SOFTWARE \n\t\t * CITY HOSPITAL * \n";
             cout << " Please select your choice:\n";
          for(i = 0; i < 3; i++)
        {
           
            cout << "" << (i+1) << ":  " << departments[i].DepartmentName<<"\n";
        }
            cout << "4:  Exit\n";
       cout<<"\n Enter your choice here = ";

           
            MenuChoice = ReadNumber();
           
              if (MenuChoice >= 1 && MenuChoice <= 3)
            {
             
             DepartmentMenu (departments + (MenuChoice-1));
            }
    }
    return 0;
}


