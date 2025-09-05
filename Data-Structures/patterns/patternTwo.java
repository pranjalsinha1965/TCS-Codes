package patterns;
import java.util.Scanner;
public class patternTwo {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();  // input size
        int i = 1;
        
        while (i <= n)
        {
            int j = 1;
            while (j <= n)
            {
                System.out.print(i);  // print * without moving to next line
                j += 1;
            }
            System.out.println();  // move to next line after finishing one row
            i += 1;
        }
        s.close();
    }    
}
