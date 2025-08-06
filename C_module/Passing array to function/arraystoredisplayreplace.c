#include<stdio.h>
void storeArray(int*ptr,int size);
void displayArray(int*ptr,int size);
void replace(int*ptr,int size,int old,int new);
void main()
{
	int arr[10];
	printf("Enter the elements of an array\n");
	storeArray(arr,10);
	printf("Display array\n");
	displayArray(arr,10);
	replace(arr,10,5,7);
	printf("\nReplaced array\n");
	displayArray(arr,10);
}
void storeArray(int*ptr,int size)
{
	for(int i=0;i<size;i++)
	scanf("%d",&ptr[i]);
}
void displayArray(int*ptr,int size)
{
	for(int i=0;i<size;i++)
	printf("%d",ptr[i]);
}
void replace(int*ptr,int size,int old,int new)
{
	for(int i=0;i<size;i++){
		if(ptr[i]==old) ptr[i]=new;
	}
}