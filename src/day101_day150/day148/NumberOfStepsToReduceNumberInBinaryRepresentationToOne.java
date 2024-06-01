package day101_day150.day148;

/**
 * 1404. Number of Steps to Reduce a Number in Binary Representation to One
 *
 * @author created by sunjy on 5/28/24
 */
public class NumberOfStepsToReduceNumberInBinaryRepresentationToOne {

    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;

        // Start from the last character, skipping the first one because we process until the number becomes '1'
        for (int i = s.length() - 1; i > 0; i--) {
            // Check the current bit and the carry
            if (s.charAt(i) - '0' + carry == 1) {
                // If it's '1', we need to add 1 (this is the case for an odd number)
                carry = 1;  // Adding one to an odd number always results in a carry
                steps += 2; // We take 2 steps here, add 1 and divide by 2
            } else {
                // If it's '0' and no carry or '0' with carry, we still divide by 2 which is a single step
                steps += 1;
            }
        }

        // After loop, if carry is still 1, we need one more step to add this carry to the most significant bit
        steps += carry;

        return steps;
    }

}
