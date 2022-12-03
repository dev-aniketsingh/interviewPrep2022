class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) 
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(words[i])) 
                    return false;
            } 
            else {
                if (map.values().contains(words[i])) 
                    return false;
                map.put(c, words[i]);
            }
        }
        return true;
    }
}