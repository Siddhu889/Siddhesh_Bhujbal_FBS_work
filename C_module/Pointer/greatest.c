//pointer
//with parameter and with return type.
//Write a program to find greatest of three numbers using nested if-else.
#include<stdio.h>
int greatest(int* a, int* b, int* c);
void main()
{
	int a,b,c,result;
	printf("Enter the number:\n");
	scanf("%d%d%d",&a,&b,&c);
	result = greatest(&a,&b,&c);
	if(result == 1)
	{
		printf("a is the greatest number\n");
	}
	else if(result == 0)
	{
		printf("b is the greatest number\n");
	}
	else if(result == 2)
	{
		printf("c is the greatest number\n");
	}
	else 
	{
		printf("No one greatest number");
	}
}
int greatest(int* a, int* b, int* c)
{
	if(*a > *b && *a > *c)
	return 1;
	else if(*b > *a && *b > *c)
	return 0;
	else if(*c > *a && *c > *b)
	return 2;
	else 
	return 3;
}