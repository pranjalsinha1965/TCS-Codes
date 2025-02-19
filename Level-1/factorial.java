public class factorial {
   static int isFactorial(int X) {
       if (X < 0) {
           throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
       }
       if (X == 0 || X == 1) {
           return 1;
       }
       return X * isFactorial(X - 1); // Recursive approach
   }

   public static void main(String[] args) {
       int X = 5;
       int result = isFactorial(X);
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
// 