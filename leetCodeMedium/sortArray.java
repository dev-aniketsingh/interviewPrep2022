class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n: nums){
            pq.add(n);
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = pq.peek();
            pq.remove();
        }
        return nums;
    }
}