//with parameter and with return type.
//Write a program to check whether a given year is a leap year.
#include<stdio.h>
int leapyear(int b);
void main()
{
	int year,result;
	printf("Enter the year:\n");
	scanf("%d",&year);
	result = leapyear(year);
	if(result == 1)
	printf("The year is leap year");
	else
	printf("The year is not leap year");
}
int leapyear(int b)
{
	if((b % 4 == 0 && b % 100 != 0)||(b % 400 == 0))
	return 1;
	else
	return 0;
}