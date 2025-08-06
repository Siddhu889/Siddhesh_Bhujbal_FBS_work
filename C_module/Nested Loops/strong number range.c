// Print strong numbers in the given range 1 to n.
#include<stdio.h>
void main()
{
	int start,end,temp,digit,fact,sum,i,count;
	printf("Enter the first number:\n");
	scanf("%d",&start);
	printf("Enter the last number:\n");
	scanf("%d",&end);
	for(int i = start; i <= end; i++)
	{
	temp = i;
	sum = 0;
	
		while(temp > 0)
	{
		digit = temp % 10;
		fact = 1;
	for(int j = 1; j <= digit; j++)
	{	
		fact = fact * j;
		}
	sum = sum + fact;
	temp = temp / 10;
}
		if(sum == i)
		{
			printf("The strong numbers are::\n%d",i);
		}
	}
}
