//Write a C program to input the base and height of a triangle and calculate its area.

#include<stdio.h>
void main()
{
	int a,b;
	int area;
	printf("Enter the value of base:\n");
	scanf("%d",&a);
	printf("Enter the value of height:\n");
	scanf("%d",&b);
	area = 0.5*a*b;
	printf("Area of triangle: %d",area);
}