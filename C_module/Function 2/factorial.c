#include<stdio.h>
int factorial();
int main()
{
	int result;
	result = factorial();
    if(result == -1)
	{
	printf("The number is invalid (negative input)\n");
	}
	else
	{
	printf("Factorial = %d\n", result);
	}
    return 0;
}

int factorial()
{
    int n, i, result = 1;
    printf("Enter the number:\n");
	scanf("%d", &n);
    if(n < 0)
	{
	return -1; 
	}
    for(i = 1; i <= n; i++)
	{
	result = result * i;
	}
    return result; 
}
