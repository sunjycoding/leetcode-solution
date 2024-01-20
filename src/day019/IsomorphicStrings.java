package day019;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. Isomorphic Strings
 *
 * @author created by sunjy on 1/19/24
 */
public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> mapA = new HashMap<>();
        Map<Character, Character> mapB = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if ((mapA.containsKey(c1) && mapA.get(c1) != c2) ||
                    (mapB.containsKey(c2) && mapB.get(c2) != c1)) {
                return false;
            }

            mapA.put(c1, c2);
            mapB.put(c2, c1);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
