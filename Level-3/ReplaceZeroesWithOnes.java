public class ReplaceZeroesWithOnes {
    static int replaceZeroesWithOnes(int num) {
        if (num == 0) {
            return 1;
        }
        int ans = 0, tmp = 1;
        while (num > 0) {
            int d = num % 10;
            if (d == 0) {
                d = 1;
            }
            ans = d * tmp + ans;
            num = num / 10;
            tmp = tmp * 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 204;
        int result = replaceZeroesWithOnes(n);
        System.out.println("After replacing zeroes with ones, " + n + " becomes " + result);
    }
}
