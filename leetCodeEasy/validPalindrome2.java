class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        int count1 = 0;
        
        while(start < end) {
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }
            else {
                start++;
                count1++;
            }
        }
        if(count1 <= 1) 
            return true;
         start = 0;
         end = s.length() - 1;
        int count2 = 0;
         while(start < end) {
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }
            else {
                end--;
                count2++;
            }   
        }
        if(count2 <= 1)
            return true;
        
        return false;
    }
}