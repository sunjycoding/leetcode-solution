package day051_day100.day095;

/**
 * 334. Increasing Triplet Subsequence
 *
 * @author created by sunjy on 4/4/24
 */
public class IncreasingTripletSubsequence {

    public static boolean increasingTriplet(int[] nums) {
        // Initialize first and second to the maximum value integer can hold
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            // Update first if current num is smaller
            if (num <= first) {
                first = num;
            } else if (num <= second) { // Update second if num is greater than first but smaller than second
                second = num;
            } else {
                // Found a triplet: num is greater than both first and second
                return true;
            }
        }

        // No increasing triplet found
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        System.out.println(increasingTriplet(nums));
    }

}
