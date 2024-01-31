package day030;

/**
 * 69. Sqrt(x)
 *
 * @author created by sunjy on 1/30/24
 */
public class SqrtX {

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
            } else if (mid > x / mid) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return (left - 1);
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }

}
