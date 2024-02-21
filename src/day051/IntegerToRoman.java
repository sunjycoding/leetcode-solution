package day051;

/**
 * 12. Integer to Roman
 *
 * @author created by sunjy on 2/20/24
 */
public class IntegerToRoman {

    public String intToRoman(int num) {
        // Define the values and the corresponding symbols in descending order.
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        // Initialize an empty StringBuilder to build the Roman numeral.
        StringBuilder roman = new StringBuilder();

        // Iterate over the values.
        for (int i = 0; i < values.length; i++) {
            // While the current value can be subtracted from num, append the symbol and decrease num.
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        // Return the constructed Roman numeral.
        return roman.toString();
    }

}
