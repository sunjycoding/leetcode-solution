package day001_day050.day007;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array
 *
 * @author created by sunjy on 1/7/24
 */
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        int n1 = 0;
        int n2 = 0;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            if (n1 < m && n2 < n) {
                int num1 = nums1[n1];
                int num2 = nums2[n2];
                if (num1 <= num2) {
                    arr[i] = num1;
                    n1++;
                } else {
                    arr[i] = num2;
                    n2++;
                }
            } else if (n1 < m) {
                arr[i] = nums1[n1];
                n1++;
            } else if (n2 < n) {
                arr[i] = nums2[n2];
                n2++;
            }
        }
        System.arraycopy(arr, 0, nums1, 0, length);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

}
