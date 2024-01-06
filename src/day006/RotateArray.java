package day006;

import java.util.Arrays;

/**
 * 189. Rotate Array
 *
 * @author created by sunjy on 1/6/24
 */
public class RotateArray {

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[nums.length];
        for (int i = 0, left = nums.length - k, right = 0; i < nums.length; i++, left++) {
            if (i < k) {
                temp[i] = nums[left];
            } else {
                temp[i] = nums[right];
                ++right;
            }
        }
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }

    // time exceeded
//    public static void rotate(int[] nums, int k) {
//        int count = 0;
//        int length = nums.length;
//        while (count < k) {
//            int temp = nums[length - 1];
//            for (int i = length - 1; i > 0; i--) {
//                nums[i] = nums[i - 1];
//            }
//            nums[0] = temp;
//            ++count;
//        }
//    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int k = 5;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

}
