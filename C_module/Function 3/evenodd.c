//without parameter and without return type
//Write a program to check whether a number is even or odd.
#include<stdio.h>
void evenodd();
void main()
{
	evenodd();
}
void evenodd()
{
	int a;
	printf("Enter the number ::\n");
	scanf("%d",&a);
	if(a % 2 == 0)
	printf("Number is even");
	else
	printf("Number is odd");
}