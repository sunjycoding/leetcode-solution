package day051_day100.day085;

/**
 * 41. First Missing Positive
 *
 * @author created by sunjy on 3/25/24
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; ++i) {
            // Use while loop to handle the case when numbers are swapped,
            // it ensures the swapped number is also placed at its correct position.
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < n; ++i) {
            if (nums[i] != i + 1) {
                // Found the first missing positive
                return i + 1;
            }
        }

        // If the array contains all numbers from 1 to n, then the missing number is n+1.
        return n + 1;
    }

}
