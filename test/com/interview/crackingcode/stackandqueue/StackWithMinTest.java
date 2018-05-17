package com.interview.crackingcode.stackandqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackWithMinTest {
	
	/* * push(5); // stack is {5}, min is 5
	 * push(6); // stack is {6, 5}, min is 5
	 * push(3); // stack is {3, 6, 5}, min is 3
	 * push(7); // stack is {7, 3, 6, 5}, min is 3
	 * pop(); // pops 7. stack is {3, 6, 5}, min is 3
	 * pop(); // pops 3. stack is {6., 5}, min is 5.
*/	 
	 @Test
	 public void test1() {
		StackWithMin stack = new StackWithMin();
		stack.push(5);
		assertEquals(5, stack.getMin());
		
		stack.push(6);
		assertEquals(5, stack.getMin());
		
		stack.push(3);
		assertEquals(3, stack.getMin());
		
		stack.push(7);
		assertEquals(3, stack.getMin());
		
		stack.pop();
		assertEquals(3, stack.getMin());
		
		stack.pop();
		assertEquals(5, stack.getMin());
		
	}
}
