//pointer
//Write a program to check whether a given character is a vowel or consonant.
#include<stdio.h>
char vowel(char* ch);
void main()
{
	char ch,result;
	printf("Enter the character:\n");
	scanf("%c",&ch);
	result = vowel(&ch);
	if(result == 1)
	printf("The given character is vowel\n");
	else
	printf("The given character is not vowel\n");
}
char vowel(char* ch)
{
	if(*ch=='a'||*ch=='e'||*ch=='i'||*ch=='o'||*ch=='u'||*ch=='A'||*ch=='E'||*ch=='I'||*ch=='O'||*ch=='U')
	return 1;
	else
	return 0;
}