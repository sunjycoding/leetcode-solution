package day051_day100.day091;

/**
 * 1071. Greatest Common Divisor of Strings
 *
 * @author created by sunjy on 3/31/24
 */
public class GreatestCommonDivisorOfStrings {

    public static String gcdOfStrings(String str1, String str2) {
        // Step 1: Check for divisibility
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // Step 2: Find GCD of lengths
        int gcdLength = gcd(str1.length(), str2.length());
        // Step 3: Return the substring
        return str1.substring(0, gcdLength);
    }

    // Helper function to find the GCD of two integers
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
    }

}
