#include<stdio.h>
int main()
{
    printf("\n AREA OF RECTANGLE \n");

    int area;
    int length;
    int widht;
    printf("enter the length of rectangle= ");
    scanf("%d",&length);
    printf("enter the widht of the rectangle");
    scanf("%d",&widht);

    area=(length*widht);
    printf("the area of the rectangle scanf is= %d",area);

    return 0;
    

}