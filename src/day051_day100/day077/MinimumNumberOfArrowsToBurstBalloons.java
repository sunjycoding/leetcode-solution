package day051_day100.day077;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 452. Minimum Number of Arrows to Burst Balloons
 *
 * @author created by sunjy on 3/17/24
 */
public class MinimumNumberOfArrowsToBurstBalloons {

    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        // Sort the points based on their end coordinates
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int arrowCount = 1; // Start with one arrow
        int currentEnd = points[0][1]; // The end of the first balloon

        for (int i = 1; i < points.length; i++) {
            // If the current balloon starts after the last one ends, it needs a new arrow
            if (points[i][0] > currentEnd) {
                arrowCount++;
                currentEnd = points[i][1]; // Update the end to the current balloon's end
            }
            // If the balloon starts within the range of currentEnd, it will be burst by the current arrow, so do nothing
        }

        return arrowCount;
    }

    public static void main(String[] args) {
        int[][] points = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(findMinArrowShots(points));
    }

}
