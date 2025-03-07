public class Solution {

  static void duplicate(int arr[], int n) {

    int mark[] = new int[n];

    for (int i = 0; i < n; i++) {
      mark[i] = 1;
    }

    for (int i = 0; i < n; i++) {
      if (mark[i] == 1) {
        for (int j = i + 1; j < n; j++) {
          if (arr[i] == arr[j]) {
            mark[j] = 0;
          }
        }
      }
    }

    for (int i = 0; i < n; i++) {
      if (mark[i] == 1) {
        System.out.print(arr[i] + ",");
      }
    }
  }

  public static void main(String[] args) {
    int n = 9;
    int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };

    duplicate(arr, n);
  }
}