package com.interview.crackingcode.arrayandstring;

/*
 * Write a method to replace all spaces in a string with '%20'. You may assume that the
string has sufficient space at the end of the string to hold the additional characters,
and that you are given the "true" length of the string. (Note: if implementing inJava,
please use a character array so that you can perform this operation in place.)
*/

public class ReplaceSpaceWithString {
	
	public static char[] repalceWithString(char[] charArr, int lengthOfString) {
		int countSpace = 0;
		
		for(int i = 0; i < lengthOfString; i++) {
			if (charArr[i] == ' ') countSpace++;
		}
		
		int newLengthOfString = lengthOfString + 2 * countSpace; 
				
		for (int i = lengthOfString - 1, j = newLengthOfString - 1; i != j; i--) {
			if (charArr[i] != ' ') {
				charArr[j] = charArr[i];
				j--;
			} else {
				charArr[j] = '0';
				charArr[j - 1] = '2';
				charArr[j - 2] = '%';
				j = j - 3;
			}
		}
		
		return charArr;
	}
}
