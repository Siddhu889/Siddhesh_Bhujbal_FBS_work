//pointer
//with parameter and with return type.
//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
//desired operations.
#include<stdio.h>
int operater(int* a,int* b,int* op);
void main()
{
	int a,b,result;
	int op;
	printf("Enter the two numbers:\n");
	scanf("%d%d",&a,&b);
	printf("Enter the operator:\n1.addition\n2.substraction\n3.multiplication\n4.division\n5.module\n");
	scanf("%d",&op);
	result = operater(&a,&b,&op);
	if(op >= 1 && op <= 5)
	{
		printf("Result:%d\n",result);
	}
	else
	{
		printf("Invalid number entered::\n");
	}
}
int operater(int* a,int* b,int* op)
{
	int result;
	if(*op == 1)
		result= *a + *b;
	else if(*op == 2)
		result = *a - *b;
	else if(*op == 3)
		result = *a * *b;
	else if(*op == 4)
		result = *a / *b;
	else if(*op == 5)
		result = *a % *b;

	return result;
}
