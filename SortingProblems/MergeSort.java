package SortingProblems;
import java.util.Arrays;
public class MergeSort {
    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1]; 
        int left = low, right = mid + 1, k = 0;
        while (left <= mid && right <= high) {
            temp[k++] = (arr[left] <= arr[right]) ? arr[left++] : arr[right++];
        }
        while (left <= mid) temp[k++] = arr[left++];
        while (right <= high) temp[k++] = arr[right++];
        System.arraycopy(temp, 0, arr, low, temp.length);
    }
    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
