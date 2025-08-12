//Find sum of all numbers.
#include<stdio.h>
int sum(int arr[],int n)
{
	int i;
	printf("Enter the %d numbers:\n",n);
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	return 0;
}
int main()
{
		int arr[100],n,i;
	int sum = 0;
	printf("Enter the number of elements in array:\n");
	scanf("%d",&n);
	for(i = 0; i < n; i++)
	{
		sum = sum + arr[i];
	}
	printf("sum of the numbers::%d\n",sum);
	return 0;
}