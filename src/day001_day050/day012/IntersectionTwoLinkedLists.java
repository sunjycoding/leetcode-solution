package day001_day050.day012;

/**
 * 160. Intersection of Two Linked Lists
 *
 * @author created by sunjy on 1/12/24
 */
public class IntersectionTwoLinkedLists {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = (a != null) ? a.next : headB;
            b = (b != null) ? b.next : headA;
        }
        return a;
    }

    public static void main(String[] args) {

    }

}
