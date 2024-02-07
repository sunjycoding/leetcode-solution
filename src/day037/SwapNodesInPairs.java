package day037;

/**
 * @author created by sunjy on 2/6/24
 */
public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        // Dummy node acts as the previous node for the head node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            // Nodes to be swapped
            ListNode firstNode = current.next;
            ListNode secondNode = current.next.next;

            // Swapping
            current.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            // Move to the next pair
            current = firstNode;
        }

        // The head of the new list is after the dummy node
        return dummy.next;
    }

}
