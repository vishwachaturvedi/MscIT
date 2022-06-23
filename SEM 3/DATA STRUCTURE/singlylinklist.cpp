#include <iostream>
using namespace std;

class Node
{
    public:
        int data;
        Node* next;
};

void displaydata(Node* n)
{
    while(n != NULL)
    {
        cout<< n->data<<" ";
        n= n->next;
    }
}

int main()
{
    Node* head;
    Node* second;
    Node* third;

    head=new Node();
    second=new Node();
    third=new Node();

    head->data=1;
    head->next=second;

    second->data=2;
    second->next=third;

    third->data=3;
    third->next=NULL;

    displaydata(head);

    return 0;
}