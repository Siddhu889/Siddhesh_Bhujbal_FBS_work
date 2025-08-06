//with parameter and without return type.
//Write a menu driven program to take a number for user and perform operations as follows.
//Press 1.To check number is even or odd.
//2.To check number is prime or not.
//3.To check number is pallindrome or not.
//4.To check number is positive, negative or zero.
//5.To reverse a number.
//6.To find sum of digits.
#include<stdio.h>
void op(int operation,int num);
void main()
{
	int num,operation;
	printf("following operations are driven from the menu\n");
	printf("select the operation:\n");
	printf("1.To check number is even or odd.\n");
	printf("2.To check number is prime or not.\n");
	printf("3.To check number is pallindrome or not.\n");
	printf("4.To check number is positive, negative or zero.\n");
	printf("5.To reverse a number.\n");
	printf("6.To find sum of digits.\n");
	printf("Press the number to perform to perform operation:\n");
	scanf("%d",&operation);
	printf("Enter the number:\n");
	scanf("%d",&num);
	op(operation,num);
}
void op(int operation, int num)
{
	int temp,digit,reverse,sum,isPrime;
	if(operation == 1){
		if(num % 2 == 0)
		printf("even number\n");
		else
		printf("odd number\n");
	}
    else if(operation == 2)
	{
	isPrime = 1;
	if(num <= 1){
		isPrime = 0;
	}
	else{
	for(int i = 2; i < num; i++){
		if(num % i == 0){
			isPrime = 0;
			break;
		}
	}
}
	if(isPrime)
		printf("Prime number");
    else
		printf("Not a prime number");
	}
	else if(operation == 3)
	{
		    temp = num;
		    reverse = 0;
	while(temp > 0){
		digit = temp % 10;
		reverse = reverse * 10 + digit;
        temp = temp/10;		
	}
	if(reverse == num)
		printf("Given number is palindrome");
	else
		printf("Given number is not palindrome");
	}
	else if(operation == 4)
	{
		if(num == 0)
			printf("number is zero");
		else if(num > 0)
			printf("number is positive");
		else
			printf("number is negative");
	}
	else if(operation == 5)
	{
		temp = num;
		 reverse = 0;
	while(temp > 0){
		digit = temp % 10;
		reverse = reverse * 10 + digit;
		temp = temp / 10;
	}
	printf("Reversed number: %d\n", reverse);
	}
	else if(operation == 6)
	{
		temp = num;
	 sum = 0;
	while(temp > 0){
		digit = temp % 10;
		sum = sum + digit;
		temp = temp / 10;
	}
	printf("Sum of digits: %d", sum);
}
else
{
	printf("the number is invalid");
}
}