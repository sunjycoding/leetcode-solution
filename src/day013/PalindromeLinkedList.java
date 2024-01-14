package day013;

/**
 * 234. Palindrome Linked List
 *
 * @author created by sunjy on 1/13/24
 */
public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        ListNode reverseCurrent = reverseList(head);
        ListNode current = head;
        while (current != null) {
            if (current.val != reverseCurrent.val) {
                return false;
            }
            current = current.next;
            reverseCurrent = reverseCurrent.next;
        }
        return true;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode reversedHead = null;
        ListNode current = head;
        while (current != null) {
            ListNode newNode = new ListNode(current.val);
            newNode.next = reversedHead;
            reversedHead = newNode;
            current = current.next;
        }
        return reversedHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println("Original: " + head);
        System.out.println("Reversed: " + reverseList(head));
        System.out.println("After: " + isPalindrome(head));
    }

}
