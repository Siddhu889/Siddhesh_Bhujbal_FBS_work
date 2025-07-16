//Write a C program to input five numbers and find their average.

#include<stdio.h>
void main()
{
	float a,b,c,d,e;
	float average;
	printf("Enter the five numbers:\n");
	scanf("%f%f%f%f%f",&a,&b,&c,&d,&e);
	average=(a+b+c+d+e)/5;
	printf("Average of five numbers: %.2f",average);
}