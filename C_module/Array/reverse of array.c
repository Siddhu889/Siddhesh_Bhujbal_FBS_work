//Reverse the given array.
#include<stdio.h>
void main()
{
	int arr[100],n,i,rev;
	printf("Enter the number of elements in the array::\n");
	scanf("%d",&n);
	printf("Enter the %d number of elements::\n",n);
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Reverse of given array\n");
	for(i = n - 1; i >= 0; i--)
	{
	printf("%d\n",arr[i]);
    }
}