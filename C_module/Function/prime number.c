//with parameter and with return type.
//Check the given number is prime or not.
//Input: n = 7
//Output: Prime
#include<stdio.h>
int prime(int num);
void main()
{
    int num,result;
    printf("Enter a number:\n");
    scanf("%d", &num);
    result = prime(num);
    if (result == 0)
    printf("Invalid Number\n");
    else if(result == 1)
    printf("Prime\n");
    else 
	printf("Not Prime\n");    
}
int prime(int num)
{
	int i, count = 0;
    for (i = 2; i < num; i++)
    {
        if (num % i == 0)
        {
            count = 1;
            break;
        }
    }
    if (num <= 0)
    return 0;
    else if(count == 0)
    return 1;
    else
    return 2;
}