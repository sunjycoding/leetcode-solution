package day069;

/**
 * 80. Remove Duplicates from Sorted Array II
 *
 * @author created by sunjy on 3/9/24
 */
public class RemoveDuplicatesFromSortedArrayTwo {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            // The array is already valid if it has 2 or fewer elements.
            return nums.length;
        }

        // Start from the second element for comparison
        int i = 1;
        // To track the count of the current element
        int count = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[j - 1]) {
                // Increment count if the current and previous elements are the same
                count++;
            } else {
                // Reset count for a new element
                count = 1;
            }

            if (count <= 2) {
                nums[i] = nums[j];
                // Move the insertion point forward
                i++;
            }
        }

        // i is the new length of the array without unwanted duplicates
        return i;
    }

}
