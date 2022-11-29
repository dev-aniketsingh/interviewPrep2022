class Solution {
    public int[] replaceElements(int[] arr) {
            int max = -1;
            int size = arr.length - 1;
            for(int i = size; i > - 1; --i) {
                int tmp = arr[i];
                arr[i] = max;
                if(tmp > max) {
                       max = tmp;
                }
            }
        return arr;
    }
}