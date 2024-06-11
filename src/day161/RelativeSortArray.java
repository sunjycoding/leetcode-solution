package day161;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1122. Relative Sort Array
 *
 * @author created by sunjy on 6/10/24
 */
public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Step 1: Count frequency of each element in arr1
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : arr1) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // Step 2: Process elements as per the order in arr2
        int index = 0;
        for (int num : arr2) {
            int count = frequency.get(num);
            Arrays.fill(arr1, index, index + count, num);
            index += count;
            frequency.remove(num);
        }

        // Step 3: Sort the remaining elements that are not in arr2
        int[] remaining = new int[arr1.length - index];
        int i = 0;
        for (int num : frequency.keySet()) {
            int count = frequency.get(num);
            while (count-- > 0) {
                remaining[i++] = num;
            }
        }
        Arrays.sort(remaining);

        // Copy the sorted elements back to arr1
        System.arraycopy(remaining, 0, arr1, index, remaining.length);

        return arr1;
    }

}
