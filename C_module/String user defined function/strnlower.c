#include<stdio.h>
void mystrlower(char *str) {
    int i = 0;
    while(str[i] != '\0') {
        if(str[i] >= 'A' && str[i] <= 'Z') {
            str[i] = str[i] + 32;
        }
        i++;
    }
}
int main() {
    char mystring[] = "hello siddhesh here";
    mystrlower(mystring);
    printf("Lowercase string: %s\n",mystring);
    return 0;
}