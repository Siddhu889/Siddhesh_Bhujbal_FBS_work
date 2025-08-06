//with parameter and without return type
//Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect
#include<stdio.h>
void perfect(int num);
void main()
{
	int num;
	printf("Enter the number:\n");
	scanf("%d",&num);
	perfect(num);
}
void perfect(int num)
{
	int result = 0;
	if(num <= 0)
	{
		printf("the number is invaild");
	}
	for(int i = 1; i < num; i++)
	{
		if(num % i == 0)
		{
			result += i;
		}
	}
	if(result == num) 
	{
		printf("the given number is  perfect number");
	}
	else
	{
		printf("the given number is not perfect number");
	}
}