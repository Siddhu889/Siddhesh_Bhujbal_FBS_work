//Write a C program to input the length and width of a rectangle and find its perimeter.

#include<stdio.h>
void main()
{
	int a,b;
	int area,perimeter;
	printf("Enter the value of length\n");
	scanf("%d",&a);
	printf("Enter the value of width\n");
	scanf("%d",&b);
	area = a*b;
	perimeter = 2*(a+b);
	printf("area of rectangle:%d\n",area);
	printf("perimeter of rectangle:%d",perimeter);
}