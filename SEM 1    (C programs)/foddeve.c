#include <stdio.h>
void oddeve(int n1);
void main()
{
	int n1;	
	printf("enter the value= ");
	scanf("%d",&n1);

	oddeve(n1);

}

void oddeve(int n1)
{
	if(n1 %2==0)
	{
		printf("n1 is EVEN number");
	}
	else
	{
		printf("n1 is  ODD number");
	}

}
				