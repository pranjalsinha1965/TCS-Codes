package Arrays;
import java.util.Scanner;
public class LargestOfNumbers {
    public static int[] takeInput()
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter elements at " + i + "th index: ");
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }
    public static int largest(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int[] arr = takeInput();
        int lar = largest(arr);
        System.out.println(lar);
    }
}
