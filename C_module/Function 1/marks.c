//with parameter and without return type.
//Ask the user to enter marks.
//Then show the result based on these rules:
//If marks are more than 75 ? show "Distinction"
//If marks are more than 65 ? show "First Class"
//If marks are more than 55 ? show "Second Class"
//If marks are 40 or more ? show "Pass Class"
//If marks are less than 40 ? show "Fail"
#include<stdio.h>
void marks(int a);
void main()
{
  int a;
  printf("Enter the marks:\n");
  scanf("%d",&a);
  marks(a); 		  	
}
void marks(int a)
{
  if(a >= 75)
  {
  	printf("Distinction");
  }
  else if(a >= 65)
  {
  	printf("First class");
	  }	
  else if(a >= 55)
  {
  	printf("Second class");
	  }	
  else if(a >= 40)
  {
  	printf("Pass class");
		}	  
  else if(a <= 40)
  {
  	printf("Fail");
		  }	
  else 
  {
  	printf("Marks are not entered valid");
				}	
}