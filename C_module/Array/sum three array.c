//Take two array and add sum in third array
//
//Example-
//arr[5]= {1,2, 3, 4,5}
//
//brr[5]={10,20,30, 40, 50}
//crr[5]={11,22,33,44,55}
#include<stdio.h>
void main()
{
	int arr[100],brr[100],crr[100],n,i;
	printf("Enter the number of elements in the array:\n ");
	scanf("%d", &n);
	printf("Enter the %d elements of first array::\n",n);
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter the %d elements of second array::\n",n);
	for(i = 0; i < n; i++)
	{
	    scanf("%d",&brr[i]);
	}
	for(i = 0; i < n; i++)
	{
		crr[i] = arr[i] + brr[i];
	}
	printf("Sum of two arrays::\n");
	for(i = 0; i < n; i++)
	{
		printf("%d ",crr[i]);
	}
	printf("\n");
}