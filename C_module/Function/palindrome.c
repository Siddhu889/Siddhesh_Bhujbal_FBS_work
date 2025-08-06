//with parameter and with return type.
//Write a program to check given 3 digit number is pallindrome or not.(
#include<stdio.h>
int palindrome(int num);
void main()
{
	int temp,num,result,reversed = 0;
	printf("Enter the number ::\n");
	scanf("%d",&num);
	temp = num;
	result = palindrome(num);
	if(result == 1)
	printf("Number is palindrome ::\n");
	else
	printf("Number is not palindrome ::\n");
	}
int palindrome(int num)
{
	int temp = num;
	int reversed = 0, digit;
	while(num != 0){
	int digit = num % 10;
	reversed = reversed * 10 + digit;
	num = num / 10;
}
    if(reversed == temp)
	return 1;
	else
	return 0;
}
