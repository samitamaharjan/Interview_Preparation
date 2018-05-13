package com.interview.linkedlist.queue;

import com.interview.linkedlist.MyLinkedList;

public class MyQueue implements IMyQueue {
	
	MyLinkedList myQueue = new MyLinkedList();
	
	@Override
	public void enqueue(int value) {
		myQueue.addToHead(value);	
	}

	@Override
	public int dequeue() {
		return myQueue.removeFromTail();		
	}

	@Override
	public int peek() {
		return myQueue.readFromTail();
	}

	@Override
	public boolean isEmpty() {
		if (myQueue.size() == 0) return true;
		return false;
	}

	@Override
	public int size() {
		return myQueue.size();
	}
	
	 
}
