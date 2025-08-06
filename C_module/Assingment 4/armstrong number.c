//Print armstrong numbers in the given range 1 to n.
#include<stdio.h>
#include<math.h>
void main()
{
int start,end,sum,temp,result,num,i,count,digit;
printf("Enter the first digit:\n");
scanf("%d",&start);
printf("Enter the last digit:\n");
scanf("%d",&end);
printf("Armstrong number from %d to %d are:\n",start,end);
for(int num = start; num <= end; num++){
temp = num;
count = 0;
sum = 0;
while(temp != 0){
	count++;
	temp = temp / 10;
}
temp = num;
while(temp != 0){
	digit = temp % 10;
	sum = sum + pow(digit,count);
	temp = temp / 10;
}
if(sum == num){
	printf("%d\n",num);
}
}
}