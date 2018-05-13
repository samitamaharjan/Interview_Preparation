package com.interview.crackingcode.arrayandstring;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ReplaceSpaceWithStringTest {
	
	@Test
	public void test1() {
		char[] input = 			{'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		char[] expectedOutput = {'h', 'e', 'l', 'l', 'o', '%', '2', '0', 'w', 'o', 'r', 'l', 'd', ' ', ' ', ' ', ' ', ' ', ' '};
		char[] output = ReplaceSpaceWithString.repalceWithString(input, 11);
		assertArrayEquals(expectedOutput, output);
	}
}
