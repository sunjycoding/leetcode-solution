package day001_day050.day003;

/**
 * 67. Add Binary
 *
 * @author created by sunjy on 1/3/24
 */
public class AddBinary {

    public static String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int carry = 0;
        while (indexA >= 0 || indexB >= 0) {
            int sum = carry;
            if (indexA >= 0) {
                sum += a.charAt(indexA--) - '0';
            }
            if (indexB >= 0) {
                sum += b.charAt(indexB--) - '0';
            }
            stringBuilder.insert(0, sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            stringBuilder.insert(0, 1);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

}
