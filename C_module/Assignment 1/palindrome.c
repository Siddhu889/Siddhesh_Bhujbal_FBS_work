//Write a program to check given 3 digit number is pallindrome or not.
#include<stdio.h>
void main()
{
	int num,original,reversed=0;
	printf("Enter a three digit:\n");
	scanf("%d",&num);
	original = num;
	while(num != 0)
	{
		int digit=num%10;
		reversed = reversed*10+digit;
		num=num/10;
	}
	if(original == reversed){
		printf("The number is a palindrome.\n");
	}
	else{
		printf("The number is not a palindrome.\n");
	}
	
}