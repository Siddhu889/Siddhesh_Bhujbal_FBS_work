//with parameter and without return type
//Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)
#include<stdio.h>
void digit(int num);
void main()
{
	int num;
	printf("Enter the numbers:\n");
	scanf("%d",&num);
	digit(num);
} 
void digit(int num)
{
	int first,last,sum,temp;
	temp = num;
	last = temp % 10;
	while(temp >= 10)
	{
		temp = temp / 10;
	}
	first = temp;
	sum = first + last;
	printf("first digit ::%d\n",temp);
	printf("last digit ::%d\n",last);
	printf("sum(first + last) ::%d\n",sum);
}