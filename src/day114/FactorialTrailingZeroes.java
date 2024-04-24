package day114;

/**
 * 172. Factorial Trailing Zeroes
 *
 * @author created by sunjy on 4/23/24
 */
public class FactorialTrailingZeroes {

    public static int trailingZeroes(int n) {
        int count = 0;
        for (long i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));
    }

}
