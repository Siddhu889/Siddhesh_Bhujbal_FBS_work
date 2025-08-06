#include<stdio.h>
void main()
{
	char str[10] ,temp;
	int i,len = 0;
	//char* mystrrev(char*);
	printf("Enter a string:");
	gets(str);
	 while (str[len] != '\0') {
        len++;
}
for (i = 0; i < len / 2; i++) {
        temp = str[i];
    str[i] = str[len - 1 - i];
        str[len - 1 - i] = temp;
}
    printf("Reversed string: %s", str);
}

