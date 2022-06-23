#include <stdio.h>
void main()
{
	int size,i;
	printf("enter the value of array: ");
	scanf("%d",&size);
	int b[size];
	int a[size];
	
	for (i = 0 ; i < size ; i++)
	{
		printf("Enter Element at a[%d] : ",i);
		scanf("%d",&a[i]);
	}
	
	for( i=0;i<size;i++)
	{
		b[i]=a[(size-1)-i];
		
	}
	
	for(int i=0;i<size;i++)
	{
		a[i]=b[i];

	}
	
	for(int i=0;i<size;i++)
	{
		printf("value of a(%d) : %d\n",i,a[i]);

	}
}