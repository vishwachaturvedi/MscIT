#include<stdio.h>
int main()
{
    printf("to check the number is divisible by  two or not\n");

    int num1;
    printf("enter the value=");
    scanf("%d",&num1);

    if(num1%5==0)
    {
        printf("the number is divisible by 5 \n");
    }
    else
    {
        printf("the number is not divisible by 5 \n");
    }

    return 0;

}