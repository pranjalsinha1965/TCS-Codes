public class PositiveOrNegative {

  public static void main(String[] args) {

    int n = 5;
    check(n);
    n = -6;
    check(n);
  }
  public static void check(int n) {
    if (n > 0) {
      System.out.println(n + " is positive.");
    } else {
      System.out.println(n + " is negative.");
    }
  }
}



