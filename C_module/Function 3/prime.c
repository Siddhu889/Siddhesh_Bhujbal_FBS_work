//without parameter and without return type.
// Print prime numbers in the given range 1 to n.
#include<stdio.h>
void prime();
void main()
{
	prime();
}
void prime()
{
	int start,end,isPrime,i,j;
	printf("Enter the first number:\n");
	scanf("%d",&start);
	printf("Enter the last number:\n");
	scanf("%d",&end);
	printf("Prime number in the range %d to %d are:\n", start, end);
	for(int i = start; i <= end; i++)
	{
		if(i < 2)
		continue;
		isPrime = 1;
		for(int j = 2; j <= i / 2; j++)
		{
		if(i % j == 0)
			{
			isPrime = 0;
			break;
		}
	}
	if(isPrime == 1)
	{
		printf("%d  ",i);
	}
}
}

	