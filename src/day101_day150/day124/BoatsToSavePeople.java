package day101_day150.day124;

import java.util.Arrays;

/**
 * 881. Boats to Save People
 *
 * @author created by sunjy on 5/3/24
 */
public class BoatsToSavePeople {

    public int numRescueBoats(int[] people, int limit) {
        // Sort the array in ascending order
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            // If the combined weight of the heaviest and lightest person is within the limit,
            // accommodate both of them in the same boat
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                // Otherwise, accommodate only the heaviest person in a separate boat
                right--;
            }
            boats++;
        }

        return boats;
    }

}
