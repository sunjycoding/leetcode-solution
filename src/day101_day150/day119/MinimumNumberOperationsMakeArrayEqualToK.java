package day101_day150.day119;

/**
 * 2997. Minimum Number of Operations to Make Array XOR Equal to K
 *
 * @author created by sunjy on 4/28/24
 */
public class MinimumNumberOperationsMakeArrayEqualToK {

    public int minOperations(int[] nums, int k) {
        int currentXOR = 0;

        // Calculate the XOR of all elements in the array
        for (int num : nums) {
            currentXOR ^= num;
        }

        // Calculate the difference needed to reach k
        int difference = currentXOR ^ k;

        // Count the number of bits that need to be flipped
        int operations = 0;
        while (difference > 0) {
            operations += difference & 1;  // Increment if the least significant bit is 1
            difference >>= 1;             // Shift right by 1 bit to check the next bit
        }

        return operations;
    }

}
