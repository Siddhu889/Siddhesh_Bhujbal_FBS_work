//with parameter and with return type.
//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
//desired operations.
int operations(int op);
#include<stdio.h>
void main()
{
	int a,b,result,finaloperator;
	int op;
	printf("Enter the two numbers:\n");
	scanf("%d%d",&a,&b);
	printf("Enter the operator:\n1.addition\n2.substraction\n3.multiplication\n4.division\n5.module\n");
	scanf("%d",&op);
	finaloperator = operations(op);
	if(finaloperator == 0)
	{
		result= a+b;
		printf("Addition of two numbers:\n%d",result);
	}
	else if(finaloperator == 1)
	{
		result = a-b;
		printf("Substraction of two numbers:\n%d",result);
	}
	else if(finaloperator == 2)
	{
		result = a*b;
		printf("Multiplication of two numbers:\n%d",result);
	}
	else if(finaloperator == 3)
	{
		result = a/b;
		printf("Division of two numbers:\n%d",result);
	}
	else if(finaloperator == 4)
	{
		result = a%b;
		printf("Module of two numbers:\n%d",result);
	}
	else
	{
		printf("operator is invaild");
	}
}
int operations(int op)
{
	if(op == 1)
	return 0;
	else if(op == 2)
	return 1;
	else if(op == 3)
	return 2;
	else if(op == 4)
	return 3;
	else if(op == 5)
	return 4;
	else
	return;
}