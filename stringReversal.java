import java.util.Scanner;
public class stringReversal {
    static String value(String str)
    {
        String reversed_string = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reversed_string += str.charAt(i);
        }
        return reversed_string;
    }
    static String valueMethods(String strTwo)
    {
        StringBuilder reversed_string_two = new StringBuilder(strTwo);
        return reversed_string_two.reverse().toString();
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String input = scanner.nextLine();
        System.out.println("Your original String is: " + input);
        System.out.println("After reversing the string using firstmethod");
        System.out.println("Your reversed string is: " + value(input));
        System.out.println("After reversing the string using the second method");
        System.out.println("Your reversed string is: " + valueMethods(input));
        scanner.close();
    }
}

