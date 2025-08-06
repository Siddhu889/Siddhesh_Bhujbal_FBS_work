//without parameter and with return type.
//Ask the user to enter marks.
//Then show the result based on these rules:
//If marks are more than 75 ? show "Distinction"
//If marks are more than 65 ? show "First Class"
//If marks are more than 55 ? show "Second Class"
//If marks are 40 or more ? show "Pass Class"
//If marks are less than 40 ? show "Fail"
#include<stdio.h>
int marks();
void main()
{
  int result;
  result = marks();
  if(result == 1)
  {
  	printf("Distinction");
  }
  else if(result == 0)
  {
  	printf("First class");
	  }	
  else if(result == 2)
  {
  	printf("Second class");
	  }	
  else if(result == 3)
  {
  	printf("Pass class");
		}	  
  else if(result == 4)
  {
  	printf("Fail");
		  }	
  else 
  {
  	printf("Marks are not entered valid");
				}		  	
}
int marks()
{
  int a;
  printf("Enter the marks:\n");
  scanf("%d",&a);
  if(a >= 75)
  return 1;
  else if(a >= 65)
  return 0;
  else if(a >= 55)
  return 2;
  else if(a >= 40)
  return 3;
  else if(a <= 40)
  return 4;	
  else 
  return 5;	
}