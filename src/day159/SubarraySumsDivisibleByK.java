package day159;

/**
 * 974. Subarray Sums Divisible by K
 *
 * @author created by sunjy on 6/8/24
 */
public class SubarraySumsDivisibleByK {

    public int subarraysDivByK(int[] nums, int k) {
        int[] count = new int[k];
        count[0] = 1;  // There's always at least one way to have a sum of zero (by taking no elements)
        int prefixSum = 0, result = 0;

        for (int num : nums) {
            // Update the prefix sum
            prefixSum += num;

            // Normalized mod
            int mod = (prefixSum % k + k) % k;

            // Increment the result by the number of times this mod has been seen before
            result += count[mod];

            // Update the count of this mod
            count[mod]++;
        }

        return result;
    }

}
