#include <stdio.h>
void main()
{
int h;
 printf("\nenter the height of the person= ");
 scanf("%d",&h);
  
if(h<=40)
{
printf("the person is drawf");
}
 
else if(h>40 && h<65)
{
printf("the person is average");
}
else
{
printf("the person is tall");
}

}