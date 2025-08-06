//without parameter and with return type.
//Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15
#include<stdio.h>
int number();
int main()
{
	int total;
	total = number();
	printf("Sum of given numbers range ::%d\n",total);
    return 0;
}
int number()
{
	int a,b,sum = 0;
	printf("Sum of two numbers\n");
	printf("Enter the start no:\n");
	scanf("%d",&a);
	printf("Enter the end no:\n");
	scanf("%d",&b);
	for(int i = a; i <= b; i++)
	{
		sum = sum + i;
	}
	return sum;
}
