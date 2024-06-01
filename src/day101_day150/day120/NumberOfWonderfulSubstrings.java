package day101_day150.day120;

/**
 * 1915. Number of Wonderful Substrings
 *
 * @author created by sunjy on 4/29/24
 */
public class NumberOfWonderfulSubstrings {

    public long wonderfulSubstrings(String word) {
        long count = 0;
        // to store the frequency of each state
        int[] freq = new int[1024];
        // base case: empty substring is considered wonderful
        freq[0] = 1;

        // bitmask to store the current state
        long curr = 0;

        for (char c : word.toCharArray()) {
            // update the current state
            curr ^= (1L << (c - 'a'));

            // check if the current state is wonderful
            if (freq[(int) curr] > 0) {
                count += freq[(int) curr];
            }

            // check if the current state is wonderful after flipping one bit
            for (int i = 0; i < 10; i++) {
                long flip = curr ^ (1 << i);
                if (freq[(int) flip] > 0) {
                    count += freq[(int) flip];
                }
            }

            // increment the frequency of the current state
            freq[(int) curr]++;
        }

        return count;

    }

}
