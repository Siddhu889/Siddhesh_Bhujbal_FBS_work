#include<stdio.h>

void main() {
    char str[100];
    int i;
    printf("Enter a string:\n");
    gets(str);  
    for(i=0; str[i] != '\0'; i++) {
        if(str[i]=='a') {
            str[i]='$';
        }
    }
    printf("String after replacing 'a' with '$':\n");
    printf("%s\n", str);
}
