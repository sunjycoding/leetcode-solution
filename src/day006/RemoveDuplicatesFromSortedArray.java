package day006;

/**
 * 26. Remove Duplicates from Sorted Array
 *
 * @author created by sunjy on 1/6/24
 */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int result = nums.length;
        int count = 0;
        int check = 0;
        while (count < nums.length - 1) {
            if (nums[check + 1] == nums[check]) {
                offset(nums, check + 1, nums.length - 1);
                --result;
            } else {
                check++;
            }
            count++;
        }
        return result;
    }

    public static void offset(int[] nums, int start, int end) {
        for (int i = start + 1; i <= end; i++) {
            nums[i - 1] = nums[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}
