package com.interview.crackingcode.arrayandstring;

//Implement an algorithm to determine if a string has all unique characters. What if
// you cannot use additional data structures?

public class UniqueCharacter {
	
	public static boolean uniqueChar(String str) {
		int[] ch = new int[256];
		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i);
			if (ch[index] == 1) return false;
			ch[index] = 1;
		}
		return true;
	}
}
