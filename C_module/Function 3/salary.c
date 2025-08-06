//without parameter and without return type
//Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
//10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
//respectively.
#include<stdio.h>
void salary();
void main()
{
   salary();
}
void salary()
{
		float basic,da,ta,hra,total;
	printf("Enter the salary:\n");
	scanf("%f",&basic);
	if(basic<=5000)
	{
		da= 0.10*basic;
		ta= 0.20*basic;
		hra=0.25*basic;
	}
    else
	{
		da=0.15*basic;
		ta=0.25*basic;
		hra=0.30*basic;
	 } 
	total = da+ta+hra+basic;
	
	printf("basic salary:%.2f\n",basic);
	printf("da:%.2f\n",da);
	printf("ta:%.2f\n",ta);
	printf("hra:%.2f\n",hra);
}