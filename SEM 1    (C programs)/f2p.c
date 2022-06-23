#include <stdio.h>
void mydemo(int n1,int n2);
void main()
{
  int n1,n2;
   printf("enter the values of the n1,n2==\n");
  scanf("%d",&n1);
  scanf("%d",&n2);
  mydemo(n1,n2);

}

void mydemo(int n1,int n2)
{

  printf("value of n1=%d and value of n2=%d",n1,n2);
}