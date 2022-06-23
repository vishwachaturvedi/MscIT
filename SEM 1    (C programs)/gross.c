#include <stdio.h>
void main()

{
int sal,har,pf,da,ma,gross;

printf("basic sal= ");
scanf("%d",&sal);
 
 har=10/100*sal;
 pf=125/100*sal;
 da=90/100*sal;
 ma=100/100*sal;
gross=(sal+har+ma+da-pf);
 
 printf("%d",gross);



}