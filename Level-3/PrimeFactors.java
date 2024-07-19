import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    // Function to check if a
    // given number is prime.
    static boolean checkPrime(int n) {
        // Initialize a counter variable to
        // count the number of factors.
        int cnt = 0;

        // Loop through numbers from 1
        // to the square root of n.
        for (int i = 1; i <= Math.sqrt(n); i++) {
            // If n is divisible by i
            // without any remainder.
            if (n % i == 0) {
                // Increment the counter.
                cnt = cnt + 1;

                // If n is not a perfect square,
                // count its reciprocal factor.
                if (n / i != i) {
                    cnt = cnt + 1;
                }
            }
        }

        // If the number of
        // factors is exactly 2.
        if (cnt == 2) {
            // Return true, indicating
            // that the number is prime.
            return true;
        }
        // If the number of
        // factors is not 2.
        else {
            // Return false, indicating
            // that the number is not prime.
            return false;
        }
    }

    // Function to return a list of
    // prime factors of input 'n'
    static List<Integer> getPrimeFactors(int n) {
        // Declare a list to store
        // the prime factors of n.
        List<Integer> primeFactors = new ArrayList<>();

        // Start a loop from 2 to n,
        // iterating through each number i.
        for (int i = 2; i <= n; i++) {
            // Check if n is divisible by
            // i without any remainder.
            if (n % i == 0) {
                // If it is, call the
                // function checkPrime to
                // determine if i is prime.
                if (checkPrime(i)) {
                    // If i is prime, add it
                    // to the list of prime factors.
                    primeFactors.add(i);
                }
            }
        }
        // Return the list
        // containing the prime factors of n.
        return primeFactors;
    }

    public static void main(String[] args) {
        int n = 60;
        List<Integer> ans = getPrimeFactors(n);
        System.out.print("Prime Factors for " + n + ": ");
        for (int factor : ans) {
            System.out.print(factor + " ");
        }
        System.out.println();
    }
}