public class rough{
    static private void MinMax(int n)
    {
        int d;
        int mini = Integer.MIN_VALUE;
        int maxi = Integer.MAX_VALUE;
        while (n != 0)
        {
            d = n % 10;
            mini = Math.min(mini, d);
            maxi = Math.max(maxi, d);
            n = n / 10;
        }
        System.out.println("The minimum number is: " + mini);
        System.out.println("The maximum number is: " + maxi);
    }
    public static void main(String[] args)
    {
        int n = 4726;
        MinMax(n);
    }
}