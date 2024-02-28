package day001_day050.day004;

import java.util.Arrays;

/**
 * 561. Array Partition
 *
 * @author created by sunjy on 1/4/24
 */
public class ArrayPartitionOne {

    public static int arrayPairSum(int[] nums) {
        int maxPossibleSum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i += 2) {
            maxPossibleSum += nums[i];
        }
        return maxPossibleSum;
    }

    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{7, 3, 1, 0, 0, 6}));
    }
}
