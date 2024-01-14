package day013;

/**
 * 328. Odd Even Linked List
 *
 * @author created by sunjy on 1/13/24
 */
public class OddEvenLinkedList {

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        int count = 0;
        ListNode dummy = new ListNode(0);
        ListNode anotherDummy = new ListNode(0);
        ListNode anotherDummyCurrent = anotherDummy;
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
        ListNode last = null;
        while (current != null) {
            if (count % 2 != 0) {
                anotherDummyCurrent.next = new ListNode(current.val);
                anotherDummyCurrent = anotherDummyCurrent.next;
                prev.next = current.next;
            } else {
                prev = current;
                last = current;
            }
            ++count;
            current = current.next;
        }
        last.next = anotherDummy.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        System.out.println("Original: " + head);
        System.out.println("After: " + oddEvenList(head));
    }
}
