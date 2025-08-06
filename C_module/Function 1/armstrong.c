//with parameter and without return type
//Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong
#include <stdio.h>
void armstrong(int num);
void main()
{
    int num, originalNum, remainder, result = 0, n = 0, power, i;
    printf("Enter a number:\n ");
    scanf("%d", &num);
    armstrong(num);    
}
void armstrong(int num)
{
	int originalNum, remainder, result = 0, n = 0, power, i;
	originalNum = num;

    
    while (originalNum != 0)
    {
        originalNum = originalNum / 10;
        n++;
    }

    originalNum = num;

    
    while (originalNum != 0)
    {
        remainder = originalNum % 10;

       
        power = 1;
        for (i = 1; i <= n; i++)
        {
            power = power * remainder;
        }

        result = result + power;
        originalNum = originalNum / 10;
    }

    
    if (result == num)
        printf("Armstrong\n");
    else
        printf("Not Armstrong\n");
}
