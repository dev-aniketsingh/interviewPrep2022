class Solution {
    public ListNode swapPairs(ListNode head) {
        // if the list is empty or contains only one element,
        // there's nothing to do
        if(head==null||head.next==null) {
            return head;
        }  

        // the new head of the list will be the second element
        // of the original list
        ListNode newHead = head.next;

        // we will keep track of the previous pair of nodes,
        // the current pair of nodes, and the next pair of nodes
        ListNode prev = null;
        ListNode first = head;
        ListNode second = head.next;

        // continue as long as there are more pairs of nodes
        while( first != null && second != null) {
            // link the first node of the current pair to the
            // first node of the next pair
            first.next = second.next;

            // link the second node of the current pair to the
            // first node of the current pair
            second.next = first;

            // if we've processed a previous pair, link the
            // second node of that pair to the second node of
            // the current pair
            if(prev != null) {
                prev.next = second;   
            }

            // if there are no more pairs of nodes, we're done
            if(first.next == null) {
                break;
            }

            // move to the next pair of nodes
            prev = first;
            first = first.next;
            second = first.next;
        }

        // return the new head of the list
        return newHead;
    }
}