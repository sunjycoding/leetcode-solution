package day101_day150.day127;

import java.math.BigInteger;

/**
 * 2816. Double a Number Represented as a Linked List
 *
 * @author created by sunjy on 5/6/24
 */
public class DoubleNumberRepresentedAsLinkedList {

    public ListNode doubleIt(ListNode head) {
        // Initialize an empty string to collect digits
        StringBuilder numberStr = new StringBuilder();
        ListNode current = head;

        // Collect all digits from the linked list
        while (current != null) {
            numberStr.append(current.val);
            current = current.next;
        }

        // Convert the collected digits into a BigInteger and double it
        BigInteger number = new BigInteger(numberStr.toString());
        number = number.multiply(BigInteger.valueOf(2));

        // Convert the doubled number back into a string
        String doubledStr = number.toString();

        // Create the new linked list
        ListNode newHead = new ListNode(Character.getNumericValue(doubledStr.charAt(0)));
        ListNode newCurrent = newHead;
        for (int i = 1; i < doubledStr.length(); i++) {
            newCurrent.next = new ListNode(Character.getNumericValue(doubledStr.charAt(i)));
            newCurrent = newCurrent.next;
        }

        return newHead;

    }

}
