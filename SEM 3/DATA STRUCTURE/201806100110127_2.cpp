/*Write a C++ program to display the elements (85, 75, 60, 79, 80) in ascending order of array named “Percentage”.*/
#include <iostream>
#include <string>
using namespace std;
int main()
{
	int num;
	int temp;
	cout << "Enter size of array" << endl;
	cin >> num;
	int arr[num];
	for(int i=0; i<num; ++i)
	{
		cout << "Enter element " << i << endl;
		cin >> arr[i];
	}
	for (int i=0; i < num-1; ++i)
 	{
 		for (int j = 0; j < num-i-1; j++)
 		{
 			if (arr[j] > arr[j+1])
 			{
 				temp = arr[j];
 				arr[j] = arr[j+1];
 				arr[j+1] = temp;
			}
 		}
	}
	for (int i=0; i<num; ++i)
	{
		cout << arr[i] << " ";
	}
	return 0;
}
