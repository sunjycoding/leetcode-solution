package day007;

/**
 * 1295. Find Numbers with Even Number of Digits
 *
 * @author created by sunjy on 1/7/24
 */
public class FindNumbersWithEvenNumberDigits {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            while (num != 0) {
                num /= 10;
                ++digits;
            }
            if (digits % 2 == 0) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

}
