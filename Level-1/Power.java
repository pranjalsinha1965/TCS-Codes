public class Power {
        public static void main(String[] args) {
            int x = 5, n = 3;
            int ans = 1;
            for (int i = 0; i < n; i++) {
                ans = ans * x;
            }
            System.out.println(x + " raised to the power " + n + " is " + ans);
        }
    }