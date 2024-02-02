package day032;

/**
 * 278. First Bad Version
 *
 * @author created by sunjy on 2/1/24
 */
public class FirstBadVersion {

    private static int bad = 4;

    public static boolean isBadVersion(int version) {
        return version >= bad;
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
        ;
    }
}
