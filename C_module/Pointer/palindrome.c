//pointer
//with parameter and with return type.
//Write a program to check given 3 digit number is pallindrome or not.
#include<stdio.h>
int palindrome(int num);
void main()
{
	int num,original,reversed=0,result;
	printf("Enter a three digit:\n");
	scanf("%d",&num);
	result = palindrome(num);
	original = num;
	while(num != 0)
	{
		int digit=num%10;
		reversed = reversed*10+digit;
		num=num/10;
	}
	if(result == 1){
		printf("The number is a palindrome.\n");
	}
	else{
		printf("The number is not a palindrome.\n");
	}
	
}
int palindrome(int num)
{
	if(original == reversed)
	return 1;
	else
	return 0;
}