
package Arrays;

import java.util.Arrays;

public class MergeSortedAarray {
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0}; 
       int[] nums2 = {2,5,6};
       new Solution().merge(nums1, 3, nums2, 3);
    }
    
}

class Solution{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
        for (int num : nums1) {
            System.out.println(num);
        }
    }
    
}