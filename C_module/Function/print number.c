//with parameter and with return type.
//Print numbers from 1 to 10
//Output: 1 2 3 4 5 6 7 8 9 10
#include<stdio.h>
int numbers(int i);
void main()
{
	int i;
	numbers(i);
}
int numbers(int i)
{
	for(i=1;i<=100;i++)
	{
		printf("%d ",i);
	}
	return 0;
}