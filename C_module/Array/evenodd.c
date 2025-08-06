//Find odd and even among the numbers.
#include<stdio.h>
int main()
{
	int arr[100],n,i;
	int evencount = 0,oddcount = 0;
	printf("Enter the number of elements in the array\n");
	scanf("%d",&n);
	printf("Enter the %d numbers :\n",n);
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
    
    printf("\nEven numbers\n");
    for(i = 0; i < n; i++)
    {
    	if(arr[i] % 2 == 0)
		{
    	printf("%d ",arr[i]);
        }
	}
	printf("\nOdd numbers\n");
	for(i = 0; i < n; i++)
	{
		if(arr[i] % 2 != 0)
		{
		printf("%d ",arr[i]);
     	}
	}
}