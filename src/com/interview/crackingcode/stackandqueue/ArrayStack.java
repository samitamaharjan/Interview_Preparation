package com.interview.crackingcode.stackandqueue;

public class ArrayStack implements IArrayStack {
	private int[] arr;
	private int pos;
	
	public ArrayStack(int len) {
		arr = new int[len];
	} 
	
	@Override
	public boolean push(int val) {
		if (pos >= arr.length) return false;
		arr[pos] = val;
		pos++;
		return true;
	}

	@Override
	public int pop() {
		if (pos == 0) return -999;
		pos--;
		return arr[pos];
	}

	@Override
	public int peek() {
		if (pos == 0) return -999;
		return arr[pos - 1];
	}

	@Override
	public int size() {
		return pos;
	}
	
}
