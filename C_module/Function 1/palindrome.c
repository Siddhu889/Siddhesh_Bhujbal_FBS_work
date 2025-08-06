//with parameter and without return type
//Check the given number is palindrome or not
//Input n = 121
//Output =Palindrome
#include<stdio.h>
void palindrome(int num);
void main()
{
	int num;
	printf("Enter the number:\n");
	scanf("%d",&num);
	palindrome(num);
}
void palindrome(int num)
{
	int reverse,temp,digit;
	temp = num;
	while(temp > 0)
	{
		digit = temp % 10;
		reverse = reverse * 10 + digit;
        temp = temp/10;		
	}
	if(reverse == num)
	{
		printf("Given number is palindrome");
	}
	else{
		printf("Given number is not palindrome");
	}
}
