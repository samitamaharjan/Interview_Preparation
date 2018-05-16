package com.interview.crackingcode.arrayandstring;

import java.util.HashSet;
import java.util.Set;

public class CombineUniqueChar {
	
	public static String combineChar(String s1, String s2) {
		StringBuilder s = new StringBuilder();
		String ss = s1.toLowerCase() + s2.toLowerCase();
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < ss.length(); i++) {
			String letter = String.valueOf(ss.charAt(i));
			if (!set.contains(letter)) {
				s.append(letter);
				set.add(letter);
			}
		}
		return s.toString();
	}
}
