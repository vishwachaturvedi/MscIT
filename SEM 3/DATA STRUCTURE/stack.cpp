#include<iostream>
using namespace std;

class stack
{
    private:
        int size,top,arr[100],value,element;
        float free;
    public:
        stack()
        {
            top=-1;
            for(int i=0;i<size;i++)
            {
                arr[i]=0;
            }
        }
        
        void push()
        {
            cout<<"enter value = ";
            cin>>value;
            if(top==size)
            {
                cout<<"Stack Is FUll";
            }
            else
            {
                top++;
                arr[top]=value;
            }
        }
        int pop()
        {
            if(top==-1)
            {
                cout<<"Stack Is Empty";
            }
            else
            {
                element=arr[top];
                top--;
                display();
            }
            return element;
        }
        int status()
        {
            if(top==-1)
            {
                cout<<"Stack is empty";
            }
            else if(top==size)
            {
                cout<<"Stack is full";
            }
            else
            {
                cout<<"the element at top is "<<arr[top];
                free=(size-top)/size*100;
                cout<<"Percentage of free stack is "<<free;
            }
        }
        int display()
        {
            cout<<"stack is______";
            for(int i=top;i>=0;i--)
            {
                cout<<arr[i]<<endl;
            }
        }
};

int main()
{
    stack s1;
    int size,option;
    char ch='y';
    cout<<"Enter size of the Stack : ";
    cin>>size;
    cout<<"Enter your choise What ever you want to perform : "<<endl<<endl;

    while(ch=='y' || ch=='Y')
    {
        cout<<"**********menu***********"<<endl;
        cout<<"1. push() "<<endl;
        cout<<"2. pop() "<<endl;
        cout<<"3. Status "<<endl;
        cout<<"4. exit"<<endl;
        
        cin>>option;

        if(option==1)
        {
            s1.push();
            s1.display();
        }
        else if(option==2)
            {
                s1.pop();
                s1.display();
            }
            else if(option==3)
                {
                    s1.status();
                }
                else
                {
                    ch='n';
                }
    }
    return 0;
}