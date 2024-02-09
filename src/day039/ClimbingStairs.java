package day039;

/**
 * 70. Climbing Stairs
 *
 * @author created by sunjy on 2/8/24
 */
public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(1));
    }

}
