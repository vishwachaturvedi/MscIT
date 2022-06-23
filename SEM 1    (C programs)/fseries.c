#include<stdio.h>
int printseries(int n);

void main()
{
  int n;
  printf("enter the value of n= ");
  scanf("%d",&n);
 
  printseries(n);
}

int printseries(int n)
{

  for(int i=0;i<=n;i++)
  {
    printf("%d\n",i);
  }
}