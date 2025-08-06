//code of menu driven array
#include<stdio.h>
void search(int*,int,int)
void delete(int*,int,int)
//void max(int*,int,int)
//void min(int*,int,int)
//void update(int*,int,int)
void main()
{
	void search(int*arr,int n,int target){
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == target){
				printf("%d found at %d index",target,i);
				return;
			}
	void delete(int*arr,int*n,int target) {
        int i, found = 0;
            for(i = 0; i < *n; i++) {
            if(arr[i] == target) {
            found = 1;
            break;	
		}
		
	}
	void findMax(int* arr, int n) {
    int max = arr[0];
    for(int i = 1; i < n; i++) {
        if(arr[i] > max)
            max = arr[i];
    }
    printf("Maximum element: %d\n", max);
}

}