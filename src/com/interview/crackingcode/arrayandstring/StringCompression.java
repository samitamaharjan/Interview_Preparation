package com.interview.crackingcode.arrayandstring;

/*
 * Implement a method to perform basic string compression using the counts of
repeated characters. For example, the string aabcccccaaa would become
a2blc5a3. If the "compressed" string would not become smaller than the original
string, your method should return the original string.
 */

public class StringCompression {
	
	public static String compressString(String str) {
		int count = 1; 
		String output = "";
		int i = 0;
		for (i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) count++;
			else {
				output += String.valueOf(str.charAt(i)) + count;
				count = 1;
			}
		}
		output += String.valueOf(str.charAt(i)) + count;
		if (output.length() > str.length()) return str;
		return output;
	}
}
