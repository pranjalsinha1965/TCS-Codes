// {10,9,14,8,20,48,16,9,0} insert the 40 at the beginning only. 
// Using DP create Fibonacci series upto 5th term.Please make one iterative solution to print and then generate it using DP using.
// Find the highest alphabetic character in the given string. 
// Print the returned ASCII value character. 
// Provide a palindrome checker function using driver code.  
// Make a java function to remove brackets. 
// Remove special characters from the given string 
// "a+((b-c)+d)"
// "(((a-b))+c)"
// "take12% *&u ^$#forward" Remove special characters from the string "take12% *&u ^$#forward

// import java.util.Stack;
// public class rough {
//     public static void main(String args[])
//     {
//         String str = "HELLO";
//         char[] reverseString = new char[str.length()];
//         Stack<Character> stack = new Stack<Character>();
//         for(int i=0; i<str.length(); i++)
//         {
//             stack.push(str.charAt(i));
//         }
//         int i=0;
//         while(!stack.isEmpty())
//         {
//             reverseString[i++] = stack.pop();
//         }
//         str = new String(reverseString);
//         System.out.println("The reversed string is: " + str);
//     }
// }

// public class ReverseString {
//     public static void main(String[] args) {
//         String str = "Hello";
//         char[] charArray = str.toCharArray();
//         for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
//             char temp = charArray[i];
//             charArray[i] = charArray[j];
//             charArray[j] = temp;
//         }
//         String reversed = new String(charArray);
//         System.out.println("Reversed (For Loop): " + reversed);
//     }
// }

// Merge Sort: [12, 11, 13, 5, 6, 7]
// Insertion Sort: [12, 11, 13, 5, 6]
// Quick Sort: [4, 6, 2, 5, 7, 9, 1, 3]

import java.util.Stack;
import java.util.Scanner;

public class rough{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = scanner.nextLine();
        String reversedString = reverse(str);
        System.out.println("The reversed string is: " + reversedString);
        scanner.close();
    }
    public static String reverse(String str)
    {
        char[] reversed = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<str.length(); i++)
        {
            stack.push(str.charAt(i));
        }
        int i=0;
        while(!stack.isEmpty())
        {
            reversed[i++] = stack.pop();
        }
        return new String(reversed);
    }
}

