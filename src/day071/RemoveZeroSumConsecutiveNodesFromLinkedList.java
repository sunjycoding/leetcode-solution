package day071;

import java.util.HashMap;
import java.util.Map;

/**
 * 1171. Remove Zero Sum Consecutive Nodes from Linked List
 *
 * @author created by sunjy on 3/11/24
 */
public class RemoveZeroSumConsecutiveNodesFromLinkedList {

    public ListNode removeZeroSumSublists(ListNode head) {
        // Dummy node to handle edge case where we need to delete from the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Map to store the prefix sum and the corresponding node
        Map<Integer, ListNode> prefixSumMap = new HashMap<>();
        int prefixSum = 0;
        ListNode current = dummy;

        while (current != null) {
            prefixSum += current.val;

            // Check if this prefix sum was seen before
            if (prefixSumMap.containsKey(prefixSum)) {
                // Found a zero sum sublist, start deleting nodes from next of previously seen node
                ListNode prev = prefixSumMap.get(prefixSum);
                ListNode temp = prev.next;
                int tempSum = prefixSum + temp.val;

                // Remove references for all nodes in the zero sum sublist from the map
                while (tempSum != prefixSum) {
                    prefixSumMap.remove(tempSum);
                    temp = temp.next;
                    tempSum += temp.val;
                }

                // Link the previous node with the current's next to effectively remove the zero sum sublist
                prev.next = current.next;
            } else {
                // No zero sum found, add prefix sum and current node to the map
                prefixSumMap.put(prefixSum, current);
            }

            current = current.next;
        }
        return dummy.next;
    }
}
