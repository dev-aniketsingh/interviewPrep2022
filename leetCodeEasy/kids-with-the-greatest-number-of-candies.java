class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        int max = 0;
        for(int i = 0; i < len; i++) {
            max = Math.max(candies[i],max);
        }
        List<Boolean> list = new ArrayList<Boolean>(len);
        for(int i = 0; i < len; i++) {
            if((candies[i] + extraCandies) >= max) {
                list.add(true);
            }
            else 
                list.add(false);
        }

        return list;
    }

}