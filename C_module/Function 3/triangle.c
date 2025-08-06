//without parameter and without return type.
//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.
#include<stdio.h>
void triangle();
void main()
{
	triangle();
}
void triangle()
{
	int a,b,c;
	printf("Enter the sides of a triangle:\n");
	scanf("%d%d%d",&a,&b,&c);
	if(a == b && b == c)
	{
		printf("The triangle is equilateral\n");
	}
	else if(a == b||b == c||c == a)
	{
		printf("The triangle is isosceles\n");
	}
	else if(a != b||b != c||c != a)
	{
		printf("The triangle is scalene\n");
	}
}