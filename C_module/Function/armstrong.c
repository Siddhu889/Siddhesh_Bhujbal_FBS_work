//with parameter and with return type.
//Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong
#include <stdio.h>
int armstrong(int num);
void main()
{
    int num,result;
    printf("Enter a number: ");
    scanf("%d", &num);
    result = armstrong(num);
    if (result == 0)
        printf("Armstrong\n");
    else
        printf("Not Armstrong\n");
}
int armstrong(int num)
{    
  int remainder, result = 0, originalNum = num;
  int n = 0, power , i;
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
	 return 0;
	 else
	 return 1;
}