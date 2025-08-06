//with parameter and with return type.
//Find factorial of given number.
//Input: n = 5
//Output: 120
#include<stdio.h>
int factorial(int num);
void main()
{
	int num,i,final,result;
	printf("Enter the number ::\n");
	scanf("%d",&num);
	final = factorial(num);
	if(final == 0)
	printf("Entered value is invalid");
	else
	printf("factorial of number ::%d\n",final);
}
int factorial(int num)
{
	int result = 1;
	for(int i = 1; i <= num; i++)
	{
		result = result * i;
	}
	if(num <= 0)
	return 0;
	else 
	return result;
}