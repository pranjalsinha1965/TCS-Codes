#include <stdio.h>
#include <string.h>

void properCompression(const char *s, char *result) {
    int freq[256] = {0};
    for(int i=0; s[i] != '\0'; i += 2){
        char c = s[i];
        int count = s[i + 1] - '0';
        freq[c] += count;
    }
    int index = 0;
    for(char c = 'a'; c <= 'z'; c++){
        if(freq[c] > 0){
            result[index++] = c;
        }
    }
    result[index] = '\0';
}

int main(){
    char inputStr[] = "a3b5c2a2";
    char compressionResult[100];
    properCompression(inputStr, compressionResult);
    printf("%s\n", compressionResult);
    return 0;
}