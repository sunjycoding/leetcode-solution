package day051_day100.day079;

/**
 * 1669. Merge In Between Linked Lists
 *
 * @author created by sunjy on 3/19/24
 */
public class MergeInBetweenLinkedLists {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // Find the node just before position a (preA)
        ListNode preA = list1;
        for (int i = 0; i < a - 1; i++) {
            preA = preA.next;
        }

        // Find the node just after position b (postB)
        ListNode postB = preA;
        for (int i = a; i <= b + 1; i++) {
            postB = postB.next;
        }

        // Link preA to the head of list2
        preA.next = list2;

        // Traverse list2 to the end
        ListNode current = list2;
        while (current.next != null) {
            current = current.next;
        }

        // Link the end of list2 to postB
        current.next = postB;

        return list1;
    }

}
