//Find factorial of given number.
//Input: n = 5
//Output: 120
#include<stdio.h>
void factorial();
void main()
{
    factorial();	
}
void factorial()
{
	int n,i;
	int result = 1;
	printf("Enter the number:\n");
	scanf("%d",&n);
	if(n <= 0)
	{
		printf("the num is invalid");
	}
	for(i = 1; i<= n; i++)
	{
		result = result * i;
	
	}
	printf("%d",result);
}