//Check the given number is prime or not.
//Input: n = 7
//Output: Prime
#include<stdio.h>
void prime();
void main()
{
    prime();
}
void prime()
{
	int num, i, count = 0;

    printf("Enter a number:\n");
    scanf("%d", &num);

    if (num <= 1)
    {
        printf("Not Prime\n");
        return;
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
        printf("Prime\n");
    else
        printf("Not Prime\n");
}