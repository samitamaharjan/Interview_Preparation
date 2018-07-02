package com.interview.iterator;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class EvenIteratorTest {
	
	@Test
	public void test1() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		EvenIterator itr = new EvenIterator(list);
		
		Assert.assertTrue(itr.hasNext());
		Assert.assertEquals(2, itr.next().intValue());
		Assert.assertTrue(itr.hasNext());
		Assert.assertEquals(4, itr.next().intValue());
		Assert.assertTrue(itr.hasNext());
		Assert.assertEquals(6, itr.next().intValue());
		Assert.assertFalse(itr.hasNext());
	}
}
