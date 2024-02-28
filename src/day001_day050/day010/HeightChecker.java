package day001_day050.day010;

import java.util.Arrays;

/**
 * 1051. Height Checker
 *
 * @author created by sunjy on 1/10/24
 */
public class HeightChecker {

    public static int heightChecker(int[] heights) {
        int[] arr = Arrays.copyOf(heights, heights.length);
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length - i - 1; j++) {
                if (heights[j + 1] < heights[j]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (arr[i] != heights[i]) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] heights = new int[]{5, 1, 2, 3, 4};
        int[] heights = new int[]{7, 3, 5, 5, 1, 2, 2, 3, 9, 2, 2, 7, 1, 7, 3, 2, 3, 6, 6, 7};
        System.out.println(heightChecker(heights));
    }

}
