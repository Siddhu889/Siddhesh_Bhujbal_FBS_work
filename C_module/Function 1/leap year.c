//with parameter and without return type.
//Write a program to check whether a given year is a leap year.
#include<stdio.h>
void leap(int year);
void main()
{
	int year;
	printf("Enter the year:\n");
	scanf("%d",&year);
	leap(year);
}
void leap(int year)
{
	if((year % 4 == 0&&year % 100 != 0)||(year % 400 == 0))
	printf("The year is leap year");
	else
	printf("The year is not leap year");
}