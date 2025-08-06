//Check the given number is palindrome or not
//Input n = 121
//Output =Palindrome
#include<stdio.h>
void palindrome();
void main()
{
	palindrome();
}
void palindrome()
{
	int num,reverse,temp,digit;
	printf("Enter the number:\n");
	scanf("%d",&num);
	temp = num;
	while(temp > 0){
		digit = temp % 10;
		reverse = reverse * 10 + digit;
        temp = temp / 10;		
	}
	if(reverse == num)
	{
		printf("Given number is palindrome");
	}
	else{
		printf("Given number is not palindrome");
	}
}