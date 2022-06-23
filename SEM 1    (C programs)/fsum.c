#include <stdio.h>
//declaration
int sum(int a,int b);

void main()

{
  int x;
  int a,b;
  printf("enter the value of a: ");
  scanf("%d",&a);
  printf("enter the value of b: ");

  scanf("%d",&b);

   x=sum( a, b); 
printf("%d",x);

}

//implimentation
 int sum(int a,int b)
{
 return a+b;
}