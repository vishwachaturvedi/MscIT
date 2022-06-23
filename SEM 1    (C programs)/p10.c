#include<stdio.h>
int main()
{
    printf("\n TO CHECK PROFIT OR LOSS ON CP & SP\n");

    int cp;
    int sp;
    printf("enter the cost price=");
    scanf("%d",&cp);
    printf("enter the selling price=");
    scanf("%d",&sp);

    if(sp>cp)
    {
        printf("yay !!YOU HAVE PROFIT\n");

    }
    else
        {
            printf("oh !! YOU HAVE LOSS THIS YEAR\n");
        }
        return 0;

}