//with parameter and without return type.
//Accept a number and check if it is divisible by 3, 5, or both.
//(Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
//both" or” Divisible by None”)
#include<stdio.h>
void divisible(int a);
void main()
{
	int a;
	printf("Enter a number\n");
	scanf("%d",&a);
	divisible(a);
}
void divisible(int a)
{
	if(a % 3 == 0&&a % 5 == 0)
	{
		printf("Divisible by both 3 and 5");
	}
	else if(a % 3 == 0)
	{
	printf("Divisible by 3 not by 5");
    }
    else if(a % 5 == 0)
    {
    	printf("Divisible by 5 not by 3");
	}
	else
	{
		printf("Divisible by none");
	 } 
}