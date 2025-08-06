//with parameter and with return type.
//Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15
#include<stdio.h>
int sum(int a,int b);
void main()
{
	int a,b,result;
	printf("Sum of two numbers\n");
	printf("Enter the start no:\n");
	scanf("%d",&a);
	printf("Enter the end no:\n");
	scanf("%d",&b);
	result = sum(a,b);
	printf("Sum of the numbers in the given range:%d\n",result);
}
int sum(int a,int b)
{
	int sum = 0;
	for(int i = a; i <= b; i++)
	{
		sum = sum+i;
	}
	return sum;
}