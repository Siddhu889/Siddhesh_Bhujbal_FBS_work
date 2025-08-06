//without parameter and with return type
//Write a program to check whether a given year is a leap year.
#include<stdio.h>
int leap();
void main()
{
	int result;
	result = leap();
	if(result == 1)
	printf("The year is leap year");
	else
	printf("The year is not leap year");
}
int leap()
{
	int year;
	printf("Enter the year:\n");
	scanf("%d",&year);
	if((year%4==0&&year%100 != 0)||(year%400 == 0))
	return 1;
	else 
	return 0;
}