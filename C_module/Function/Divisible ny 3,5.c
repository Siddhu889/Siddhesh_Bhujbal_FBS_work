//with parameter and with return type.
//Accept a number and check if it is divisible by 3, 5, or both.
//(Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
//both" or” Divisible by None”)
#include<stdio.h>
int divisible(int a);
void main()
{
	int a,result;
	printf("Enter a number\n");
	scanf("%d",&a);
	result = divisible(a);
	if(result == 0)
	{
		printf("Divisible by both 3 and 5");
	}
	else if(result == 1)
	{
	printf("Divisible by 3 not by 5");
    }
    else if(result == 2)
    {
    	printf("Divisible by 5 not by 3");
	}
	else
	{
		printf("Divisible by none");
	 } 
}
int divisible(int a)
{
	if(a % 3 == 0&&a % 5 == 0)
	return 0;
	else if(a % 3 == 0)
	return 1;
	else if(a % 5 == 0)
	return 2;
	else
	return 3;
}