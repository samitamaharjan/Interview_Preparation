package com.interview.crackingcode.arrayandstring;

public class CountPalindrome {
	
	public static int countPalindrome(String sentence) {
		String[] str = sentence.split("\\s+");
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (isPalindrome(str[i])) count++;
		}
		return count;
	}

	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int len = s.length();
		for (int i = 0; i <= len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) return false; //Madam // 0, 4
		}
		return true;
	}

}
