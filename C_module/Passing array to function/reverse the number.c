//Reverse the given array.
#include<stdio.h>
int reverse(int arr[],int n)
{
	int i;
	printf("Enter the %d number of elements::\n",n);
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	return 0;
}
int main()
{
	int arr[100],n,i,rev;
	printf("Enter the number of elements in the array::\n");
	scanf("%d",&n);
	reverse(arr,n);
	printf("Reverse of given array\n");
	for(i = n - 1; i >= 0; i--)
	{
	printf("%d\n",arr[i]);
    }
    return 0;
}