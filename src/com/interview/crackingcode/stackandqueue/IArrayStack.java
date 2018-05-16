package com.interview.crackingcode.stackandqueue;

public interface IArrayStack {
	public boolean push(int val); // returns false if the array is full and the element can not be inserted.
	public int pop();
	public int peek();
	public int size();
}
