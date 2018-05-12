package com.interview.linkedlist;

public interface IMyLinkedList {
	public void addToHead(int value);
	public void addToTail(int value);
	public int removeFromHead();
	public int removeFromTail();
	public int readFromHead();
	public int readFromTail();
	public int size();
	public int get(int index);
}
