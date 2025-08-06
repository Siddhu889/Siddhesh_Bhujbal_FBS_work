//without parameter and with return type
//Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
char letter();
void main()
{
	char result;
	result = letter();
	if(result == 1)
	printf("The character is uppercase");
	else if(result == 0)
	printf("The character is lowercase");
}
char letter()
{
	char ch;
	printf("Enter the character:\n");
	scanf("%c",&ch);
	if(ch >= 'A' && ch <= 'Z')
	return 1;
	else if(ch >= 'a' && ch <= 'z')
	return 0;
}