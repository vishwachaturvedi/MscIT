#include <stdio.h>
void main()
{
int a,b,c;
printf("enter the vaule of a= ");
scanf("%d",&a);
printf("enter the value of b= ");
scanf("%d",&b);
printf("enter the value of c= ");
scanf("%d",&c);
 if (a>b&&a>c)
	{
		printf("a is bigger");

	}
else if (b>c&&b>a)
	{
		printf("b is bigger");

	}
else 

	{
		printf("c is bigger");

	}

}