import java.util.Scanner;
public class problemFour{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        a = a + b; 
        b = a - b; 
        a = a - b; 
        System.out.println("After the swap: ");
        System.out.println("a becomes: " + a);
        System.out.println("b becomes: " + b);
        scanner.close();
        
    }
}