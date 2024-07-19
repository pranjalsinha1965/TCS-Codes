import java.util.Arrays;

public class tuf {
    public static void main(String[] args) {
        // Frequency counting in an array
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr, n);
        
        // Finding smallest and largest elements in arrays
        int arr1[] = {2, 5, 1, 3, 0};
        System.out.println("The smallest element in arr1 is: " + findSmallestElement(arr1));
        System.out.println("The largest element in arr1 is: " + findLargestElement(arr1));
        
        int arr2[] = {8, 10, 5, 7, 9};
        System.out.println("The smallest element in arr2 is: " + findSmallestElement(arr2));
        System.out.println("The largest element in arr2 is: " + findLargestElement(arr2));
    }

    // Function to find and return the smallest element in an array
    static int findSmallestElement(int arr[]) {
        Arrays.sort(arr);
        return arr[0];
    }

    // Function to find and return the largest element in an array
    static int findLargestElement(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Function to count the frequency of each element in an array
    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
