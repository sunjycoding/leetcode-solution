package day126;

/**
 * 2487. Remove Nodes From Linked List
 *
 * @author created by sunjy on 5/6/24
 */
public class RemoveNodesFromLinkedList {

    public ListNode removeNodes(ListNode head) {
        if (head == null) {
            return null;
        }

        // Reverse the linked list
        ListNode reversed = reverseList(head);
        ListNode newHead = reversed;
        ListNode maxSoFar = reversed;
        reversed = reversed.next;

        while (reversed != null) {
            if (reversed.val >= maxSoFar.val) {
                maxSoFar.next = reversed;
                maxSoFar = reversed;
            }
            reversed = reversed.next;
        }

        // Remove the remaining nodes after maxSoFar
        maxSoFar.next = null;

        // Reverse the modified linked list
        return reverseList(newHead);
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

}
