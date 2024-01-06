package day006;

import java.util.Arrays;

/**
 * 283. Move Zeroes
 *
 * @author created by sunjy on 1/6/24
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int count = 0;
        int check = 0;
        while (count < nums.length) {
            if (nums[check] == 0) {
                offset(nums, check, nums.length - 1);
            } else {
                check++;
            }
            count++;
        }
    }

    public static void offset(int[] nums, int start, int end) {
        int temp = nums[start];
        for (int i = start + 1; i <= end; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
