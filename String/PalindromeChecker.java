package String;
public class PalindromeChecker {
    static boolean palindrome(int i, String s)
    {
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return palindrome(i+1, s);
    }
    public static void main(String[] args)
    {
        String s = "madam";
        System.out.println(palindrome(0, s));
    }
}

// public class PalindromeChecker {

//     public static boolean isPalindrome(int i, String s) {
//         if (i >= s.length() / 2) return true;
//         if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
//         return isPalindrome(i + 1, s);
//     }

//     public static void main(String[] args) {
//         String s = "madam";
//         boolean result = isPalindrome(0, s);
//         System.out.println("Is the string '" + s + "' a palindrome? " + result);
//     }
// }

