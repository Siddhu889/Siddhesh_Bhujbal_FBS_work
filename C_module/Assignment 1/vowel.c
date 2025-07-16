//Write a program to check whether a given character is a vowel or consonant.
#include<stdio.h>
void main()
{
	char ch;
	printf("Enter the character:\n");
	scanf("%c",&ch);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	printf("The given character is vowel\n");
	else
	printf("The given character is not vowel");
}