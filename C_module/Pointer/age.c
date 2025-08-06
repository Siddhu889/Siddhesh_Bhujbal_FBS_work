//pointer
//with parameter and with return type.
//Accept the age and check if the person is:
//Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)
#include<stdio.h>
int age(int* a);
void main()
{
	int a,result;
	printf("Enter your age:\n");
	scanf("%d",&a);
	result = age(&a);
	if(result == 1)
	{
		printf("child");
	}
	else if(result == 0)
	{
		printf("teenager");
	}
	else if(result == 2)
	{
		printf("adult");
	}
	else if(result == 3)
	{
		printf("senior");
	}
	else
	{
		printf("age is invalid");
	}
}
int age(int* a)
{
	if(*a < 12 && *a >= 0)
	return 1;
	else if(*a >= 12 && *a <= 19)
	return 0;
	else if(*a >= 20 && *a <= 59)
	return 2;
	else if(*a >= 60)
	return 3;
	else
	return 4;
}