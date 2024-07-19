import java.util.Arrays;

public class Main {

    // Function to print array
    static void printArray(int ans[], int n) {
        System.out.print("Array is: \n");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    // Function to reverse an array
    public static void reverseArray(int[] arr, int n) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to swap elements within a range
    public static void swap(int[] arr, int a, int b, int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr[a + i];
            arr[a + i] = arr[b + i];
            arr[b + i] = temp;
        }
    }

    // Function for block swapping
    public static void BlockSwap(int[] arr, int start, int k, int n) {
        if (k == 0 || k == n) {
            return;
        }

        if (k == n - k) {
            swap(arr, start, start + n - k, k);
            return;
        }

        if (k < n - k) {
            swap(arr, start, start + n - k, k);
            BlockSwap(arr, start, k, n - k);
        } else {
            swap(arr, start, start + k, n - k);
            BlockSwap(arr, start + n - k, 2 * k - n, k);
        }
    }

    public static void main(String[] args) {
        // Reverse an array
        int n = 5;
        int arr[] = {5, 4, 3, 2, 1};
        reverseArray(arr, n);
        printArray(arr, n);

        // Partially sort and reverse a sorted array
        int arr1[] = {8, 7, 1, 6, 5, 9};
        int n2 = arr1.length;
        Arrays.sort(arr1);
        System.out.print("Partially sorted and reversed array is: \n");
        for (int i = 0; i < n2 / 2; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = n2 - 1; i >= n2 / 2; i--) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Calculate sum and perform block swap
        int n3 = 5;
        int arr3[] = {1, 2, 3, 4, 5};
        int[] arr4 = {1, 2, 3, 5, 6, 7, 8};
        int n4 = arr4.length;
        int k4 = 2;
        int sum = 0;

        BlockSwap(arr4, 0, k4, n4);
        System.out.println("After Rotating the array ");
        printArray(arr4, n4);

        for (int i = 0; i < n3; i++) {
            sum += arr3[i];
        }
        System.out.println("The sum of the elements of the array is " + sum);
    }
}
