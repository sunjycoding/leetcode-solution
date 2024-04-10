package day051_day100.day078;

/**
 * 621. Task Scheduler
 *
 * @author created by sunjy on 3/18/24
 */
public class TaskScheduler {

    public static int leastInterval(char[] tasks, int n) {
        // Assuming tasks are uppercase letters A-Z
        int[] taskCounts = new int[26];
        for (char task : tasks) {
            // Count occurrences of each task
            taskCounts[task - 'A']++;
        }

        int maxFrequency = 0;
        for (int count : taskCounts) {
            maxFrequency = Math.max(maxFrequency, count);
        }

        int numberOfMaxFrequencyTasks = 0;
        for (int count : taskCounts) {
            if (count == maxFrequency) {
                numberOfMaxFrequencyTasks++;
            }
        }

        int minIntervals = (maxFrequency - 1) * (n + 1) + numberOfMaxFrequencyTasks;
        return Math.max(tasks.length, minIntervals);
    }

    public static void main(String[] args) {
        char[] tasks = new char[]{'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println(leastInterval(tasks, n));
    }
}
