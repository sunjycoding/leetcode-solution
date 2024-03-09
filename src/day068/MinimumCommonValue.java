package day068;

/**
 * 2540. Minimum Common Value
 *
 * @author created by sunjy on 3/8/24
 */
public class MinimumCommonValue {

    public static int getCommon(int[] nums1, int[] nums2) {
        // Initialize two pointers for each array
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                // If the current element in nums1 is less than that in nums2, move the pointer in nums1 forward
                i++;
            } else if (nums1[i] > nums2[j]) {
                // If the current element in nums1 is greater than that in nums2, move the pointer in nums2 forward
                j++;
            } else {
                // If the current elements in both arrays are equal, we've found a common integer
                return nums1[i];
            }
        }
        // If no common integer is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{};
        System.out.println(getCommon(nums1, nums2));
    }
}
