package day015;

/**
 * @author created by sunjy on 1/15/24
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        ListNode current = this;
        while (current != null) {
            stringBuilder.append(current.val);
            if (current.next != null) {
                stringBuilder.append(",");
            }
            current = current.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}
