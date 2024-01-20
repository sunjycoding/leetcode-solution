package day019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Minimum Index Sum of Two Lists
 *
 * @author created by sunjy on 1/19/24
 */
public class MinimumIndexSumTwoLists {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int sum = i + map.get(list2[i]);
                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(list2[i]);
                } else if (sum == minSum) {
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] list1 = new String[]{"happy", "sad", "good"};
        String[] list2 = new String[]{"sad", "happy", "good"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }
}
