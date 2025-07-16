//Write a C program to find the area of a circle.

#include<stdio.h>
void main()
{
	float r,area;
	float pi=3.14;
	printf("Enter The Value Of Radius:\n");
	scanf("%f",&r);
	area=pi*r*r;
	printf("Area of Circle =%2.f",area);
}