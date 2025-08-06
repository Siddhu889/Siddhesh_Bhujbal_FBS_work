//with parameter and with return type.
//Check the given number is palindrome or not
//Input n = 121
//Output =Palindrome
#include<stdio.h>
int palindrome(int num);
void main()
{
	int num,result;
	printf("Enter the number:\n");
	scanf("%d",&num);
	result = palindrome(num);
	if(result == 0)
{
		printf("Given number is palindrome");
}
	else{
		printf("Given number is not palindrome");
}
}
int palindrome(int num)
{
	int digit,reverse = 0;
	int temp = num;
	while(temp > 0)
{
		digit = temp % 10;
		reverse = reverse * 10 + digit;
        temp = temp/10;		
}
    if(reverse == num)
    return 0;
    else
    return 1;
}
	