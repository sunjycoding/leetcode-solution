package day051_day100.day100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 2215. Find the Difference of Two Arrays
 *
 * @author created by sunjy on 4/9/24
 */
public class FindTheDifferenceOfTwoArrays {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(pickUnique(nums1, nums2));
        result.add(pickUnique(nums2, nums1));
        return result;
    }

    public static List<Integer> pickUnique(int[] a, int[] b) {
        Set<Integer> result = new HashSet<>();
        for (int k : a) {
            boolean exist = false;
            for (int i : b) {
                if (k == i) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                result.add(k);
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{2, 4, 6};
        System.out.println(findDifference(nums1, nums2));
    }

}
