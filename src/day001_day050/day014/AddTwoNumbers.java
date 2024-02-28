package day001_day050.day014;

/**
 * 2. Add Two Numbers
 *
 * @author created by sunjy on 1/14/24
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int plus = 0;
        while (l1 != null || l2 != null) {
            int sum;
            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val + plus;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 == null) {
                sum = l2.val + plus;
                l2 = l2.next;
            } else {
                sum = l1.val + plus;
                l1 = l1.next;
            }
            if (sum <= 9) {
                plus = 0;
                current.next = new ListNode(sum);
            } else {
                plus = sum / 10;
                int val = sum % 10;
                current.next = new ListNode(val);
            }
            current = current.next;
        }
        if (plus != 0) {
            current.next = new ListNode(plus);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);

        System.out.println(addTwoNumbers(list1, list2));
    }
}
