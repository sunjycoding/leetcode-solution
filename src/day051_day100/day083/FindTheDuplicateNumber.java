package day051_day100.day083;

/**
 * 287. Find the Duplicate Number
 *
 * @author created by sunjy on 3/23/24
 */
public class FindTheDuplicateNumber {

    public static int findDuplicate(int[] nums) {
        // Phase 1: Finding the intersection point in the cycle
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow]; // Move slow pointer one step
            fast = nums[nums[fast]]; // Move fast pointer two steps
        } while (slow != fast);

        // Phase 2: Finding the entrance to the cycle
        slow = nums[0]; // Reset slow to the beginning
        while (slow != fast) {
            slow = nums[slow]; // Move slow one step
            fast = nums[fast]; // Move fast one step as well
        }

        return slow; // Slow is the duplicate number
    }

    public static void main(String[] args) {

    }
}
