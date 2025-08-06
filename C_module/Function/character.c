//with parameter and with return type
//Write a program to check whether a given character is uppercase or lowercase
#include<stdio.h>
int check(char ch);
void main()
{
	char ch;
	int result;
	printf("Enter the character:\n");
	scanf("%c",&ch);
	result = check(ch);
    if(result == 1)
	printf("The character is uppercase");
	else 
	printf("The character is lowercase");
}
int check(char ch){
	if(ch >= 'A' && ch <= 'Z')
	return 1;
	else
	return 0;
}
