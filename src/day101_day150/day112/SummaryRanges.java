package day101_day150.day112;

import java.util.ArrayList;
import java.util.List;

/**
 * 228. Summary Ranges
 *
 * @author created by sunjy on 4/21/24
 */
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;

        if (n == 0) {
            // return empty list if input array is empty
            return result;
        }

        // Start from the first element
        int start = nums[0];

        for (int i = 0; i < n; i++) {
            // Check if the current number is not part of the current range
            if (i == n - 1 || nums[i] + 1 != nums[i + 1]) {
                if (start == nums[i]) {
                    result.add(String.valueOf(start)); // Single number range
                } else {
                    result.add(start + "->" + nums[i]); // Range of numbers
                }
                // Update start to be the next number if there is one
                if (i != n - 1) {
                    start = nums[i + 1];
                }
            }
        }

        return result;
    }

}
