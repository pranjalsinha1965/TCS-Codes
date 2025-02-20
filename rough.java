public class rough{
    public static void insert(int[] arr)
    {
        int n = arr.length;
        for(int i=1 ; i<n; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {12, 11, 13, 5, 6};
        insert(arr);
        System.out.println("sorted arr: ");
        for(int i : arr)
        {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}