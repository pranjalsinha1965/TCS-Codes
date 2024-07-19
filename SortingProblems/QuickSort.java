package SortingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 7, 9, 1, 3));
        int n = arr.size();

        System.out.println("Before Using Quick Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        QuickSort.quickSort(arr, 0, n - 1);

        System.out.println("After Quick Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void quickSort(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            if (arr.get(j) < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        // swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }
}
