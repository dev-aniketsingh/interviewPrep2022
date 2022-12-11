class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start at the first node in the list.
        ListNode currentNode = head;

        // If the list is empty, there are no duplicates to remove.
        if (head == null) return null;

        // Loop through the list and remove any duplicate nodes.
        while (currentNode != null && currentNode.next != null) {
            // If the current node and the next node have the same value,
            // set the next pointer of the current node to the node after the next one,
            // effectively removing the duplicate node from the list.
            // Otherwise, move to the next node in the list.
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}
