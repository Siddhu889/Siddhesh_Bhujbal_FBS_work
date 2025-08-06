#include<stdio.h>

void main() {
    char str[100];
    char ch;
    int i, found = 0;
    printf("Enter a string:\n");
    gets(str);  
    printf("Enter a character to search:\n");
    scanf("%c", &ch);
    for(i = 0; str[i] != '\0'; i++) {
      if(str[i] == ch) {
    found = 1;
      break;
    }
    }
    if(found == 1)
        printf("Character is found in the string.\n");
    else
        printf("Character is not found in the string.\n");
}
