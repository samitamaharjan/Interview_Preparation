package com.interview.crackingcode.stackandqueue;

import com.interview.linkedlist.Node;

public class NodeStack implements INodeStack{
	Node head;
	int count;
	
	@Override
	public void push(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		count++;
	}

	@Override
	public int pop() {
		if (head == null) return -999;
		
		Node node = head;
		int value = node.value;
		head = node.next;
		node = null;
		count--;
		return value;
	}

	@Override
	public int peek() {
		if (head == null) return -999;
		
		return head.value;
	}

	@Override
	public int size() {
		return count;
	}
	
	
}
