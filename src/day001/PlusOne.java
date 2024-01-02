package day001;

import java.util.Arrays;

/**
 * @author created by sunjy on 1/1/24
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
    }

}
