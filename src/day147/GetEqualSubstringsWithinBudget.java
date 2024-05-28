package day147;

/**
 * 1208. Get Equal Substrings Within Budget
 *
 * @author created by sunjy on 5/27/24
 */
public class GetEqualSubstringsWithinBudget {

    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0, totalCost = 0, maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            // Calculate the cost to change current character
            int cost = Math.abs(s.charAt(end) - t.charAt(end));

            // Add the cost to the total
            totalCost += cost;

            // If the total cost exceeds maxCost, move the start pointer to reduce the window size
            while (totalCost > maxCost) {
                totalCost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }

            // Update the maximum length of the valid window
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

}
