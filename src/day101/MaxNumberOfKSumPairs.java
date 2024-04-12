package day101;

import java.util.HashMap;
import java.util.Map;

/**
 * 1679. Max Number of K-Sum Pairs
 *
 * @author created by sunjy on 4/9/24
 */
public class MaxNumberOfKSumPairs {

    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int operations = 0;

        for (int num : nums) {
            int complement = k - num;

            if (countMap.getOrDefault(complement, 0) > 0) {
                // Found a pair
                operations++;
                // Use up one occurrence of the complement
                countMap.put(complement, countMap.get(complement) - 1);
            } else {
                // Store the current number in the map
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int k = 5;
        System.out.println(maxOperations(nums, k));
    }

}
