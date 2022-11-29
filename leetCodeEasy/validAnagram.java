class Solution {
    public boolean isAnagram(String s, String t) {
       char[] ar = s.toCharArray();
       char[] ar2 = t.toCharArray();
        Arrays.sort(ar);
        Arrays.sort(ar2);
        String sorted = new String(ar);
        String sorted2 = new String(ar2);

        return sorted.equals(sorted2);
    }
}