//without parameter and with return type.
//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.
#include<stdio.h>
int triangle();
void main()
{
	int result;
	result = triangle();
	if(result == 1)
	{
		printf("The triangle is equilateral\n");
	}
	else if(result == 0)
	{
		printf("The triangle is isosceles\n");
	}
	else if(result == 2)
	{
		printf("The triangle is scalene\n");
	}
}
int triangle()
{
	int a,b,c;
	printf("Enter the sides of a triangle:\n");
	scanf("%d%d%d",&a,&b,&c);
	if(a == b && b == c)
	return 1;
	else if(a == b||b == c||c == a)
	return 0;
	else if(a != b||b != c||c != a)
	return 2;
}