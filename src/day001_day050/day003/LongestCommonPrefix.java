package day001_day050.day003;

/**
 * 14. Longest Common Prefix
 *
 * @author created by sunjy on 1/3/24
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }
        int pointer = 0;
        while (pointer < minLength) {
            int i = 0;
            for (; i < strs.length; i++) {
                String str = strs[i];
                if (str.charAt(pointer) != strs[0].charAt(pointer)) {
                    break;
                }
            }
            if (i == strs.length) {
                result.append(strs[0].charAt(pointer));
                ++pointer;
            } else {
                break;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flxower", "flxow", "flxight"}));
    }
}
