#include <stdio.h>
char function(char x);
void main()
{
  char v;
  char x;
  printf("enter the  char==");
  scanf("%c",&x);

   v=function(x); 
    printf("%c",v);
}

 char function(char x)
{
  return x;
}


