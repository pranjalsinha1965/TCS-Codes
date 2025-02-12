public class rough{
    static String solve(String input)
    {
        StringBuilder answer = new StringBuilder("");
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) != '(' && input.charAt(i) != ')')
            answer.append(input.charAt(i));
        }
        return answer.toString();
    }
    public static void main(String[] args)
    {
        String firstInput = "a+((b-c)+d)";
        String secondInput = "(((a-b))+c)";
        System.out.println("original string : " + firstInput);
        System.out.println("after removing brackets: " + solve(firstInput));
        System.out.println("Original string: " + firstInput);
        System.out.println("After removing brackets " + solve(secondInput));
    }
}