package day101_day150.day118;

import java.util.ArrayList;
import java.util.List;

/**
 * 834. Sum of Distances in Tree
 *
 * @author created by sunjy on 4/27/24
 */
public class SumOfDistancesInTree {

    private int[] sumDistances;
    private int[] subtreeSize;
    private List<List<Integer>> graph;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        sumDistances = new int[n];
        subtreeSize = new int[n];
        graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // First DFS to compute subtree sizes and initial root distances
        dfs(0, -1);

        // Second DFS to adjust results using previously computed values
        dfs2(0, -1, n);

        return sumDistances;
    }

    private void dfs(int node, int parent) {
        subtreeSize[node] = 1;  // Each node counts itself
        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) {
                continue;  // Skip the parent
            }
            dfs(neighbor, node);
            subtreeSize[node] += subtreeSize[neighbor];
            sumDistances[node] += sumDistances[neighbor] + subtreeSize[neighbor];
        }
    }

    private void dfs2(int node, int parent, int n) {
        // We already have sumDistances[node] from dfs()
        if (parent != -1) {
            sumDistances[node] = sumDistances[parent] - subtreeSize[node] + (n - subtreeSize[node]);
        }

        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) {
                continue;
            }
            dfs2(neighbor, node, n);
        }
    }

}
