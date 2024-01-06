package day005;

import java.util.Arrays;

/**
 * 27. Remove Element
 *
 * @author created by sunjy on 1/5/24
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(nums, 2));
        System.out.println("nums: " + Arrays.toString(nums));
    }

}
