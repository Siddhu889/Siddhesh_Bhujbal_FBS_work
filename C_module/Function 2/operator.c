#include<stdio.h>
int operator(); 
void main()
{
    int total;
    total = operator();  
}
int operator()
{
    int a, b, result, op;   
    printf("Enter the two numbers:\n");
    scanf("%d%d", &a, &b);
    printf("Enter the operator:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo\n");
    scanf("%d", &op);
    if(op == 1)
    {
        result = a + b;
        printf("Addition of two numbers: %d\n", result);
        return 1;
    }
    else if(op == 2)
    {
        result = a - b;
        printf("Subtraction of two numbers: %d\n", result);
        return 0;
    }
    else if(op == 3)
    {
        result = a * b;
        printf("Multiplication of two numbers: %d\n", result);
        return 2;
    }
    else if(op == 4)
    {
    if(b == 0)
        {
            printf("Cannot divide by zero\n");
            return 5;
        }
    result = a / b;
    printf("Division of two numbers: %d\n", result);
    return 3;
    }
    else if(op == 5)
    {
    if(b == 0)
        {
            printf("Cannot modulo by zero\n");
            return 5;
        }
    result = a % b;
    printf("Modulo of two numbers: %d\n", result);
    return 4;
    }
    else
    {
        printf("Invalid operator\n");
        return 5;
    }
}
