package day163;

import java.util.Arrays;

/**
 * 2037. Minimum Number of Moves to Seat Everyone
 *
 * @author created by sunjy on 6/12/24
 */
public class MinimumNumberMovesToSeatEveryone {

    public int minMovesToSeat(int[] seats, int[] students) {
        // Sort both arrays
        Arrays.sort(seats);
        Arrays.sort(students);

        int totalMoves = 0;

        // Calculate the minimum moves required by summing the absolute differences
        for (int i = 0; i < seats.length; i++) {
            totalMoves += Math.abs(seats[i] - students[i]);
        }

        return totalMoves;
    }

}
