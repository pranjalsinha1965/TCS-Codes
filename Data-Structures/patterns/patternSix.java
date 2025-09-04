package patterns;
import java.util.Scanner;

// Skeleton 
public class patternSix {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();  // input size
        int i = 1;
        while (i <= n)
        {
            int j = 1;
            while (j <= i)
            {
                System.out.print("* ");  // print * without moving to next line
                j += 1;
            }
            System.out.println();  // move to next line after finishing one row
            i += 1;
        }
        s.close();
    }    
}
