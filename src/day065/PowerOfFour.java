package day065;

/**
 * 342. Power of Four
 *
 * @author created by sunjy on 3/5/24
 */
public class PowerOfFour {

    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }
        return true;
    }

}
