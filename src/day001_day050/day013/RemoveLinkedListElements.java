package day001_day050.day013;

/**
 * 203. Remove Linked List Elements
 *
 * @author created by sunjy on 1/13/24
 */
public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 1; i < 5; i++) {
            current.next = new ListNode(i + 1);
            current = current.next;
        }
        System.out.println("Original: " + head);
        System.out.println("After: " + removeElements(head, 3));
    }

}
