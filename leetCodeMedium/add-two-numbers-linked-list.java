import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        while(l1 != null || l2 != null) {
            if(l1 != null) {
                sb1.append(l1.val);
                l1 = l1.next;
            }
            if(l2 != null) {
                sb2.append(l2.val);
                l2 = l2.next;
            }
        }
        BigInteger b1 = new BigInteger(sb1.reverse().toString());
        BigInteger b2 = new BigInteger(sb2.reverse().toString());
        BigInteger b = b1.add(b2);
        StringBuilder res = new StringBuilder(b.toString());
        res.reverse();
        String sum = res.toString();
        ListNode node = null;
        ListNode head = null;
        
        for(char i: sum.toCharArray()){
            int num = Integer.parseInt(String.valueOf(i));
            ListNode temp =  new ListNode(num,null);
            if(node == null){
                node = temp;
                head = node;

            }else{
                node.next = temp;
                node = temp;
            }
        }
        return head;




    }
}