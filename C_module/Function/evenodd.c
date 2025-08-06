//with parameter and with return type.
//Write a program to check whether a number is even or odd.
#include<stdio.h>
int evenodd(int a);
void main()
{
	int a,result;
	printf("Enter the number:\n");
	scanf("%d",&a);
	result = evenodd(a);
	if(result == 1)
	printf("Number is even");
	else
	printf("Number is odd");
}
int evenodd(int a)
{
	if(a % 2 == 0)
	return 1;
	else
	return 0;
}