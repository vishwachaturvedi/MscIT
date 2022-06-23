#include <iostream>
using namespace std;
class Node
{
    public:
        int data;
        Node* next;
        Node* previous;
};
     void display(Node* n)
     {
         while(n != NULL)
            {
                 cout<< n->data;
                 n=n->next;
            } 

     }
int main()
{
    Node* head;
    Node* second;
    Node* third;

    head=new Node();
    second=new Node();
    third= new Node();

    head->data=1;
    head->next=second;
    head->previous=third;

    second->data=2;
    second->next=third;
    second->previous=head;

    third->data=3;
    third->next=head;

    display(head);

    return 0;
}
