#include <iostream>
using namespace std;

int main()
{
    int i,j,temp,n,min, arr[30];
    cout<<"ENTER THE SIZE TO BE SORTED : ";
    cin>>n;
    cout<<"enter the elements: "<<endl;
    for(i=0; i<n; i++)
    {
        cin>>arr[i];
    }

    for ( i = 0; i <n; i++)
    {
        min=1;
        for(j=i+1; j<n; j++)
        {
            if(arr[j]<arr[min])
            {
                min=j;
            }
        }

        temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }
    cout<<"print elements : ";
    for ( i = 0; i < j; i++)
    {
        cout<<"\n"<<arr[i];
    }
    
    return 0;
}