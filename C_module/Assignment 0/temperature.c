//Write a C program to convert temperature from Celsius to Fahrenheit using the
//formula:
//F = (C *9/5) + 32

#include<stdio.h>
void main()
{
	float celsius,fahrenheit;
	printf("Enter the value of temperature in (celsius):\n");
	scanf("%f",&celsius);
	fahrenheit=(celsius * 9/5)+32;
	printf("The value of fahrenheit =%.2f",fahrenheit);
	
}