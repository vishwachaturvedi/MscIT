#include<stdio.h>
int main()
{
    printf(" \nTO CHECK WHETHER TWO NUMBRES ARE EQUAL OR NOT \n");
     int num1;
     int num2;


     printf("enter the value of first number=");
     scanf("%d",&num1);

     printf("enterr the value of second number=");
     scanf("%d",&num2);

     if(num1==num2)
     {
         printf("the two numbers are equal\n");
     }
     else
     {
         printf("the two numbers are not equal\n");
     }
}