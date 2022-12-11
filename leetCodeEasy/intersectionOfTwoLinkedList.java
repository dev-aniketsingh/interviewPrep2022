/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // If either list is empty, there can be no intersection.
        if (headA == null || headB == null) return null;

        // Use two pointers, one for each list.
        ListNode pointer1 = headA;
        ListNode pointer2 = headB;

        // Keep advancing the pointers until they point to the same node.
        while (pointer1 != pointer2) {
            // If the pointer for list 1 has reached the end of the list,
            // set it to the start of the other list.
            // Otherwise, move the pointer to the next node in the list.
            pointer1 = (pointer1 == null) ? headB : pointer1.next;

            // If the pointer for list 2 has reached the end of the list,
            // set it to the start of the other list.
            // Otherwise, move the pointer to the next node in the list.
            pointer2 = (pointer2 == null) ? headA : pointer2.next;
        }

        return pointer1;
    }
}