class Solution {
    public int lengthOfLastWord(String s) {
        String[] splited = s.split("\\s+");
        int len = (splited[splited.length-1]).length();
    return len;
    }
}