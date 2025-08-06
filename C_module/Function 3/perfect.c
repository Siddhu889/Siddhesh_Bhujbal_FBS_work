//Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect
#include<stdio.h>
void perfect();
void main()
{
	perfect();
}
void perfect()
{
	int num,i,result = 0;
	printf("Enter the number:\n");
	scanf("%d",&num);
	if(num <= 0)
	{
		printf("the number is invaild");
	}
	for(i = 1;i < num;i++)
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