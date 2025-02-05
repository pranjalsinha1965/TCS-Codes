#include <stdio.h>
void findOriginalValues(int pref[], int n, int arr[]){
    arr[0] = pref[0];
    for(int i=1; i<n; i++)
    {
        arr[i] = pref[i] ^ pref[i - 1];
    }
}

int main(){
    int pref[] = {3, 5, 2, 10};
    int n = sizeof(pref) / sizeof(pref[0]);
    int originalArray[4];
    findOriginalArray(pref, n, originalArray);
    printf("original array: ");
    for(int i=0; i<n; i++)
    {
        printf("%d", originalArray[i]);
    }
    printf("\n");
    return 0;
}