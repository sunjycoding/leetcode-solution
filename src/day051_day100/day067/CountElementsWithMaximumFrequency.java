package day051_day100.day067;

import java.util.HashMap;
import java.util.Map;

/**
 * 3005. Count Elements With Maximum Frequency
 *
 * @author created by sunjy on 3/7/24
 */
public class CountElementsWithMaximumFrequency {

    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;

        // Populate the frequency map
        for (int num : nums) {
            int currentFrequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, currentFrequency);
            // Update maxFrequency if the current number's frequency is higher
            maxFrequency = Math.max(maxFrequency, currentFrequency);
        }

        int totalMaxFreq = 0;
        for (int freq : frequencyMap.values()) {
            // Sum frequencies of elements that have the maximum frequency
            if (freq == maxFrequency) {
                totalMaxFreq += freq;
            }
        }

        return totalMaxFreq;
    }

}
