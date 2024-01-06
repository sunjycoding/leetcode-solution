package day006;

/**
 * 151. Reverse Words in a String
 *
 * @author created by sunjy on 1/6/24
 */
public class ReverseWordsInString {

    public static String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }

}
