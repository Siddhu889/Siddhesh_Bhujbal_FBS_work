//Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15
#include<stdio.h>
void sum();
void main()
{
	sum();
}
void sum()
{
    int a,b,result,sum = 0;
	printf("Sum of two numbers\n");
	printf("Enter the start no:\n");
	scanf("%d",&a);
	printf("Enter the end no:\n");
	scanf("%d",&b);
	for(int i = a; i <= b; i++)
	{
		sum = sum + i;
	}
	printf("Sum of given numbers range ::%d\n",sum);	
}