#include<stdio.h>
void main()
{
//	int i;
	int arr[5];
	printf("Enter the number:\n");
	for(int i=0; i<5; i++)
	{
		scanf("%d",&arr[i]);
	}
	for(int i=0; i<5; i++)
	{
		printf("%d",arr[i]);
	}
//	printf("scanf number:",i);
}