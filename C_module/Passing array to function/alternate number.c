//with parameter and with return type.
// Print alternate elements in array.
#include<stdio.h>
int alternateno (int n, int arr[])
{
	int i;
	printf("Enter the %d elements in the array:\n",n);
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	return 0;
}
int main()
{
	int arr[100],n,i;
	printf("Enter the number of element in the array::\n");
	scanf("%d",&n);
	alternateno(n,arr);
	printf("Alternate numbers in the array::\n");
	for(i = 0; i < n; i += 2)
	{
		printf("%d ",arr[i]);
	}
	return 0;
}