package day051_day100.day100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1207. Unique Number of Occurrences
 *
 * @author created by sunjy on 4/9/24
 */
public class UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> keySet = map.keySet();
        Set<Integer> set = new HashSet<>();
        for (int key : map.keySet()) {
            set.add(map.get(key));
        }
        return keySet.size() == set.size();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
    }

}
