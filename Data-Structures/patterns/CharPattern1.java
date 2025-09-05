package patterns;
import java.util.Scanner;

public class CharPattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print('A' + " ");  // keep chars in the same row
                j++;
            }
            System.out.println();  // move to next line after each row
            i++;
        }

        s.close();
    }
}
