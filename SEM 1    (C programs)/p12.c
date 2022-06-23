#include<stdio.h>
int main()
{
    int number;
    
    printf("enter the number here= ");
    scanf("%d",&number);

    if(number>0)
    {
        printf("\n NUMBER IS POSITIVE \n");
    }
    else if(number<0)
    {
        printf("\n NUMBER IS NEGATIVE \n");
    }
    else
        {
            printf("\n THE NUMBER IS ZERO \n");
        }
    return 0;
}