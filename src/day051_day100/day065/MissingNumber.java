package day051_day100.day065;

/**
 * 268. Missing Number
 *
 * @author created by sunjy on 3/5/24
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        // Calculate the expected sum of the first n natural numbers
        int expectedSum = n * (n + 1) / 2;
        // Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        // The difference between the expected and actual sum is the missing number
        return expectedSum - actualSum;
    }

}
