package day131;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 857. Minimum Cost to Hire K Workers
 *
 * @author created by sunjy on 5/10/24
 */
public class MinimumCostHireWorkers {

    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        double[][] workers = new double[n][2];

        for (int i = 0; i < n; i++) {
            workers[i] = new double[]{(double) wage[i] / quality[i], (double) quality[i]};
        }

        Arrays.sort(workers, Comparator.comparingDouble(a -> a[0]));

        double minCost = Double.MAX_VALUE;
        double totalQuality = 0;

        PriorityQueue<Double> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));

        for (double[] worker : workers) {
            double ratio = worker[0];
            double qual = worker[1];

            totalQuality += qual;
            pq.offer(qual);

            if (pq.size() > k) {
                totalQuality -= pq.poll();
            }

            if (pq.size() == k) {
                double cost = totalQuality * ratio;
                minCost = Math.min(minCost, cost);
            }
        }

        return minCost;
    }

}
