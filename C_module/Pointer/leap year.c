//pointer
//with parameter and with return type.
//Write a program to check whether a given year is a leap year.
#include<stdio.h>
int leap(int* year);
void main()
{
	int year,result;
	printf("Enter the year:\n");
	scanf("%d",&year);
	result = leap(&year);
	if(result == 1)	
	printf("The year is leap year");
	else
	printf("The year is not leap year");
}
int leap(int* year)
{
	if((*year % 4 == 0 && *year % 100 != 0)||(*year % 400 == 0))
	return 1;
	else 
	return 0;	
}