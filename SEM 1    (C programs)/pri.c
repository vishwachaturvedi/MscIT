#include <stdio.h>
void main()

{
	int cp,sp;
	printf("enter the cost price= ");
	scanf("%d",&cp);
	printf("enter the price of selling price= ");
	scanf("%d",&sp);
	int am= sp-cp;

  if (cp>sp)

	{
		printf("loss %d",am);
	}
  else 

	{
		printf("profit %d",am);

	}
}