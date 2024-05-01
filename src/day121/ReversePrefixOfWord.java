package day121;

/**
 * 2000. Reverse Prefix of Word
 *
 * @author created by sunjy on 4/30/24
 */
public class ReversePrefixOfWord {

    public static String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        int left = 0;
        int right = word.indexOf(ch);
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }
}
