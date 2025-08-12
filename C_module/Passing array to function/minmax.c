#include<stdio.h>
int minmax(int arr[],int n)
{
	int i;
	printf("Enter the %d elements:\n",n);
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
}
int main()
{
	int arr[100],n,i;
	int min,max;
	printf("Enter the number of elements in the array::\n");
	scanf("%d",&n);
	minmax(arr,n);
	min = arr[0];
	max = arr[0];
	
	for(i = 1; i < n; i++)
	{
		if(arr[i] < min)
		{
			min = arr[i];
		}
		if(arr[i] > max)
		{
			max = arr[i];
		}
	}
	printf("Minimum value ::%d\n",min);
	printf("Maximum value ::%d\n",max);
	return 0;
}