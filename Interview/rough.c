#include <stdio.h>
#include <string.h>

int main()
{
    char string[100];
    char reversedString[100]; // Correctly define an array for the reversed string

    printf("Enter your name: ");
    // Use %s to read a string, not %c
    scanf("%s", string);

    int length = strlen(string);
    for (int i = 0; i < length; i++)
    {
        reversedString[i] = string[length - i - 1]; // Reverse logic
    }
    reversedString[length] = '\0'; // Null terminate the reversed string

    printf("Original string is: %s\n", string);
    printf("The reversed string is: %s\n", reversedString);

    return 0;
}
