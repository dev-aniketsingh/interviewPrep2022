class Solution {
    public int maxArea(int[] height) {
        int size = height.length - 1;
        int start = 0;
        int end = size;                
        int res = 0;
        while(start < end) {
            int area = Math.min(height[start], height[end]) * Math.abs(start-end);
            res = Math.max(area,res);
            if(height[start] < height[end]) {
                start++;
            }
            else 
                end--;
        }
        
    return res;
    }
    
}