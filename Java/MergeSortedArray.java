/**
 *	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 *	Note:
 *	You may assume that nums1 has enough space (size that is greater or equal to m + n) 
 *	to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 *
 *
 *	Author: matao
 */

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = m+n-1;
        while(i >= 0 && j >=0) {
            if(nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while(i >= 0)
            nums1[k--] = nums1[i--];
        while(j >= 0)
            nums1[k--] = nums2[j--];
    }

    public static void main(String[] args) {
    	int[] nums1 = new int[5];
    	nums1[0] = 1;
    	nums1[1] = 2;
    	int[] nums2 = {3, 4, 5};
    	merge(nums1, 2, nums2, 3);
    	for (int num : nums1) {
    		System.out.print(num + " ");
    	}
    	System.out.println();
    }
}