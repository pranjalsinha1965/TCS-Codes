#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>
void mergeSort(int A[], int lb, int up);
void merge(int A[], int lb, int mid, int up);
void toyManufacturer();
void eCommerceGroup();
void bookSaleGroup();
void kthShortestExecution();
void bankTransactionDebitCard();
int isVowel(char c);
int countVowelToConsonant(char str[]);
int main() {
    int choice;
    while (1) {
        printf("\n--- MENU ---\n");
        printf("1. Toy Manufacturer (Kth Smallest Element)\n");
        printf("2. E-Commerce Discount Group\n");
        printf("3. Book Sale Group\n");
        printf("4. Kth Shortest Execution Time\n");
        printf("5. Bank Transaction (Vowel to Consonant Count)\n");
        printf("6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1: toyManufacturer(); break;
            case 2: eCommerceGroup(); break;
            case 3: bookSaleGroup(); break;
            case 4: kthShortestExecution(); break;
            case 5: bankTransactionDebitCard(); break;
            case 6: exit(0); break;
            default: printf("Invalid choice, please try again.\n");
        }
    }
    return 0;
}
void toyManufacturer() {
    int n, m;
    printf("Enter the number of elements and the kth position: ");
    scanf("%d %d", &n, &m);
    int arr[n];
    printf("Enter the elements:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    mergeSort(arr, 0, n - 1);
    printf("The %d-th smallest element is: %d\n", m, arr[m - 1]);
}
void mergeSort(int A[], int lb, int up) {
    if (lb < up) {
        int mid = (lb + up) / 2;
        mergeSort(A, lb, mid);
        mergeSort(A, mid + 1, up);
        merge(A, lb, mid, up);
    }
}
void merge(int A[], int lb, int mid, int up) {
    int i = lb, j = mid + 1, k = lb;
    int b[up + 1];
    while (i <= mid && j <= up) {
        if (A[i] <= A[j]) b[k++] = A[i++];
        else b[k++] = A[j++];
    }
    while (i <= mid) b[k++] = A[i++];
    while (j <= up) b[k++] = A[j++];
    for (i = lb; i <= up; i++) A[i] = b[i];
}
void eCommerceGroup() {
    int n;
    printf("Enter the discount percentage: ");
    scanf("%d", &n);
    if (n >= 30 && n <= 50) printf("Group D\n");
    else if (n >= 51 && n <= 60) printf("Group C\n");
    else if (n >= 61 && n <= 80) printf("Group B\n");
    else if (n >= 81 && n <= 100) printf("Group A\n");
    else printf("Invalid input.\n");
}
void bookSaleGroup() {
    int no;
    printf("Enter the book sale count: ");
    scanf("%d", &no);
    if (no >= 81 && no <= 100) printf("Group A\n");
    else if (no >= 61 && no <= 80) printf("Group B\n");
    else if (no >= 51 && no <= 60) printf("Group C\n");
    else if (no >= 31 && no <= 50) printf("Group D\n");
    else printf("Invalid input.\n");
}
void kthShortestExecution() {
    int n, k, temp;
    printf("Enter the number of elements and the kth position: ");
    scanf("%d %d", &n, &k);
    int a[n];
    printf("Enter the elements:\n");
    for (int i = 0; i < n; i++) scanf("%d", &a[i]);
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (a[i] > a[j]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    printf("The %d-th shortest execution time is: %d\n", k, a[k - 1]);
}
void bankTransactionDebitCard() {
    char str[100];
    printf("Enter the transaction string: ");
    scanf("%s", str);
    printf("Vowel to consonant transitions: %d\n", countVowelToConsonant(str));
}

int isVowel(char c) {
    c = tolower(c);
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
}

int countVowelToConsonant(char str[]) {
    int count = 0;
    for (int i = 1; i < strlen(str); i++) {
        if (!isVowel(str[i]) && isVowel(str[i - 1])) count++;
    }
    return count;
}
