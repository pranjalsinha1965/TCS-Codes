package String;
import java.util.Stack;
public class ReverseString {
    // Driver code
    public static void main(String[] args) {
        String str = "HELLO";
        
        // Create a character array to hold the reversed characters
        char[] reverseString = new char[str.length()];
        // Create a stack to hold characters
        Stack<Character> stack = new Stack<Character>();
  
        // Push characters of the string onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
  
        // Pop characters from the stack and place them in the reverseString array
        int i = 0;
        while (!stack.isEmpty()) { 
            reverseString[i++] = stack.pop();
        }
        // Create a new string from the reversed character array
        str = new String(reverseString);
        
        // Print the reversed string
        System.out.print("The reversed string is- " + str);
    }
}

// for shortcut refer this message

// import java.util.*;
 
// class takeuforward {
//     public static void main(String[] args)
//     {
//         String str = "HELLO";
 
//         StringBuilder str1 = new StringBuilder(str);
//         str1.reverse();
        
//          str=str1.toString();
 
//         // print reversed String
//         System.out.println("The reversed string is- "+str);
//     }
// }

// public class StringReversal {
//     public static void main(String[] args) {
//         String str = "Hello";
//         StringBuilder str1 = new StringBuilder(str);
//         str1.reverse();
//         System.out.println("The reversed string is: " + str1);
//     }
// }
