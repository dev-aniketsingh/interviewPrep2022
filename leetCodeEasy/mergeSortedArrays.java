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

/*beats 100% */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int start = m+n-1;
       for (int i = start, a = m-1, b = n-1; b>=0; i--) {
            if (a >= 0 && nums1[a] > nums2[b]) 
                nums1[i] = nums1[a--]; 
            else 
                nums1[i] = nums2[b--];
	    }    
    }
}