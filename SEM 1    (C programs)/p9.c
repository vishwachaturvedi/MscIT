#include<stdio.h>
int main()
{
    printf("\n CHECK WHETHER THE NUMBER IS ODD OR EVEN \n");

    int num;
    printf("enter the number here=");
    scanf("%d",&num);

    if(num%2==0)
        {
            printf("the number is even\n");
        }
    else
        {
            printf("the number is odd");
        }
          return 0;

}