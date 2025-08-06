//without parameter and with return type
//Write a program to check whether a number is even or odd.
#include<stdio.h>
int evenodd();
void main()
{
	int result;
	result = evenodd();
    if(result == 1)
	printf("Number is even");
	else
	printf("Number is odd");
}
int evenodd()
{
	int a;
	printf("Enter the number ::\n");
	scanf("%d",&a);
	if(a % 2 == 0)
	return 1;
	else
	return 0;
}