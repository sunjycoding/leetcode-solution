package day017;

import java.util.HashMap;

/**
 * 136. Single Number
 *
 * @author created by sunjy on 1/17/24
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

}
