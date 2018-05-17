package com.interview.crackingcode.stackandqueue;

import java.util.Stack;

/*
 * How would you design a stack which, in addition to push and pop, also has a
 * function min which returns the minimum element? Push, pop and min should all
 * operate in 0(1) time.
 * push(5); // stack is {5}, min is 5
 * push(6); // stack is {6, 5}, min is 5
 * push(3); // stack is {3, 6, 5}, min is 3
 * push(7); // stack is {7, 3, 6, 5}, min is 3
 * pop(); // pops 7. stack is {3, 6, 5}, min is 3
 * pop(); // pops 3. stack is {6., 5}, min is 5.
 *  
 */

public class StackWithMin extends Stack<NodeWithMin>{
		
	public void push(int value) {
		int newMin = Math.min(value, getMin());
		super.push(new NodeWithMin(value, newMin));
	}
	
	public int getMin() {
		if (this.isEmpty()) {
			return Integer.MAX_VALUE; // Error value
		} else {
			return this.peek().min; // min of NodeWithMin
		}
	}
}

class NodeWithMin {
	public int value;
	public int min;
	public NodeWithMin(int value, int min) {
		this.value = value;
		this.min = min;
	}
}
