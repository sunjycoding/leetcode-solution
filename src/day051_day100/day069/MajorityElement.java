package day051_day100.day069;

/**
 * 169. Majority Element
 *
 * @author created by sunjy on 3/9/24
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        assert candidate != null;
        return candidate;
    }

}
