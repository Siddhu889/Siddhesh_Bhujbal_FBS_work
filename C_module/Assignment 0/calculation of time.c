//Write a C program to convert given minutes into hours and remaining minutes.

#include<stdio.h>
void main()
{
	int minutes,hours,remaining_minutes;
	printf("Enter the given minutes");
	scanf("%d",&minutes);
	hours = (minutes)/60;
	remaining_minutes = minutes%60;
    printf("Required time: %d hour(s) and %d minute(s)\n", hours, remaining_minutes);
}