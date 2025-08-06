//pointer
//with parameter and with return type.
//Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
char character(char* ch);
void main()
{
	char ch,result;
	printf("Enter the character:\n");
	scanf(" %c ",&ch);
	result = character(&ch);
	if(result == 1)
	printf("The character is uppercase");
	else if(result == 0)
	printf("The character is lowercase");
}
char character(char* ch)
{
	if(*ch >= 'A'&&*ch <= 'Z')
	return 1;
	else if(*ch >= 'a'&&*ch <= 'z')
	return 0;
}