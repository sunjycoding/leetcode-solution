package day035;

/**
 * 367. Valid Perfect Square
 *
 * @author created by sunjy on 2/4/24
 */
public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long left = 2;
        long right = num / 2;
        long mid;
        long squared;
        while (left <= right) {
            mid = left + (right - left) / 2;
            squared = mid * mid;

            if (squared == num) {
                return true;
            } else if (squared < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}
