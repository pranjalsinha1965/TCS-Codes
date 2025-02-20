package SortingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class QuickSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 7, 9, 1, 3));
        System.out.println("Before Quick Sort: " + arr);
        quickSort(arr, 0, arr.size() - 1);
        System.out.println("After Quick Sort: " + arr);
    }
    public static void quickSort(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    private static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(high), i = low;
        for (int j = low; j < high; j++) {
            if (arr.get(j) < pivot) {
                swap(arr, i++, j);
            }
        }
        swap(arr, i, high);
        return i;
    }
    private static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
