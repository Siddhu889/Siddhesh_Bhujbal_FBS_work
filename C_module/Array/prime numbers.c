//Accept array and print only prime numbers of array.
#include<stdio.h>
int main()
{
	int arr[100],n,i,j,flag;
	printf("Enter the number of elements in the array::\n");
	scanf("%d",&n);
	printf("Enter the %d numbers::\n",n);
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Prime numbers::\n");
	for(i = 0; i < n; i++)
	{
		if(arr[i] <= 1)
		continue;
		
		flag = 0;
		for(j = 2; j < arr[i]; j++)
		{
			if(arr[i] % j == 0)
			{
			flag = 1;
			break;
		    }
	    }

	if(flag == 0)
	   {
		printf("%d\n",arr[i]);
	   }
    }
	return 0;
}
	