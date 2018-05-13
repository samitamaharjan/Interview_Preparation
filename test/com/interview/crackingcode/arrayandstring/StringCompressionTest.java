package com.interview.crackingcode.arrayandstring;

import org.junit.Assert;
import org.junit.Test;

public class StringCompressionTest {
	
	@Test
	public void test1() {
		Assert.assertEquals("a2b1c4d2", StringCompression.compressString("aabccccdd"));
		Assert.assertEquals("abcdef", StringCompression.compressString("abcdef"));
		Assert.assertEquals("a5", StringCompression.compressString("aaaaa"));
	}
}
