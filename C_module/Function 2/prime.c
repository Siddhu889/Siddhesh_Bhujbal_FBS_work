//without parameter and with return type.
//Check the given number is prime or not.
//Input: n = 7
//Output: Prime
#include<stdio.h>
int prime();
int main()
{
    int total;
    total = prime();
    if (total == 2)
    {
        printf("Not Prime\n");
    }
    if (total == 1)
        printf("Prime\n");
    else 
        printf("Not Prime\n");
}
int prime()
{
	int num, i, count = 0;

    printf("Enter a number:\n");
    scanf("%d", &num);

    if (num <= 1)
    {
        printf("Not Prime\n");
        return 2;
    }

    for (i = 2; i < num; i++)
    {
        if (num % i == 0)
        {
            count = 1;
            break;
        }
    }

    if (count == 0)
    return 1;
    else
    return 0;
}