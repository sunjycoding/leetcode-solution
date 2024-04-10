package day051_day100.day051;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. Roman to Integer
 *
 * @author created by sunjy on 2/20/24
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        // Mapping Roman numerals to integers
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int prevValue = 0;
        for (char c : s.toCharArray()) {
            int value = romanValues.get(c);

            // If the previous symbol is less than the current, subtract twice the previous value
            // because it was added once before.
            if (prevValue < value) {
                total += value - 2 * prevValue;
            } else {
                total += value;
            }

            prevValue = value;
        }

        return total;
    }

}
