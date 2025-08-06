//with parameter and with return type.
//Write a program to check whether a given character is a vowel or consonant.
#include<stdio.h>
char character(char ch);
void main()
{
	char ch;
	int result;
	printf("Enter the character:\n");
	scanf("%c",&ch);
	result = character(ch);
	if(result == 1)
	printf("The given character is vowel\n");
	else
	printf("The given character is not vowel");
}
char character(char ch)
{
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	return 1;
	else
	return 0;
}