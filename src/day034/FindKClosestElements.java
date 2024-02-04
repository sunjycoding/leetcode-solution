package day034;

import java.util.ArrayList;
import java.util.List;

/**
 * @author created by sunjy on 2/3/24
 */
public class FindKClosestElements {


    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - k;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        System.out.println(findClosestElements(arr, k, x));
    }
}
