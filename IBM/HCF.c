#include <stdio.h>
int main() {
    int m, n;
    scanf("%d %d", &m, &n);
    while (m != n) {
        if (m > n) {
            m = m  - n;
        } else {
            n = n - m;
        }
    }
    printf("%d\n", m);
    return 0;
}