package com.interview.linkedlist;

public class MyLinkedList implements IMyLinkedList {
	private Node head;
	private Node tail;
	private int count = 0;
	
	@Override
	public void addToHead(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
		count++;
	}

	@Override
	public void addToTail(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
		} else { 
			tail.next = node;
			tail = node;
		}
		count++;
	}

	@Override
	public int removeFromHead() {
		if (head == null) return -1; //TODO throw exception
				
		int n = head.value;
		Node node = head;
		
		if (head.next != null) {
			head = node.next;
			node = null;
		} else {
			head = null;
			tail = null;
		}
		count--;
		return n;
	}

	@Override
	public int removeFromTail() {
		if (head == null) return -1; //TODO throw exception
		Node node = head;
		
		if (count == 1) {
			int n = node.value;
			head = null;
			tail = null;
			count--;
			return n;
		}
		
		while (node.next.next != null) {
			node = node.next;
		}
		int n = node.next.value;
		tail = node;
		node.next = null;
		count--;
		return n;
	}

	@Override
	public int readFromHead() {
		if (head == null) return -1;
		return head.value;
	}

	@Override
	public int readFromTail() {
		if (head == null) return -1;
		return tail.value;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public int get(int index) {
		if (index > count) return -1;
		
		int i = 0;
		Node node = head;
		while (i < index) {
			node = node.next;
			i++;
		}
		return node.value;
	}

}
