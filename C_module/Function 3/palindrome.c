//without parameter and without return type
//Write a program to check given 3 digit number is pallindrome or not.
#include<stdio.h>
void palindrome();
void main()
{
	palindrome();
}
void palindrome()
{
	int num,original,reversed=0;
	printf("Enter the number:\n");
	scanf("%d",&num);
	original = num;
	while(num != 0)
	{
		int digit = num % 10;
		reversed = reversed * 10 + digit;
		num = num / 10;
	}
	if(original == reversed){
		printf("The number is a palindrome.\n");
	}
	else{
		printf("The number is not a palindrome.\n");
	}
	

}