//with parameter and without return type
//Find factorial of given number.
//Input: n = 5
//Output: 120
#include<stdio.h>
void fact(int n);
void main()
{
	int n;
	printf("Enter the number:\n");
	scanf("%d",&n);
	fact(n);	
}
void fact(int n)
{
	int result = 1;
	if(n <= 0)
	{
		printf("the num is invalid");
	}
	for(int i = 1; i <= n; i++)
	{
		result = result * i;
	
	}
	printf("%d",result);
}