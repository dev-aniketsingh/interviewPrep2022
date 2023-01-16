class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0, currentMax = 0;
        for(int i = 0; i < sentences.length; i++) {
            String[] splited = sentences[i].split(" ");
            currentMax = splited.length;
            max = Math.max(currentMax,max);
        }
        return max;
    }
}