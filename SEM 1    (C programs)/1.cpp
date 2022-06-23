#include<iostream>

using namespace std;

class stock                              <http://www.mysqltutorial.org/mysql-cursor/>
{

int icode;
char item;
float price;
int Qty;
float discount;
	
void finddisc()
{
	if(Qty<=50)
	{
 		discount=(price/100)*0;
	}
	if(Qty>50 && Qty<100)
	{
		discount=(price/100)*5;
	}
	if(Qty>=100)
	{
		discount=(price/100)*10;
	}
}
public:

void buy()
{
	cout<<"Enter the Item code : ";
	cin>>icode;
	cout<<"Enter the name of Item : ";
	cin>>item;
	cout<<"Enter the Price for the Item : ";
	cin>>price;
        finddisc();
}
void showall()
{
	cout<<"Name of Item : "<<item<<".";
	cout<<"Item Code : "<<icode<<".";
	cout<<"Price : "<<price;
	cout<<"Dicount : "<<discount;
	cout<<"Final Price : "<<price - discount;
	cout<<"-----------------------------------------------------------------------------------------\n\n\n";
}
};
int main()
{
   stock s;

	//s.finddisc();
	s.buy();
	s.showall();
}

