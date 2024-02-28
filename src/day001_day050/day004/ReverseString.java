package day001_day050.day004;

/**
 * 344. Reverse String
 *
 * @author created by sunjy on 1/4/24
 */
public class ReverseString {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (right > left) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s);
        System.out.println(s);
    }
}
