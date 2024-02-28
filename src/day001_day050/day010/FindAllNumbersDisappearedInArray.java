package day001_day050.day010;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 *
 * @author created by sunjy on 1/10/24
 */
public class FindAllNumbersDisappearedInArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] *= -1;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) {
                result.add(i);
            }
        }
        return result;
    }

    // Time Limit Exceeded
//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> result = new ArrayList<>();
//        int length = nums.length;
//        for (int i = 1; i <= length; i++) {
//            boolean exist = false;
//            for (int num : nums) {
//                if (i == num) {
//                    exist = true;
//                    break;
//                }
//            }
//            if (!exist) {
//                result.add(i);
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
//        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findDisappearedNumbers(new int[]{1, 1}));
    }

}
