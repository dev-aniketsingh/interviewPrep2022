class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      // Create a new empty list to store the merged list.
        ListNode mergedList = new ListNode();
        ListNode currentNode = mergedList;
        
        // Loop until one of the lists is empty.
        while (l1 != null && l2 != null) {
            // Compare the values of the nodes at the head of each list.
            if (l1.val < l2.val) {
                // Append the smaller node to the end of the merged list.
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }
            
            // Move to the next node in the merged list.
            currentNode = currentNode.next;
        }
        
        // Append the remaining nodes from the non-empty list to the end of the merged list.
        if (l1 != null) currentNode.next = l1;
        if (l2 != null) currentNode.next = l2;
        
        return mergedList.next;
    }
}

//recursive:
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // If one of the lists is empty, return the other list.
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        // Compare the values of the nodes at the head of each list.
        if (l1.val < l2.val) {
            // Append the smaller node to the end of the other list.
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}