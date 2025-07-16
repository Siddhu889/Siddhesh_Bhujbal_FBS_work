//Write a C program to find the square and cube of a given number.

#include<stdio.h>
void main()
{
	int a;
	int square,cube;
	printf("Enter the number\n");
	scanf("%d",&a);
	square=a*a;
	cube=a*a*a;
	printf("square of a: %d\n",square);
	printf("cube of a: %d",cube);
}