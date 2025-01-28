public class factorial {
    static int factorial(int X) {
       int ans = 1;
       for (int i = 1; i <= X; i++) {
          ans = ans * i;
       }
       return ans;
    }
    public static void main(String[] args) {
 
       int X = 5;
       int result = factorial(X);
       System.out.println("The factorial of " + X + " is " + result);
    }
 }      

//  public class FactorialCalculator {

//    public static int factorial(int x) {
//        if (x == 0 || x == 1) return 1;
//        return x * factorial(x - 1);
//    }

//    public static void main(String[] args) {
//        int x = 5;
//        int result = factorial(x);
//        System.out.println("The factorial of " + x + " is " + result);
//    }
// }
// `