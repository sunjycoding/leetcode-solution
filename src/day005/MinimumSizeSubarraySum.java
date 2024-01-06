package day005;

/**
 * 209. Minimum Size Subarray Sum
 *
 * @author created by sunjy on 1/5/24
 */
public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 4};
        int target = 4;
        System.out.println(minSubArrayLen(target, nums));
    }

}
