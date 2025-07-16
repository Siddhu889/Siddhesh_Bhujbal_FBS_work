//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.
#include<stdio.h>
void main()
{
	int a,b,c;
	printf("Enter the sides of a triangle:");
	scanf("%d%d%d",&a,&b,&c);
	if(a = b = c)
	{
		printf("The triangle is equilateral\n");
	}
	else if(a =b||b = c||c = a)
	{
		printf("The triangle is isosceles\n");
	}
	else if(a != b||b != c||c != a)
	{
		printf("The triangle is scalene\n");
	}
}