package day027;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 752. Open the Lock
 *
 * @author created by sunjy on 1/27/24
 */
public class OpenTheLock {

    public static int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        int turns = 0;

        queue.offer("0000");
        visited.add("0000");

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                String current = queue.poll();

                if (current.equals(target)) {
                    return turns;
                }

                if (dead.contains(current)) {
                    continue;
                }

                for (int j = 0; j < 4; j++) {
                    char[] currentChars = current.toCharArray();
                    for (int k = -1; k <= 1; k += 2) {
                        char oldChar = currentChars[j];
                        currentChars[j] = (char) (((currentChars[j] - '0' + k + 10) % 10) + '0');
                        String next = new String(currentChars);
                        if (!visited.contains(next)) {
                            visited.add(next);
                            queue.offer(next);
                        }
                        currentChars[j] = oldChar;
                    }
                }
            }
            turns++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] deadends = new String[]{"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";
        System.out.println(openLock(deadends, target));
    }

}
