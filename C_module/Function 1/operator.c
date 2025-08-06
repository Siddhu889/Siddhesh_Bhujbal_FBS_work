//with parameter and without return type.
//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
//desired operations.
#include<stdio.h>
void operator(int a, int b, int op);
void main()
{
	int a,b;
	int op;
	printf("Enter the two numbers:\n");
	scanf("%d%d",&a,&b);
	printf("Enter the operator:\n1.addition\n2.substraction\n3.multiplication\n4.division\n5.module\n");
	scanf("%d",&op);
	operator(a,b,op);
}
void operator(int a, int b, int op)
{
	int result;
	if(op == 1)
	{
		result= a+b;
		printf("Addition of two numbers:\n%d",result);
	}
	else if(op == 2)
	{
		result = a-b;
		printf("Substraction of two numbers:\n%d",result);
	}
	else if(op == 3)
	{
		result = a*b;
		printf("Multiplication of two numbers:\n%d",result);
	}
	else if(op == 4)
	{
		result = a/b;
		printf("Division of two numbers:\n%d",result);
	}
	else if(op == 5)
	{
		result = a%b;
		printf("Module of two numbers:\n%d",result);
	}
	else
	{
		printf("operator is invaild");
	}
}