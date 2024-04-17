package day107;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 649. Dota2 Senate
 *
 * @author created by sunjy on 4/16/24
 */
public class Dota2Senate {

    public static String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiantQueue = new LinkedList<>();
        Queue<Integer> direQueue = new LinkedList<>();

        // Initialize queues with indices of each senator
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiantQueue.offer(i);
            } else {
                direQueue.offer(i);
            }
        }

        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            int radiantIndex = radiantQueue.poll();
            int direIndex = direQueue.poll();

            // The senator with the earlier index gets to ban the senator from the opposing party
            if (radiantIndex < direIndex) {
                // Enqueue this senator for the next round
                radiantQueue.offer(radiantIndex + n);
            } else {
                // Enqueue this senator for the next round
                direQueue.offer(direIndex + n);
            }
        }

        // The non-empty queue's party is the winner
        return (radiantQueue.isEmpty() ? "Dire" : "Radiant");
    }

    public static void main(String[] args) {
        String senate = "RD";
        System.out.println(predictPartyVictory(senate));
    }

}
