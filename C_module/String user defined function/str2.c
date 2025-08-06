#include<stdio.h>

void main() {
    char str[100];
    int i, n;
    printf("Enter a string:\n");
    gets(str);  
    printf("Enter the index to remove (starting from 0):\n");
    scanf("%d", &n);

    for(i = n; str[i] != '\0'; i++) {
        str[i] = str[i + 1];  
    }
    printf("String after removing the character%d:\n",  n);
    printf("%s\n", str);
}
