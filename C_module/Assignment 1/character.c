//Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
void main()
{
	char ch;
	printf("Enter the character:\n");
	scanf("%c",&ch);
	if(ch>='A'&&ch<='Z')
	printf("The character is uppercase");
	else if(ch>='a'&&ch<='z')
	printf("The character is lowercase");
}