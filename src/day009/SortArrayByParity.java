package day009;

import java.util.Arrays;

/**
 * 905. Sort Array By Parity
 *
 * @author created by sunjy on 1/9/24
 */
public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] % 2 == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0, 1, 2})));
    }
}
