package String;
class AlphabeticNumerics {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        char maxChar = ' '; 
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z')) {
                if (currentChar > maxChar) {
                    maxChar = currentChar;
                }
            }
        }
        System.out.println("Highest alphabetic character: " + maxChar);
    }
}
        