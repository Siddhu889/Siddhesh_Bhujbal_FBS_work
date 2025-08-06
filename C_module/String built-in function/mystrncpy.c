#include<stdio.h>
void mystrncpy(char *dest, char *src, int n) {
    int i;
    for(i=0; i<n&&src[i]!='\0'; i++) {
        dest[i] = src[i];
    }
    dest[i]='\0';
}
int main() {
    char source[] = "Hello i am siddhesh here";
    char destination[100];
    mystrncpy(destination, source, 100);
    printf("Copy string :: %s\n", destination);  
    return 0;
}