package day024;

import java.util.HashMap;
import java.util.Map;

/**
 * 454. 4Sum II
 *
 * @author created by sunjy on 1/24/24
 */
public class FourSumTwo {

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> sumMap = new HashMap<>();

        for (int a : nums1) {
            for (int b : nums2) {
                sumMap.put(a + b, sumMap.getOrDefault(a + b, 0) + 1);
            }
        }

        int count = 0;

        for (int c : nums3) {
            for (int d : nums4) {
                count += sumMap.getOrDefault(-(c + d), 0);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{-2, -1};
        int[] nums3 = new int[]{-1, 2};
        int[] nums4 = new int[]{0, 2};
        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }

}
