package day099;

/**
 * 1732. Find the Highest Altitude
 *
 * @author created by sunjy on 4/8/24
 */
public class FindTheHighestAltitude {

    public static int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        int highest = 0;
        for (int i = 0; i < altitude.length - 1; i++) {
            altitude[i + 1] = altitude[i] + gain[i];
            if (altitude[i + 1] > highest) {
                highest = altitude[i + 1];
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        int[] gain = new int[]{-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }

}
