package day001_day050.day027;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 279. Perfect Squares
 *
 * @author created by sunjy on 1/27/24
 */
public class PerfectSquares {

    public static int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                for (int j = 1; j * j <= current; j++) {
                    int next = current - j * j;
                    if (next == 0) {
                        return level;
                    }
                    queue.add(next);
                }
            }
        }
        return level;
    }

    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }

}
