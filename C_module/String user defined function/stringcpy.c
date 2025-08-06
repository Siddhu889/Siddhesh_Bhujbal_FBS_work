#include<stdio.h>
void mystrcpy(char *dest,const char *src)
{
	int i = 0;
	while(src[i] != '\0'){
		dest[i] = src[i];
		i++;
	}
	dest[i] ='\0';
}
int main() {
    char source[] = "Hii siddhesh here";
    char destination[100];
    mystrcpy(destination, source);
    printf("Copy String :: %s\n", destination);
    return 0;
}