/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node that points to the start of the list.
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Loop through the list and remove any nodes with the given value.
        ListNode temp = dummy;
        while (temp.next != null) {
            if (temp.next.val == val) {
                // Set the next pointer of the current node to the node after the next one,
                // effectively removing the node with the given value from the list.
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return dummy.next;
    }
}