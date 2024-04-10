package day051_day100.day066;

/**
 * 231. Power of Two
 *
 * @author created by sunjy on 3/6/24
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }

}
