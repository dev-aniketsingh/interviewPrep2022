
//Not efficient solution
class Solution {
    public boolean isPalindrome(ListNode head) {
        // Create an array to store the nodes in the list.
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        
        // Loop through the list and add each node to the array.
        ListNode iterator = head;
        while (iterator != null) {
            list.add(iterator);
            iterator = iterator.next;
        }
        
        // Compare the values of the nodes at the start and end of the list.
        int end = list.size() - 1;
        int start = 0;
        while (start < end) {
            if (list.get(start).val != list.get(end).val) {
                // If the values are not the same, the list is not a palindrome.
                return false;
            }
            start++;
            end--;
        }
        
        // If all of the nodes are the same in both directions, the list is a palindrome.
        return true;
    }
}


//most optimal solution
class Solution {
    public boolean isPalindrome(ListNode head) {
       // Use two pointers to traverse the list from the start and end.
        ListNode fast = head;
        ListNode slow = head;

        // Move the fast pointer to the last node in the list.
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // If the fast pointer is not null, the list has an odd number of nodes,
        // so move the slow pointer to the middle node.
        if (fast != null) slow = slow.next;

        // Reverse the second half of the list.
        slow = reverse(slow);

        // Compare the values of the nodes in the first and second half of the list.
        while (slow != null && head.val == slow.val) {
            head = head.next;
            slow = slow.next;
        }

        // If all of the nodes are the same in both directions, the list is a palindrome.
        return slow == null;
    }

    private ListNode reverse(ListNode head) {
        // Reverse the list by changing the next pointers of the nodes.
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
