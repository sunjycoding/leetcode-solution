package day001_day050.day014;

/**
 * 21. Merge Two Sorted Lists
 *
 * @author created by sunjy on 1/14/24
 */
public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    current.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    current.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
            } else if (list1 == null) {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            current = current.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.println(mergeTwoLists(list1, list2));
    }

}
