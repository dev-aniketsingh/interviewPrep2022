public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int countBit = 0;
        while(n != 0) {
           int lastBit = n & 1;
           countBit += lastBit;
           n = n >>> 1;
        }
        return countBit;
    }
}