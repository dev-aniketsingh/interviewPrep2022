class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures == null || temperatures.length == 0) {
            return new int[]{};
        }
        Stack<Integer> s = new Stack<>(); // store idx
        int[] ans = new int[temperatures.length];
        for(int i=temperatures.length-1; i>=0; i--) {
            int days = 0;
            while(!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]) {
                s.pop();
            }
            if(!s.isEmpty()) {
                days = s.peek()-i;
            }
                s.push(i);
                ans[i] = days;
            }
                
            return ans;
    }
}