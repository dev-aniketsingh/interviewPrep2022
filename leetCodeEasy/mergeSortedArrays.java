class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        for(int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }
        int size = m+n;
        int count = 0;
        for(int i = m; i < size; i++) {
            temp[i] = nums2[count++];
        }
        Arrays.sort(temp);
        for(int i = 0; i < nums1.length; i++) {
            nums1[i] = temp[i];
        }
    }
}


//*Shorter version */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        int size = m+n;
        for(int i = m; i < size; i++) {
            nums1[i] = nums2[count++];
        }
        Arrays.sort(nums1);
    }
}