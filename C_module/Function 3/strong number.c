//Check the given number is Strong number or not
//Input n :145;
//Output : Strong
#include<stdio.h>
void strong();
void main()
{
	strong();
}
void strong()
{
	int num,sum,number,fact,temp = 0;
	printf("Enter the number\n");
	scanf("%d",&num);
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
{
	printf("The number is strong number");
}
else{
	printf("The number is not strong number");

}
}