package patterns;
import java.util.Scanner;

public class patternSeven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();   // number of rows
        int i = 1;
        int counter = 1; 

        while (i <= n) {
            int j = 1;
            while (j <= i) {   // fix: should run `i` times
                System.out.print(counter);  // print in same row
                counter++;
                j++;
            }
            System.out.println();  // move to next line after row
            i++;
        }

        s.close();
    }
}
