//Merge two arrays
#include<stdio.h>
void main()
{
	int arr[100],brr[100],crr[200],n1,i,n2,j;
	printf("Enter the number of elements in the array::\n");
	scanf("%d",&n1);
	printf("Enter the %d number of elements in the first array::\n",n1);
	for(i = 0; i < n1; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter the number of elements in the array::\n");
	scanf("%d",&n2);
	printf("Enter the %d number of element in the second array::\n",n2);
	for(i = 0; i < n2; i++)
	{
		scanf("%d",&brr[i]);
	}
	for(i = 0; i < n1; i++)
	{
		crr[i] = arr[i];
	}
	for(i = 0; i < n2; i++)
	{
		crr[n1+i] = brr[i];
	}
	printf("Merged number::\n");
	for(i = 0; i <(n1 + n2); i++)
	{
		printf("%d ",crr[i]);
	}
	printf("\n");
}