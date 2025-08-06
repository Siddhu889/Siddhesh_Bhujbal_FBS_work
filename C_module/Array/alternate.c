// Print alternate elements in array.
#include<stdio.h>
int main()
{
	int arr[100],n,i;
	int alternate;
	printf("Enter the number of element in the array:\n");
	scanf("%d",&n);
	printf("Enter the %d elements:\n",n);
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Alternate numbers in the array:\n");
	for(i = 0; i < n; i += 2)
	{
		printf("%d",arr[i]);
	}
	return 0;
}