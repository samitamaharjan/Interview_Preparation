package com.interview.crackingcode.arrayandstring;

public class RemoveDuplicate {

	public static void main(String[] args) {
		System.out.println(removeDuplicates("geeksforgeeks"));
		System.out.println(removeDuplicates("geeks for geeks"));
	}
	
	public static String removeDuplicates(String str) {
		StringBuilder sb = new StringBuilder();
		
		int[] chArr = new int[256];
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int index = ch;
			
			if (chArr[index] == 0) {
				sb.append(String.valueOf(ch));
				chArr[index] = 1;
			}
		}
		return sb.toString();
	}
}
