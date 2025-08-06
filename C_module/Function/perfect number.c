//with parameter and with return type.
//Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect
#include<stdio.h>
int perfect(int num);
void main()
{
	int num,i,final;
	printf("Enter the number:\n");
	scanf("%d",&num);
	final = perfect(num);
	if(final == 0) 
	{
		printf("the given number is  perfect number");
	}
	else if(final == 1)
	{
		printf("the number is invaild");
	}
	else
	{
		printf("the given number is not perfect number");
	}
}
int perfect(int num)
{
	int result = 0;
	for(int i = 1; i < num; i++)
	{
		if(num % i == 0)
		{
			result += i;
		}
	}
	if(result == num) 
	return 0;
	else if(num <= 0)
	return 1;
	else 
	return 2;
}