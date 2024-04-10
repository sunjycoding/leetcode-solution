package day051_day100.day066;

/**
 * 876. Middle of the Linked List
 *
 * @author created by sunjy on 3/6/24
 */
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Move fast pointer two steps and slow pointer one step at a time
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // When fast pointer reaches the end, slow pointer will be at the middle
        return slow;
    }

}
