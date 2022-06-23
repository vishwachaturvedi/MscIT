#include<stdio.h>
int main()
{
    printf("max out of three\n");

    int num1;
    int num2;
    int num3;

    printf("enter the value of num1=");
    scanf("%d",&num1);
    printf("enter the value of num2=");
    scanf("%d",&num2);
    printf("enter the value of num3=");
    scanf("%d",&num3);

    if(num1>num2 && num1>num3)
    {
        printf("num1 is greater\n");
    }
    else if(num2>num3 && num2>num3)
    {
        printf("num2 is greater \n");
    }
    else 
    {
        printf("num3 is greater \n");
    }
    return 0;
    
}