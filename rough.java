public class rough {
    static boolean isPerfect(int n)
    {
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            if(n % i == 0)
            sum = sum + i;
        }
        if(sum == n)
        return true;
        else return false;
    }
    public static void main(String[] args)
    {
        boolean ex1 = isPerfect(6);
        boolean ex2 = isPerfect(15);
        boolean ex3 = isPerfect(28);
        if(ex1 == true)
        {
            System.out.println("6 is a perfect number");
        }
        else System.out.println("6 is not a perfect number");
        if(ex2 == true)
        {
            System.out.println("15 is a perfect number");
        }
        else System.out.println("15 is not a perfect number");
        if(ex3 == true)
        {
            System.out.println("28 is a perfect number");
        }
        else System.out.println("28 is not a perfect number");
    }
}