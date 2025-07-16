//Write a C program to swap two numbers using a temporary third variable.

#include<stdio.h>
void main()
{
	float a,b;
	float temp;
	printf("Enter the value of a,b\n");
	scanf("%f%f",&a,&b);
	temp=a;
	a=b;
	b=temp;
	printf("The value of a and b: %f%f",a,b);
}
