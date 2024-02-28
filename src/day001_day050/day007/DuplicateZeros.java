package day001_day050.day007;

import java.util.Arrays;

/**
 * 1089. Duplicate Zeros
 *
 * @author created by sunjy on 1/7/24
 */
public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == 0) {
                ++count;
            }
        }
        int length = arr.length;
        for (int i = length - 1; i >= 0; i--) {
            if (i + count < length) {
                arr[i + count] = arr[i];
            }
            if (arr[i] == 0) {
                count--;
                if (i + count < length) {
                    arr[i + count] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

}
