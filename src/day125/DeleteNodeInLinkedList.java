package day125;

/**
 * 237. Delete Node in a Linked List
 *
 * @author created by sunjy on 5/4/24
 */
public class DeleteNodeInLinkedList {

    public static void deleteNode(ListNode node) {
        // If the node is null or the next node is null, there is nothing to do
        if (node == null || node.next == null) {
            return;
        }

        // Copy the value of the next node to the current node
        node.val = node.next.val;

        // Store a reference to the node after the next node

        // Deallocate the next node by removing the reference to it
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(9);
        ListNode prev = node;
        while (prev != null) {
            System.out.println(prev.val);
            prev = prev.next;
        }
        deleteNode(node);
        System.out.println("=======");
        ListNode next = node;
        while (next != null) {
            System.out.println(next.val);
            next = next.next;
        }
    }

}
