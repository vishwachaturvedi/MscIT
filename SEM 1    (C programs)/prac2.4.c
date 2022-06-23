#include<stdio.h>
int main()
{
    printf("to  find factorial\n");

    int value;
    printf("enter the value=");
    scanf("%d",&value);

    int fact=1;

    while(value>0)
    {
        fact=fact*(value);
        value--;

    }

    printf("%d",fact);

    return 0;

}