package day001;

/**
 * 724. Find Pivot Index
 *
 * @author created by sunjy on 1/1/24
 */
public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        int pivotIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            int leftSum = calculateSum(nums, 0, i - 1);
            int rightSum = calculateSum(nums, i + 1, nums.length - 1);
            if (leftSum == rightSum) {
                pivotIndex = i;
                break;
            }
        }
        return pivotIndex;
    }

    private static int calculateSum(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{2, 1, -1}));
    }

}
