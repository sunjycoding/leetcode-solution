package day013;

/**
 * 206. Reverse Linked List
 *
 * @author created by sunjy on 1/13/24
 */
public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 1; i < 5; i++) {
            current.next = new ListNode(i + 1);
            current = current.next;
        }
        System.out.println(reverseList(head));
    }

}
