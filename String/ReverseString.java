package String;
import java.util.Stack;
public class ReverseString {
    // Driver code
    public static void main(String[] args) {
        String str = "HELLO";
        char[] reverseString = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        } 
        int i = 0;
        while (!stack.isEmpty()) { 
            reverseString[i++] = stack.pop();
        }
        str = new String(reverseString);
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

// public class ReverseString {
//     public static void main(String[] args) {
//         String str = "Hello";
//         String reversed = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversed += str.charAt(i);
//         }
//         System.out.println("Reversed (Appending): " + reversed);
//     }
// }

// public class ReverseString {
//     public static void main(String[] args) {
//         String str = "Hello";
//         StringBuilder sb = new StringBuilder(str);
//         String reversed = sb.reverse().toString();
//         System.out.println("Reversed (StringBuilder): " + reversed);
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
