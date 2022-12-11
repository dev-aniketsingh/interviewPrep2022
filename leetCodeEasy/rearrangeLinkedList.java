class Solution {
    public void reorderList(ListNode head) {
        // Find the middle node of the list.
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list.
        ListNode p = slow;
        ListNode q = p.next;
        while (q != null) {
            // Store the next node in the second half of the list.
            ListNode tmp = q.next;

            // Reverse the link from q to p.
            q.next = p;

            // If p is the middle node, set its next pointer to null to
            // indicate that the second half of the list has been reversed.
            p.next = (p == slow) ? null : p.next;

            // Move p and q to the next nodes in the list.
            p = q;
            q = tmp;
        }

        // Merge the first half of the list with the reversed second half,
        // alternating between the two halves.
        ListNode headNode = head;
        ListNode tailNode = p;
        while (tailNode != null && headNode != null) {
            // Store the next node in the first half of the list.
            ListNode headTemp = headNode.next;

            // Link the current node in the first half to the current node in the
            // reversed second half of the list.
            headNode.next = tailNode;

            // Store the next node in the reversed second half of the list.
            ListNode tailTemp = tailNode.next;

            // Link the current node in the reversed second half of the list to the
            // next node in the first half of the list.
            tailNode.next = headTemp;

            // Move the pointers to the next nodes in the two halves of the list.
            headNode = headTemp;
            tailNode = tailTemp;
        }
    }
}
