#include<stdio.h>
int main()
{
    int maths=45;
    int gujarati=38;
    int ss=30;
    int english=42;
    int science=39;

    int total;
    total=maths+gujarati+ss+english+science;
    float percentage;
    percentage=(total*100)/500;

    printf("the total obtained percentage is=%f",percentage);
}