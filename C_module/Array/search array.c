//Search the given number in array.
#include<stdio.h>
void main()
{
	int arr[50],n,i;
	int search,found = 0;
	printf("Enter the number of the elements in the array::\n");
	scanf("%d",&n);
	printf("Enter the %d elements:\n",n);
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter the number want to search::\n");
	scanf("%d",&search);
	for(i = 0; i < n; i++)
	{
		if(arr[i] == search)
		{
			found = 1;
			break;
		}
	}
	if(found == 1)
	{
		printf("Number %d found in the elements:\n",search);
	}
	else
	{
		printf("Number %d not found in the elements:\n",search);
	}
}