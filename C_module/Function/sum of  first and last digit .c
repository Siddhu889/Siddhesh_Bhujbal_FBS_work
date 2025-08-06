//with parameter and with return type.
//Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)
#include<stdio.h>
int sum(int num);
void main()
{
	int num,result,first,last;
	printf("Enter the numbers:\n");
	scanf("%d",&num);
	result = sum(num);
	printf("sum(first + last) ::%d\n",result);
}
int sum(int num)
{
	int first,last,sum,temp;
	last = num % 10;
	while(num >= 10)
	{
		num = num / 10;
	}
	first = num;
    return first + last;
}