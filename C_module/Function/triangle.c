//with parameter and with return type.
//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.
#include<stdio.h>
int triangle(int a,int b,int c);
void main()
{
	int a,b,c,result;
	printf("Enter the sides of a triangle:\n");
	scanf("%d%d%d",&a,&b,&c);
	result = triangle(a,b,c);
	if(result == 0)
	{
		printf("The triangle is equilateral\n");
	}
	else if(result == 1)
	{
		printf("The triangle is isosceles\n");
	}
	else if(result == 2)
	{
		printf("The triangle is scalene\n");
	}
}
int triangle(int a,int b,int c)
{
	if(a == b && b == c)
	return 0;
	else if(a == b||b == c||c == a)
	return 1;
	else if(a != b||b != c||c != a)
	return 2;
}