package com.interview.crackingcode.arrayandstring;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] result = rotateLeftInplace(arr, 2); 
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] rotateLeftInplace(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int tmp = arr[0];
            int pt1 = 0; int pt2 = 1;
            while(pt1 < arr.length - 1) {
                arr[pt1] = arr[pt2];
                pt1++;
                pt2++;
            }
            arr[arr.length - 1] = tmp;
        }
        return arr;
    }
	
	public static int[] rotateLeft(int[] arr, int n) {
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = n; i < arr.length; i++) {
            newArr[j] = arr[i];            
            j++;
        }
        
        for (int i = 0; i < n; i++) {
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }
}
