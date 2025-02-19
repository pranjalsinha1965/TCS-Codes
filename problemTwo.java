import java.util.PriorityQueue;
import java.util.Scanner;

public class problemTwo{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n|-------------X------------|");
        System.out.println("Enter the number of elements: ");
        System.out.println("|-------------X------------|");
        int n = sc.nextInt();
        System.out.println("\n|-------------X------------|");
        System.out.println("Enter the value of k:");
        System.out.println("|-------------X------------|");
        int k = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        System.out.println("\n|-------------X------------|");
        System.out.println("Enter the elements: ");
        System.out.println("|-------------X------------|");
        for(int i=0; i<n; i++)
        {
            int num = sc.nextInt();
            minHeap.offer(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        System.out.println("\n|-------------X------------|");
        System.out.println("The " + k + "th largest element is: " + minHeap.peek());
        System.out.println("|-------------X------------|");
        sc.close();
    }
}