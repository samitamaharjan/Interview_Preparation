package com.interview.crackingcode.arrayandstring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CombineUniqueCharTest {
	
	@Test
	public void test1() {
		assertEquals("samithrjn", CombineUniqueChar.combineChar("samita", "maharjan"));
		assertEquals("catb", CombineUniqueChar.combineChar("Cat", "Bat"));
	}
}
