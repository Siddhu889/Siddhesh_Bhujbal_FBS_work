//without parameter and with return type.
#include <stdio.h>
int digit();
int main()
{
    int total;
    total = digit();  
    printf("Sum of first and last digit = %d\n", total);
    return 0;
}
int digit()
{
    int num, temp, first, last, sum;
    printf("Enter the number:\n");
    scanf("%d", &num);
    temp = num;
    last = temp % 10;
    while (temp >= 10)
    {
        temp = temp / 10;
    }
    first = temp;
    sum = first + last;
    return sum;
}
