//with parameter and with return type.
//Check the given number is Strong number or not
//Input n :145;
//Output : Strong
#include<stdio.h>
int strong(int num);
void main()
{
	int num,result;
	printf("Enter the number\n");
	scanf("%d",&num);
	result = strong(num);
if(result == 0)
{
	printf("The number is strong number");
}
else{
	printf("The number is not strong number");

}
}
int strong(int num)
{
	int sum,number,fact,temp = 0;
	temp = num;
	while(temp > 0){
		number = temp % 10;
		fact = 1;
		for(int i = 1; i <= number; i++){
		fact = fact * i;
	}
	sum = sum + fact;
	temp= temp / 10;
}
	if(sum == num)
	return 0;
	else 
	return 1;
}