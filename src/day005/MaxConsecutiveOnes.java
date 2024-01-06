package day005;

/**
 * 485. Max Consecutive Ones
 *
 * @author created by sunjy on 1/5/24
 */
public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                ++count;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

}
