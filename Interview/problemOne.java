package Interview;
import java.util.Scanner;

public class problemOne {
    // Efficient method using StringBuilder
    static String reverseUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // More efficient loop method using StringBuilder
    static String reverseUsingLoop(String str) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String inputString = scanner.nextLine();

        System.out.println("\n|---------------------X--------------------|");
        System.out.println(" String reversal using StringBuilder method");
        System.out.println("|---------------------X--------------------|");
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reverseUsingStringBuilder(inputString));

        System.out.println("\n|---------------------X-----------------|");
        System.out.println(" String reversal using loop method");
        System.out.println("|---------------------X-----------------|");
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reverseUsingLoop(inputString));

        scanner.close();
    }
}
