//with parameter and without return type
//Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15
#include<stdio.h>
void number(int a, int b);
void main()
{
    int a,b;
	printf("Sum of two numbers\n");
	printf("Enter the start no:\n");
	scanf("%d",&a);
	printf("Enter the end no:\n");
	scanf("%d",&b);
	number(a,b);
}
void number(int a, int b)
{
	int result,sum = 0;
	for(int i=a;i<=b;i++)
	{
		sum = sum+i;
	}
	printf("Sum of given numbers range ::%d\n",sum);
}
