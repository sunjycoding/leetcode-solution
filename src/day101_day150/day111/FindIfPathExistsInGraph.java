package day101_day150.day111;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 1971. Find if Path Exists in Graph
 *
 * @author created by sunjy on 4/20/24
 */
public class FindIfPathExistsInGraph {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // If source and destination are same
        if (source == destination) {
            return true;
        }

        // Step 1: Build the graph using adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            // because the graph is bidirectional
            graph.get(v).add(u);
        }

        // Step 2: BFS from source to find destination
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        boolean[] visited = new boolean[n];
        visited[source] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // Process all neighbors
            for (int neighbor : graph.get(current)) {
                if (neighbor == destination) {
                    // If neighbor is the destination, path exists
                    return true;
                }
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        // If no path found
        return false;
    }

}
