package day001_day050.day020;

import java.util.HashMap;
import java.util.Map;

/**
 * 387. First Unique Character in a String
 *
 * @author created by sunjy on 1/20/24
 */
public class FirstUniqueCharacterInString {

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

}
