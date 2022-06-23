#include<stdio.h>
int main()
{
    float temperature;
    printf("enter the temprature==");
    scanf("%f",&temperature);

    float c;
    c=(temperature-32)*5/9;

    printf("the temperature in celsius %f",c);

    return 0;
    
}