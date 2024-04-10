package day051_day100.day080;

/**
 * 83. Remove Duplicates from Sorted List
 *
 * @author created by sunjy on 3/20/24
 */
public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode current = head.next;
        while (current != null) {
            ListNode next = current.next;
            if (current.val == prev.val) {
                prev.next = next;
            } else {
                prev = current;
            }
            current = next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        ListNode result = deleteDuplicates(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

}
