public class FirstNsum{

  public static void main(String[] args) {

    solve(5);
    solve(6);
  }
  public static void solve(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println("The sum of the first " + n + " numbers is: " + sum);
  }
} 

// import java.util.ArrayList;

// public class rough{
//     public static int sum(int n)
//     {
//         int sum = 0;
//         ArrayList<Integer> arr = new ArrayList<>();
//         for(int i=0; i<n; i++)
//         {
//             arr.add(i+1);
//         }
//         for(int i=0; i<arr.size(); i++)
//         {
//             sum = arr.get(i);
//         }
//         return sum;
//     }
//     public static void main(String args[])
//     {
//         System.out.println(sum(5));
//     }
// }