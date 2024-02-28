package day001_day050.day006;

/**
 * 557. Reverse Words in a String III
 *
 * @author created by sunjy on 1/6/24
 */
public class ReverseWordsInStringThree {

    public static String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int left = 0;
            int right = word.length() - 1;
            char[] chars = word.toCharArray();
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                ++left;
                --right;
            }
            stringBuilder.append(chars);
            if (i != words.length - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

}
