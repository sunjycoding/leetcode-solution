package day051_day100.day098;

/**
 * 1700. Number of Students Unable to Eat Lunch
 *
 * @author created by sunjy on 4/7/24
 */
public class NumberOfStudentsUnableToEatLunch {

    public int countStudents(int[] students, int[] sandwiches) {
        // Count[0] for circular (0), count[1] for square (1)
        int[] count = new int[2];

        // Count the preferences of all students
        for (int student : students) {
            count[student]++;
        }

        // Iterate through the sandwiches from the top of the stack
        for (int sandwich : sandwiches) {
            // If no student wants the current type of sandwich, break
            if (count[sandwich] == 0) {
                break;
            }
            // Otherwise, one student takes a sandwich and leaves
            count[sandwich]--;
        }

        // The students unable to eat are those remaining
        return count[0] + count[1];
    }

}
