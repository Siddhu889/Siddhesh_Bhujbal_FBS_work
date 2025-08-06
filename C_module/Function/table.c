//with parameter and with return type.
//Print table for given number.
//Input: n = 5
//Output: 5 10 15 20 25 30 35 40 45 50
#include<stdio.h>
int table(int n);
void main()
{
	int i,n,result,sum;
	printf("Enter the number:\n");
	scanf("%d",&n);
	result = table(n);
	if(result == 1)
	printf("Table printed successfully");
	else
	printf("Invalid number entered");
}
int table(int n)
{
    int sum;
    if(n <= 0)
	return 0;
	for(int i = 0; i <= 10; i++)
	{
		printf("%d\n",n*i);
	}
	return 1;
}