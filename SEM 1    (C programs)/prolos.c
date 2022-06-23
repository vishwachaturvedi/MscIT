#include <stdio.h>
void main()

{
int sp,cp;
 
printf("enter the value of selling price== ");
scanf("%d",&sp);
printf("enter the value of cost price== ");
scanf("%d",&cp);
int loss,profit;
loss=cp-sp;
profit=sp-cp;

if(sp>cp)
{
	printf("There is profit found  of RS=%d\n",profit );
}
else
{
 	printf("OH NO U HAD A LOSS OF RS=%d\n",loss);
}
}