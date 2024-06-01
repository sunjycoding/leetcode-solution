package day101_day150.day106;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 933. Number of Recent Calls
 *
 * @author created by sunjy on 4/15/24
 */
public class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        this.queue = new LinkedList<>(); // Initialize the queue
    }

    public int ping(int t) {
        queue.offer(t); // Add current timestamp to the queue

        // Remove elements from the queue that are out of the 3000ms range
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size(); // The size of the queue is the count of recent requests
    }

    public static void main(String[] args) {

    }

}
