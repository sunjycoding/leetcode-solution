package day101_day150.day114;

/**
 * 1137. N-th Tribonacci Number
 *
 * @author created by sunjy on 4/23/24
 */
public class NthTribonacciNumber {

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 2 || n == 1) {
            return 1;
        }
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int tn = t0 + t1 + t2;
        for (int i = 3; i < n; i++) {
            t0 = t1;
            t1 = t2;
            t2 = tn;
            tn = t0 + t1 + t2;
        }
        return tn;
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }
}
