//without parameter and with return type.
//Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect
#include<stdio.h>
int perfect();
int main()
{
	int total;
	total = perfect();
	if(total == 1)
	{
		printf("the number is invaild");
	}
	else if(total == 2) 
	{
		printf("the given number is  perfect number");
	}
	else
	{
		printf("the given number is not perfect number");
	}
}
int perfect()
{
	
	int num,i,result = 0;
	printf("Enter the number:\n");
	scanf("%d",&num);
	if(num <= 0)
	return 1;
	for(i = 1;i < num;i++)
	{
		if(num % i == 0)
		{
			result += i;
		}
	}
    if(result == num) 
	return 2;
	else
	return 3;
}