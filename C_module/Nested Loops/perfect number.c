// Print perfect numbers in the given range 1 to n.
#include<stdio.h>
void main()
{
	int i,j,start,end,sum,result;
	printf("Enter the first number ::\n");
	scanf("%d",&start);
	printf("Enter the last number ::\n");
	scanf("%d",&end);
	sum = 0;
	for(i = start; i <= end; i++)
	{
		if(i < 0)
		printf("invalid number entered");
		continue;
	}
	for(j = 1; j <= i/2; j++)
	{
		if(i%j == 0)
		{
		sum = sum + j;
	}
}
if(sum == i && i > 0)
{
	printf("The perfect numbers ::%d",i);
}
	
}