class Solution {
    
    public boolean isPalindrome(int x) {
        String s= Integer.toString(x);
        StringBuilder s2 = new StringBuilder();
          s2.append(s);
          s2.reverse();
        return s.equals(s2.toString());
    }
}
