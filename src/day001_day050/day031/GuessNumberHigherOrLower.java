package day001_day050.day031;

/**
 * 374. Guess Number Higher or Lower
 *
 * @author created by sunjy on 1/31/24
 */
public class GuessNumberHigherOrLower {

    public static int pick = 3;

    public static int guess(int num) {
        return Integer.compare(pick, num);
    }

    public static int guessNumber(int n) {
        int left = 0;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);
            if (result < 0) {
                right = mid - 1;
            } else if (result > 0) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(6));
    }
}
