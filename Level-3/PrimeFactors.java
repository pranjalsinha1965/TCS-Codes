import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    static boolean checkPrime(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt = cnt + 1;
                if (n / i != i) {
                    cnt = cnt + 1;
                }
            }
        }
        if (cnt == 2) {
            return true;
        }
        else {
            return false;
        }
    }
    static List<Integer> getPrimeFactors(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (checkPrime(i)) {
                    primeFactors.add(i);
                }
            }
        }
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