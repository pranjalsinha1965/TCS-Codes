package DSA.src.side;

public class Recursion {

    public static void main(String[] args) {

        int result = fact(10);
        System.out.println(result);

        // f1(5);  // Uncomment to test printing recursion
    }

    // Factorial using recursion
    public static int fact(int i) {
        if (i == 0)
            return 1;

        return i * fact(i - 1);
    }

    // Print numbers using recursion
    public static void f1(int i) {
        if (i < 0)
            return;

        System.out.println(i);
        f1(i - 1);
    }
}
