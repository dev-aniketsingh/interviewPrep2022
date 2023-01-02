class Solution {
    public int minPartitions(String n) {
        char ch = '0';

        for(int i = 0; i < n.length(); ++i)
            if(n.charAt(i) > ch)
                ch = n.charAt(i);

        return ch-'0';  
    }
}