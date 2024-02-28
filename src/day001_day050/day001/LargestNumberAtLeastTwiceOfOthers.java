package day001_day050.day001;

/**
 * 747. Largest Number At Least Twice of Others
 *
 * @author created by sunjy on 1/1/24
 */
public class LargestNumberAtLeastTwiceOfOthers {

    public static int dominantIndex(int[] nums) {
        int index = -1;
        int largestNumberIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[largestNumberIndex]) {
                largestNumberIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != largestNumberIndex) {
                int twice = 2 * nums[i];
                if (twice > nums[largestNumberIndex]) {
                    return index;
                }
            }
        }
        return largestNumberIndex;
    }

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{3, 6, 1, 0}));
    }

}
