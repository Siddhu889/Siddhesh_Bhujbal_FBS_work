//without parameter and with return type.
//Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong
#include <stdio.h>
int armstrong();
int main()
{
    int total;
    total = armstrong();
    if (total == 1)
        printf("Armstrong\n");
    else
        printf("Not Armstrong\n");
}
int armstrong()
{
	int num, originalNum, remainder, result = 0, n = 0, power, i;

    printf("Enter a number: ");
    scanf("%d", &num);

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
    return 1;
    else
    return 0;
}
