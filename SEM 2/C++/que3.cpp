#include <iostream>
using namespace std;
class Parcel
{
	
	public:

    
	string c_name;
	int parcel_id;
    int customer_id;
	float parcel_weight;
    float bill_amount;


	void input_details()
	{
	    cout << "Enter Customer name: "; 
        cin >> c_name;
        
        
	    cout << "Enter Customer id: "; 
        cin >> customer_id;
        
        
	    cout << "Enter parcel id: "; 
        cin >> parcel_id;
        
        
	    cout << "Enter parcel weight in KG: "; 
        cin >> parcel_weight;
	}
	
	void print()
	{
	    cout << "\n customer id: " << customer_id << "\n";
		cout << "\n customer name: " << c_name << "\n";

    	cout << "\n parcel id: " << parcel_id << "\n";
    
	    cout << "\n parcel weight in KG: " << parcel_weight << "\n";
        cout<< "\n ====================================THANK YOU=========================================\n";

	}
	
	void calculate_amount()
	{
          if (parcel_weight < 10) {
            bill_amount = 1000;
            }  
            else if (parcel_weight >= 11 && parcel_weight <= 15)
            {
                bill_amount = 3000;
            }
            else if
            (parcel_weight > 15  && parcel_weight < 21)
            {
                bill_amount = 5000;
            }
            else
            {
                bill_amount = 10000;
            }

            cout<<"\n \n \n  DEAR CUSTOMER  ";
            cout << "\n" << "\n \n YOUR BILL DETAILS ARE : " << "\n";
            cout << " \n \n Bill amount is :" << bill_amount << "\n";
	}
};

int main() {

    Parcel p1;
	p1.input_details();
	p1.calculate_amount();
	p1.print();
	return 0;
}