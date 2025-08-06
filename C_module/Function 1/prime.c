//with parameter and without return type
//Check the given number is prime or not.
//Input: n = 7
//Output: Prime
#include<stdio.h>
void prime(int num);
void main()
{
    int num;
    printf("Enter a number:\n");
    scanf("%d", &num);
    prime(num);
}
void prime(int num)
{
	int count = 0;
	if (num <= 1)
    {
        printf("Not Prime\n");
        return;
    }

    for (int i = 2; i < num; i++)
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