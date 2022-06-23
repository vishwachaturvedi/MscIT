#include <stdio.h>
void main()
{
int a,b,c;
printf("enter the 1st num= ");
scanf("%d",&a);
printf("enter the 2nd num= ");
scanf("%d",&b);
printf("enter the 3rd num= ");
scanf("%d",&c);

if(a>b && a>c)
{
printf("1st num is the biggest that is  %d\n",a);

}
else if (b>c && b>a)
{
printf("2nd num is the  biggest that is  %d\n",b);

}
else
{
printf("3rd num is the biggest that is s %d\n",c);

}

}

