//without parameter and without return type.
//Accept the price from user. Ask the user if he is a student (user may say y or n). If he
//is a student and he has purchased more than 500 than discount is 20% otherwise
//discount is 10%.But if he is not a student then if he has purchased more than 600
//discount is 15% otherwise there is not discount.
#include<stdio.h>
void price();
void main()
{
	price();
}
void price()
{
    int a;
	char result;
	printf("Enter the price:\n");
	scanf("%d",&a);
	printf("Enter what you are\n");
	printf("1.a student\n");
	printf("2.not a student\n");
	printf("press y if you are student else n\n");
	scanf(" %c",&result);
	if(result == 'y')
	{
		if(a >= 500)
		{
		printf("The discount is 20%");
		}
		else 
		{
		printf("The discount is 10%");	
		}
	}
	else if(result == 'n')
	{
	    if(a >= 600)
		{
			printf("The discount is 15%");
		}
		else
		{
			printf("There is no discount on such amount");
		}
		
	}
	else 
	{
		printf("The amount entered is invalid");
	}	
}