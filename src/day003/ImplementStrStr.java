package day003;

/**
 * 28. Find the Index of the First Occurrence in a String
 *
 * @author created by sunjy on 1/3/24
 */
public class ImplementStrStr {

    public static int strStr(String haystack, String needle) {
        int index = -1;
        for (int i = 0; i < haystack.length(); i++) {
            int matchLength = 0;
            for (int j = 0, start = i; j < needle.length() && start < haystack.length(); j++, start++) {
                if (needle.charAt(j) == haystack.charAt(start)) {
                    matchLength++;
                } else {
                    break;
                }
            }
            if (matchLength == needle.length()) {
                return i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String haystack = "sadubbutsad";
        String needle = "dubb";
        System.out.println(strStr(haystack, needle));
    }
}
