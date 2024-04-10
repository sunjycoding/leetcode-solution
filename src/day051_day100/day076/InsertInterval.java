package day051_day100.day076;

import java.util.ArrayList;
import java.util.List;

/**
 * 57. Insert Interval
 *
 * @author created by sunjy on 3/16/24
 */
public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int i = 0;
        // Step 2: Add all non-overlapping intervals before newInterval
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Step 3: Merge overlapping intervals
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        // Step 4: Add the merged newInterval
        result.add(newInterval);

        // Step 5: Add all non-overlapping intervals after newInterval
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }

        // Step 6: Convert List to Array
        return result.toArray(new int[result.size()][]);
    }

}
