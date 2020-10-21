/**
 * Class with math functions
 * @author Ilya Nemolyaev
 * @version 1.0
 */
public class MagicMath {

    /**
     * Calculate fact of number
     * @param n input number
     * @return fact of input number
     */
    public static int fact(int n) {
        int result = 2;
        for (int i = 3; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    /**
     * Calculate abs of number
     * @param i input number
     * @return abs of input number
     */
    public static int abs(int i) {
        if (i < 0) {
            i *= -1;
        }

        return i;
    }

    /**
     * Calculate pow of number
     * Only for positive power values
     * @param n input number
     * @param e power for number
     * @return number in power
     */
    public static int pow(int n, int e) {
        int baseNumber = n;
        for (int i = 1; i < e; i++) {
            n *= baseNumber;
        }
        return n;
    }

    public static void main(String[] arg) {
        System.out.println(fact(5));
        System.out.println(abs(-4));
        System.out.println(pow(5, 3));
    }
}
