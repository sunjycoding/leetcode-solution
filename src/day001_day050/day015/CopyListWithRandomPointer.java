package day001_day050.day015;

/**
 * 138. Copy List with Random Pointer
 *
 * @author created by sunjy on 1/15/24
 */
public class CopyListWithRandomPointer {

    public static NodeB copyRandomList(NodeB head) {
        if (head == null) {
            return null;
        }

        // Step 1: Create a new node for each existing node and place it between the original nodes.
        NodeB current = head;
        while (current != null) {
            NodeB temp = new NodeB(current.val);
            temp.next = current.next;
            current.next = temp;
            current = temp.next;
        }

        // Step 2: Assign random pointers for the new nodes.
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        // Step 3: Detach the new nodes from the original list to form the copied list.
        current = head;
        NodeB newHead = head.next;
        NodeB copy = newHead;
        while (current != null) {
            current.next = current.next.next;
            if (copy.next != null) {
                copy.next = copy.next.next;
            }
            current = current.next;
            copy = copy.next;
        }

        return newHead;
    }

    public static void main(String[] args) {

    }
}
