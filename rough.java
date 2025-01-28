public class rough {
    public static void main(String[] args){
        String str = "Hello";
        StringBuilder str1 = new StringBuilder(str); 
        str1.reverse();
        str = str1.toString(); 
        System.out.println("The reversed string is: " + str); 
    }
}