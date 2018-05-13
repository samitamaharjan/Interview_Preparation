package com.interview.linkedlist.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MyStackTest {
	
	@Test
	public void testPush() {
		MyStack stack = new MyStack();
		stack.push(1); // 1
		stack.push(2); // 2 -> 1
		stack.push(3); // 3 -> 2 -> 1
		assertEquals(3, stack.size());
	}
	
	@Test
	public void testPop() {
		MyStack stack = new MyStack();
		stack.push(1); // 1
		stack.push(2); // 2 -> 1
		stack.push(3); // 3 -> 2 -> 1
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
		assertEquals(-1, stack.pop());
	}
	
	@Test
	public void testPeek() {
		MyStack stack = new MyStack();
		stack.push(1); // 1
		stack.push(2); // 2 -> 1
		stack.push(3); // 3 -> 2 -> 1
		assertEquals(3, stack.peek());
		assertEquals(3, stack.pop());
		assertEquals(2, stack.peek());
	}
	
	@Test
	public void testIsEmpty() {
		MyStack stack = new MyStack();
		stack.push(1); // 1
		stack.push(2); // 2 -> 1
		stack.push(3); // 3 -> 2 -> 1

		assertEquals(3, stack.pop());
		assertEquals(false, stack.isEmpty());
		assertEquals(2, stack.pop());
		assertEquals(false, stack.isEmpty());
		assertEquals(1, stack.pop());
		assertEquals(true, stack.isEmpty());
	}
	
	@Test
	public void testSize() {
		MyStack stack = new MyStack();
		stack.push(1); // 1
		assertEquals(1, stack.size());
		
		stack.push(2); // 2 -> 1
		assertEquals(2, stack.size());
		
		stack.push(3); // 3 -> 2 -> 1
		assertEquals(3, stack.size());
		
		
	}
}
