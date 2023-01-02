class Solution {
    public boolean detectCapitalUse(String word) {
        int countUpperCase = 0;
        for(char c: word.toCharArray()) {
            if(Character.isUpperCase(c))
                countUpperCase++;
        }
        if(countUpperCase == word.length() || countUpperCase == 0)
            return true;
        else if(countUpperCase == 1 && Character.isUpperCase(word.charAt(0)))
            return true;
        return false;
    }
}