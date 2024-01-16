package day015;

/**
 * 430. Flatten a Multilevel Doubly Linked List
 *
 * @author created by sunjy on 1/15/24
 */
public class FlattenMultilevelDoublyLinkedList {

    public static NodeA flatten(NodeA head) {
        if (head == null) {
            return head;
        }
        NodeA pseudoHead = new NodeA();
        pseudoHead.val = 0;
        pseudoHead.prev = null;
        pseudoHead.next = head;
        pseudoHead.child = null;
        flattenDFS(pseudoHead, head);

        pseudoHead.next.prev = null;
        return pseudoHead.next;
    }

    public static NodeA flattenDFS(NodeA prev, NodeA curr) {
        if (curr == null) {
            return prev;
        }
        curr.prev = prev;
        prev.next = curr;

        NodeA tempNext = curr.next;
        NodeA tail = flattenDFS(curr, curr.child);
        curr.child = null;
        return flattenDFS(tail, tempNext);
    }

    public static void main(String[] args) {

    }

}
