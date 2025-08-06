//without parameter and with return type
//Write a program to check whether a given character is a vowel or consonant.
#include<stdio.h>
char vowel();
void main()
{
    char result;
    result = vowel();
    if(result == 1)
	printf("The given character is vowel\n");
	else
	printf("The given character is not vowel");
}
char vowel()
{
    char ch;
	printf("Enter the character:\n");
	scanf("%c",&ch);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	return 1;
	else
	return 0;
}