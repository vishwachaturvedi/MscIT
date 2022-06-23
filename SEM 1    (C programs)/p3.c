#include<stdio.h>
int main()
{
    printf("\nAVERAGE OF TWO NUMBERS\n");

    int a;
    int b;
    printf("enter the first value=");
    scanf("%d",&a);
    printf("enter the second value=");
    scanf("%d",&b);

    int avg;
    avg=(a+b)/2;

    printf("the average of two numbers is = %d",avg);

    return 0;
    
}