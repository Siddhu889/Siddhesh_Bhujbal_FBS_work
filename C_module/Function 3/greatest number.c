//without parameter and without return type.
//Write a program to find greatest of three numbers using nested if-else.
#include<stdio.h>
void greatest();
void main()
{
    greatest();
}
void greatest()
{
	int a,b,c;
	printf("Enter the number:\n");
	scanf("%d %d %d ",&a,&b,&c);
	if(a > b&&a > c)
	{
		printf("a is the greatest number\n");
	}
	else if(b > a&&b > c)
	{
		printf("b is the greatest number\n");
	}
	else if(c > a&&c > b)
	{
		printf("c is the greatest number\n");
	}
	else 
	{
		printf("No one greatest number");
	}
}