public class rough {
    static int removespaces(char[] str) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != ' ') {
                str[count] = str[i];
                count++;
            }
        }
        return count;  // Moved outside the loop
    }

    public static void main(String[] args) {
        char[] str = "Take you forward".toCharArray();
        int count = removespaces(str);  // Fixed method call (case-sensitive)
        System.out.println(String.valueOf(str).substring(0, count));
    }
}
