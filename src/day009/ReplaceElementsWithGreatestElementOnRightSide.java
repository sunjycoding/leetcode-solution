package day009;

import java.util.Arrays;

/**
 * 1299. Replace Elements with Greatest Element on Right Side
 *
 * @author created by sunjy on 1/9/24
 */
public class ReplaceElementsWithGreatestElementOnRightSide {

    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i + 1];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
    }

}
