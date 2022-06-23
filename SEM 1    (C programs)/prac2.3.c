#include<stdio.h>
int main()
{
    int value ;
    printf("enter the value till how many num you want to add=");
    scanf("%d",&value);

    int sum;
    sum=(value*(value+1))/2;
    printf("%d\n",sum);

    return 0;
    

}