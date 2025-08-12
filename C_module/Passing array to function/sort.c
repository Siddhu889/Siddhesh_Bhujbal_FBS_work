//sort the array
#include<stdio.h>
int sort(int arr[],int n)
{
	int i;
	printf("Enter the numbers::%d\n",n);
	for(int i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	return 0;
}
int main()
{
	int arr[100],n,i,j,temp;
	printf("Enter the elements of the number::\n");
	scanf("%d",&n);
	sort(arr,n);
	for(int i = 0; i < n; i++)
	{
		for(int j = i + 1; j < n; j++)
		{
			if(arr[i] > arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	printf("Sorted numbers in ascending form::\n");
	for(i = 0; i < n; i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\nSorted numbers in decending form::\n");
	for(i = n - 1; i >= 0; i--)
	{
		printf("%d ",arr[i]);
	}
	return 0;
}