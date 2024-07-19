import java.util.Arrays;

class TestMedian {
    // Function to get the median of an array
    static private void getMedian(int[] arr, int n) {
        Arrays.sort(arr); // Sort the array
        
        // Check if the length of the array is even or odd
        if (n % 2 == 0) {
            int ind1 = (n / 2) - 1;
            int ind2 = (n / 2);
            System.out.print((double) (arr[ind1] + arr[ind2]) / 2);
        } else {
            System.out.print(arr[(n / 2)]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 2, 5, 6};
        int n = arr.length; // Use arr.length to get the length of the array
        System.out.print("The median of the array is: ");
        getMedian(arr, n);
    }
}
