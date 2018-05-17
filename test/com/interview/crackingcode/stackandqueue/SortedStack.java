package com.interview.crackingcode.stackandqueue;

import java.util.Stack;

// Write a program to sort a stack in ascending order (with biggest items on top).
// This algorithm is0(N2) time and 0(N) space.

public class SortedStack {
	public static Stack<Integer> sort(Stack<Integer> s) {
		Stack<Integer> r = new Stack<Integer>();
		while (!s.isEmpty()) {
			int tmp = s.pop();
			while (!r.isEmpty() && r.peek() > tmp) {
				r.push(s.pop());
			}
			r.push(tmp);
		}
		return r;
	}
}
