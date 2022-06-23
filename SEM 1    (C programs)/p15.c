#include<stdio.h>
int main()
{
    float height;
    printf("enter the height of the parson\n");
    scanf("%d",&height);

    if(height<3)
    {
        printf("the person is drawf\n");
    }
    else if(height>3 && height<6)
    {
        printf("the person has average height\n");
    }
    else 
    {
        printf("the person is tall\n");
    }
    return 0;

}