class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] sol = new int[nums1.length];
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums2) {
            while(!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(),num);
            }
            stack.add(num);
        }
        int count = 0;
        for(int num: nums1) {
            sol[count++] = map.getOrDefault(num,-1);
        }
        
        return sol;
    }
}