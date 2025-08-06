#include<stdio.h>
void main() {
    char str[100];
    int i = 0, count = 0;

    printf("Enter a string:\n");
    gets(str); 
    while(str[i] != '\0') {
     if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' ||
     str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U') {
     count = count + 1;
        }
      i = i + 1;
    }

    printf("Number of vowels = %d\n", count);
}
