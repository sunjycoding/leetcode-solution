package day007;

import java.util.Arrays;

/**
 * 977. Squares of a Sorted Array
 *
 * @author created by sunjy on 1/7/24
 */
public class SquaresSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int left = 0;
        int right = length - 1;
        for (int i = length - 1; i >= 0; i--) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (rightSquare >= leftSquare) {
                result[i] = rightSquare;
                right--;
            } else {
                result[i] = leftSquare;
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

}
