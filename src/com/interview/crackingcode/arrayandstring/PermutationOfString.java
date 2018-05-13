package com.interview.crackingcode.arrayandstring;

//  Given two strings, write a method to decide if one is a permutation of the other
public class PermutationOfString {
	
	public static void main (String[] args) {
		String s1 = "samita ";
		String s2 = "itamas";
		System.out.println(isPermutation(s1, s2));
	}
	
	
	public static boolean isPermutation(String str1, String str2) {
		if (str1.length() != str2.length()) return false;
		int[] strArr1 = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			int index = str1.charAt(i);
			strArr1[index]++;
		}

		for (int i = 0; i < str2.length(); i++) {
			int index = str2.charAt(i);
			if (--strArr1[index] < 0) return false;
		} 
		return true;
	}
}
