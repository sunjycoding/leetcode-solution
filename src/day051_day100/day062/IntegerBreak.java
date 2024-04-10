package day051_day100.day062;

/**
 * 343. Integer Break
 *
 * @author created by sunjy on 3/2/24
 */
public class IntegerBreak {

    public static int integerBreak(int n) {
        if (n < 4) {
            return n - 1;
        }

        int product = 1;
        while (n > 4) {
            product *= 3;
            n -= 3;
        }

        return product * n;
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }

}
