//with parameter and without return type.
//Accept the age and check if the person is:
//Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)
#include<stdio.h>
void age(int a);
void main()
{
	int a;
	printf("Enter your age:\n");
	scanf("%d",&a);
	age(a);
}
void age(int a)
{
	if(a <= 12&&a >= 0)
	{
		printf("child");
	}
	else if(a >= 12&&a <= 19)
	{
		printf("teenager");
	}
	else if(a >= 20&&a <= 59)
	{
		printf("adult");
	}
	else if(a >= 60)
	{
		printf("senior");
	}
	else
	{
		printf("age is invalid");
	}
}