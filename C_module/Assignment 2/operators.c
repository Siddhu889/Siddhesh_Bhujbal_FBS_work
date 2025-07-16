#include <stdio.h>

void main() {
    int a, b, result;
    char op;

    printf("Enter the two integers:\n");
    scanf("%d%d", &a, &b);

    printf("Enter the operator:\n+\n-\n*\n/\n%%\n");
    scanf(" %c", &op);  // Space before %c skips leftover newline

    if(op == '+') {
        result = a + b;
        printf("Addition = %d\n", result);
    }
    else if(op == '-') {
        result = a - b;
        printf("Subtraction = %d\n", result);
    }
    else if(op == '*') {
        result = a * b;
        printf("Multiplication = %d\n", result);
}
//    else if(op == '/') {
//        if(b != 0) {
//            result = a / b;
//            printf("Division = %d\n", result);
//        } else {
//            printf("Division by zero not allowed.\n");
//        }
//    }
//    else if(op == '%') {
//        if(b != 0) {
//            result = a % b;
//            printf("Modulo = %d\n", result);
//        } else {
//            printf("Modulo by zero not allowed.\n");
//        }
//    }
   else {
        printf("Invalid operator entered.\n");
    }
}
