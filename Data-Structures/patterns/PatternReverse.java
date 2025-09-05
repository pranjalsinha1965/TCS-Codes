package patterns;
import java.util.Scanner;

public class PatternReverse {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i <= n)
        {
            int j = 1;
            while(j <= n - i)
            {
                System.out.println(" ");
                j++;
            }
            j = 1;
            while(j <= i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        s.close();
    }
}
