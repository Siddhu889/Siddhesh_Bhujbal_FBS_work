//Print table for given number.
//Input: n = 5
//Output: 5 10 15 20 25 30 35 40 45 50
#include<stdio.h>
void main()
{
	int i,n;
	printf("Enter the number:\n");
	scanf("%d",&n);
	for(i=0;i<=10;i++)
	{
		printf("%d\n",n*i);
	}
}