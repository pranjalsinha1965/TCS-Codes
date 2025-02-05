#include <stdio.h>
int main(){
    int n;
    printf("Enter the number to convert: ");
    scanf("%d", &n);
    int binary[32], i = 0;
    while(n > 0){
        binary[i] = n % 2;
        n = n / 2;
        i++;
    }
    printf("Binary of the given number: ");
    for(i = i - 1; i >= 0; i--){
        printf("%d", binary[i]);
    }
    return 0;
}