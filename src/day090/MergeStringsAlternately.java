package day090;

/**
 * 1768. Merge Strings Alternately
 *
 * @author created by sunjy on 3/30/24
 */
public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0;
        int j = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i < len1 || j < len2) {
            if (i < len1 && j < len2) {
                stringBuilder.append(word1.charAt(i));
                stringBuilder.append(word2.charAt(j));
                i++;
                j++;
            } else if (i < len1) {
                stringBuilder.append(word1.charAt(i));
                i++;
            } else {
                stringBuilder.append(word2.charAt(j));
                j++;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

}
