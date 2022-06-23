#include<stdio.h>
int main()
{
    printf("\n======division of two numbers=====\n");

    int num1;
    int num2;
    printf("enter the first number=");
    scanf("%d",&num1);
    printf("enter the second number=");
    scanf("%d",&num2);
    int sum= num1/num2;
    
    printf("the division of two numbers is=%d",sum);

    return 0;
    
}