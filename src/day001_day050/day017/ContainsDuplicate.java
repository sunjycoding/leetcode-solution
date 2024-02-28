package day001_day050.day017;

import java.util.HashSet;

/**
 * 217. Contains Duplicate
 *
 * @author created by sunjy on 1/17/24
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
            if (hashSet.size() != (i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
