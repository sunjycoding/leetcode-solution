package day030;

/**
 * 704. Binary Search
 *
 * @author created by sunjy on 1/30/24
 */
public class BinarySearch {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int num = nums[mid];
            if (target == num) {
                return mid;
            } else if (target < num) {
                right = mid + 1;
            } else {
                left = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
