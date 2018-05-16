package com.interview.crackingcode.stackandqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NodeStackTest {
	
	@Test
	public void test1() {
		NodeStack stack = new NodeStack(); 
		stack.push(4); // 4
		stack.push(5); // 4, 5
		assertEquals(5, stack.pop()); // 4
		stack.push(6); // 4, 6
		assertEquals(2, stack.size()); 
		assertEquals(6, stack.peek()); // 4, 6
		assertEquals(6, stack.peek());
		stack.push(1); // 4, 6 , 1
		assertEquals(1, stack.peek()); // 4, 6, 1
		assertEquals(1, stack.pop()); // 4, 6
		assertEquals(6, stack.pop()); // 4
		assertEquals(4, stack.pop()); // EMPTY
		assertEquals(-999, stack.pop());
		assertEquals(-999, stack.peek());
	}

}
