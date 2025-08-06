//with parameter and without return type.
// Print perfect numbers in the given range 1 to n.
#include<stdio.h>
void perfect(int start, int end);
int main()
{
    int start,end;
	printf("Enter the first number ::\n");
	scanf("%d",&start);
	printf("Enter the last number ::\n");
	scanf("%d",&end);
	perfect(start,end);
	return 0;
}
void perfect(int start, int end)
{
	int i,j,sum,result;
	for(i = start; i <= end; i++)
	{
		if(i <= 0)
		{
		continue;
	}
	
	sum = 0;
	for(j = 1; j <= i / 2; j++)
	{
		if(i % j == 0)
		{
		sum = sum + j;
	}
}
if(sum == i)
{
	printf("The perfect numbers ::%d\n",i);
}
}
}