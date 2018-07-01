package com.interview.crackingcode.arrayandstring;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 4};
		int[] nums2 = {5, 6, 7};
		int[] nums3 = merge(nums1, 4, nums2, 3);
		Set<Integer> set1 = merge1(nums1, 4, nums2, 3);
		System.out.println(Arrays.toString(nums3));
		System.out.println(set1.toString());
		
		int[] nums4 = {1, 2};
		int[] nums5 = {2, 3, 4};
		int[] nums6 = merge(nums4, 2, nums5, 3);
		Set<Integer> set2 = merge1(nums4, 2, nums5, 3);
		System.out.println(Arrays.toString(nums6));
		System.out.println(set2.toString());
	}
	
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] nums3 = new int[n + m];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else 
                nums3[k++] = nums2[j++];
        }

        while (i < m) {
            nums3[k++] = nums1[i++];
        }

        while (j < n) {
            nums3[k++] = nums2[j++];
        }
        
        return nums3;
    }
	
	public static Set<Integer> merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        Set<Integer> set = new HashSet<>();

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                set.add(nums1[i++]);
            } else 
                set.add(nums2[j++]);
        }

        while (i < m) {
           set.add(nums1[i++]);
        }

        while (j < n) {
            set.add(nums2[j++]);
        }
        
        return set;
    }
}
