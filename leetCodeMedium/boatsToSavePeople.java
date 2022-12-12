class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int len = people.length;
        int start = 0, end = len-1;
        int count = 0;
        while(start <= end) {
            if(people[start] + people[end] > limit) {
                count++;
                end--;
            }
            else {
                count++;
                start++;
                end--;
            }
        }
        return count;
    }
}