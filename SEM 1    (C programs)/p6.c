#include<stdio.h>
int main()

{
    printf("\n TO CLACULATE SIMPLE INT \n");
     float p;
     float rate;
     float amount;
     float sp;
     float time;


     printf("enter the amount=");
     scanf("%f",&amount);

     printf("enter the timw=");
     scanf("%f",&time);

     printf("enter the rate of interest");
     scanf("%f",rate);

     float interest=((amount*time*rate)/100);
     printf("interest amount is=%f",interest);

    float totalamount =amount+interest;

    printf("the total payable amount is =%f",totalamount);

    return 0;

     


}