//Write a C program to input marks of five subjects, find the total marks, and calculate
////the percentage
#include<stdio.h>
void main()
{
	int a,b,c,d,e;
	int totalmarks,percentage;
	printf("Enter the marks of five subjects\n");
	printf("Science:");
	scanf("%d",&a);
	printf("English:");
	scanf("%d",&b);
	printf("Math:");
	scanf("%d",&c);
	printf("Hindi:");
	scanf("%d",&d);
	printf("Social Science:");
	scanf("%d",&e);
	totalmarks = (a+b+c+d+e);
	printf("Totalmarks:%d\n",totalmarks);
	percentage = totalmarks/5;
	printf("Percentage:%d",percentage);
}