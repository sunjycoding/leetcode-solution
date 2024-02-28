package day001_day050.day010;

/**
 * 414. Third Maximum Number
 *
 * @author created by sunjy on 1/10/24
 */
public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        int count = 0;
        for (int num : nums) {
            if ((long) num == firstMax || (long) num == secondMax || (long) num == thirdMax) {
                continue;
            }
            if ((long) num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
                count++;
            } else if ((long) num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
                count++;
            } else if ((long) num > thirdMax) {
                thirdMax = num;
                count++;
            }
        }
        return count >= 3 ? (int) thirdMax : (int) firstMax;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }

}
