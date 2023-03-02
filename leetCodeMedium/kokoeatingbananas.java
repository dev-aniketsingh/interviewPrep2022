class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
         while(left < right) {
            int mid = (left+right)/2;
            int total = 0;

            for(int pile: piles) {
                total += Math.ceil((double)pile/mid);
            }

            if(total > h) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}