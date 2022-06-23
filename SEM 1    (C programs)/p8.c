#include<stdio.h>
int main()
{
    printf("\n TO FIND THE VOLUME OF SHPERE \n");

    float volume;
    float radius;

    printf("enter the radius=");
    scanf("%f",&radius);

    volume=(4*4.3*radius*radius*3)/3;

    printf("volume of sphere is=%f",volume);

    return 0;
    
}