package day101_day150.day109;

import java.util.Arrays;

/**
 * 338. Counting Bits
 *
 * @author created by sunjy on 4/18/24
 */
public class CountingBits {

    public static int[] countBits(int n) {
        // Base case: the number of 1's in the binary representation of 0 is 0.
        int[] ans = new int[n + 1];
        ans[0] = 0;

        for (int i = 1; i <= n; i++) {
            // If i is even, then it has the same number of 1's as i/2 because the last digit is 0.
            // If i is odd, then it has one more 1 than i - 1 because the last digit is 1.
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(countBits(n)));
    }

}
