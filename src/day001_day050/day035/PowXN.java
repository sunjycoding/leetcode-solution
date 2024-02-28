package day001_day050.day035;

/**
 * 50. Pow(x, n)
 *
 * @author created by sunjy on 2/4/24
 */
public class PowXN {

    public static double myPow(double x, int n) {
        long newN = n;
        if (newN < 0) {
            x = 1 / x;
            newN = -newN;
        }
        double ans = 1;
        double currentProduct = x;
        for (long i = newN; i > 0; i /= 2) {
            if ((i % 2) == 1) {
                ans = ans * currentProduct;
            }
            currentProduct = currentProduct * currentProduct;
        }
        return ans;
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        System.out.println(myPow(x, n));
    }
}
