//with parameter and with return type.
//Merge two arrays.
#include<stdio.h>
int merge(int arr[],int brr[],int n1,int n2)
{
	int i;
	printf("Enter the %d number of elements in the first array::\n",n1);
	for(i = 0; i < n1; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter the %d number of element in the second array::\n",n2);
	for(i = 0; i < n2; i++)
	{
		scanf("%d",&brr[i]);
	}
	return 0;
}
int main()
{
	int arr[100],brr[100],crr[200],n1,i,n2,j;
	printf("Enter the number of elements in the first array::\n");
	scanf("%d",&n1);
	printf("Enter the number of elements in the second array::\n");
	scanf("%d",&n2);
	merge(arr,brr,n1,n2);
	for(i = 0; i < n1; i++)
	{
		crr[i] = arr[i];
	}
	for(i = 0; i < n2; i++)
	{
		crr[n1+i] = brr[i];
	}
	printf("Merged number::\n");
	for(i = 0; i <(n1 + n2); i++)
	{
		printf("%d ",crr[i]);
	}
	printf("\n");
	return 0;
}