class Solution {
    public int mySqrt(int x) {
        if(x==1)
            return 1;
        double start = 0;
        double end = x;
        double mid = 0;
        int ans=0;
        while((int)end-(int)start>=1)
        {
            mid = start + (end-start)/2;
            if((mid*mid)<=x)
            {
                start = mid;
                ans = (int)mid;
            }
            else
                end = mid;
        }

        return ans;

    }
}