class Solution {
    public Node copyRandomList(Node head) {
        Node newHead = head;
        if(head == null)
            return null;
        while(newHead != null) {
            Node tmp = newHead.next;
            newHead.next = new Node(newHead.val);
            newHead.next.next = tmp;
            newHead = tmp;
        }

        newHead = head;
        while(newHead != null) {
            if(newHead.random != null)
                newHead.next.random = newHead.random.next;
            newHead = newHead.next.next;
        }

        newHead = head;
        Node copy = head.next;
        Node temp = copy;
        while(newHead != null) {
            newHead.next = newHead.next.next;
            newHead = newHead.next;
            temp.next = temp.next != null ? temp.next.next : temp.next;
            temp = temp.next;
        }
        return copy;
    }
}