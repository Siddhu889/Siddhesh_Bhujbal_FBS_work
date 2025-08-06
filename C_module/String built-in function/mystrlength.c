#include<stdio.h>
int mystrlen(const char *src)
{
	int i = 0;
	while(src[i] != '\0'){
		i++;
	}
	return i;
}
int main(){
	char mystring[] = "hello i am siddhesh here";
	int length = mystrlen(mystring);
	printf("length of my string %d\n",length);
	return 0;
}
