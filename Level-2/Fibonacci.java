import java.util.Arrays;
import java.util.Scanner;
public class Fibonacci {
    public static void printFibonacciIterative(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci series using iteration:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;    
        }
        System.out.println();
    }
    // Corrected dynamic programming method for Fibonacci series
    public static int[] generateFibonacciDP(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the nth term of Fibonacci series: ");
        int n = scanner.nextInt();
        printFibonacciIterative(n);
        System.out.println("Fibonacci series up to n:");
        int[] fibSeries = generateFibonacciDP(n);
        System.out.println(Arrays.toString(fibSeries));
        scanner.close();
    }
}
