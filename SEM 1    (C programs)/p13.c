#include<stdio.h>
int main()
{
    printf("\n to find  maximum \n");
     int num1;
     int num2;
     printf("enter the value of num1=");
     scanf("%d",&num1);
     printf("enter the value of num2=");
     scanf("%d",&num2);

     if(num1>num2)
     {
         printf("num1 is greater\n");
     }
     else if(num1==num2)
     {
         printf("both numbers are equal\n");
     }
     else
     {
         printf("num2 is greater\n");
     }
     return 0;

}