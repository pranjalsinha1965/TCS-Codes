public class AddingFractions {
    static int _gcd(int a, int b) {
        if (b == 0)
            return a; // Corrected base case
        return _gcd(b, a % b);
    }
    // Modified to return simplified numerator and denominator
    static int[] simple(int num3, int den3) {
        int gcd = _gcd(num3, den3);
        num3 /= gcd;
        den3 /= gcd;
        return new int[]{num3, den3};
    }
    public static void main(String args[]) {
        int num1 = 3, den1 = 4, num2 = 1, den2 = 7, num3, den3;
        // Find LCM of denominators
        int lcm = (den1 * den2) / _gcd(den1, den2);
        den3 = lcm;
        // Adjust numerators accordingly
        num3 = num1 * (den3 / den1) + num2 * (den3 / den2);
        // Simplify the result
        int[] simplified = simple(num3, den3);
        num3 = simplified[0];
        den3 = simplified[1];
        System.out.println(num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + num3 + "/" + den3);
    }
}
