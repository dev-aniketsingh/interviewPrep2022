class Solution {
    public int[] countBits(int n) {
      int[] res = new int[n+1];
      for(int i = 0; i < res.length; i++) {
          res[i] = Bits(i);
      }  
      return res;
    }

    public static int Bits(int n){
        int count = 0;
       while(n!=0){
            count+=(n&1);
            n=n>>1;
       }
       return count;
    }
}