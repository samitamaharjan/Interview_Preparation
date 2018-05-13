package com.interview.linkedlist.stack;

import com.interview.linkedlist.MyLinkedList;

public class MyStack implements IMyStack {
	MyLinkedList myStack = new MyLinkedList();
	
	@Override
	public void push(int value) {
		myStack.addToHead(value);
	}

	@Override
	public int pop() {
		return myStack.removeFromHead();
	}

	@Override
	public int peek() {
		return myStack.readFromHead();
	}

	@Override
	public boolean isEmpty() {
		if (myStack.size() == 0) return true;
		return false;
	}

	@Override
	public int size() {
		return myStack.size();
	}

}
