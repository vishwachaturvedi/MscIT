#include <stdio.h>
int div( int n1);
void main()
{
int n1;
printf("enter the value= ");
scanf("%d",&n1);

div(n1);

}

int div( int n1)
{
if(n1%3==0)
{
printf("DIVISIBLE BY 3");
}
else
{
printf("NOT DIVISIBLE BY 3");

}

}