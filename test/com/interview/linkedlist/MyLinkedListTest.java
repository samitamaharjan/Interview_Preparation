package com.interview.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyLinkedListTest {
	
	MyLinkedList myLinkedList = new MyLinkedList();
	
	@Test
	public void testAddToHead() {
		myLinkedList.addToHead(1);
		assertEquals(1, myLinkedList.size());
		assertEquals(1, myLinkedList.readFromHead());
		
		myLinkedList.addToHead(3);
		assertEquals(2, myLinkedList.size());
		assertEquals(3, myLinkedList.readFromHead());
		
	}
	
	@Test
	public void testAddToTail() {
		myLinkedList.addToTail(5);
		assertEquals(1, myLinkedList.size());
		assertEquals(5, myLinkedList.readFromTail());
		
		myLinkedList.addToTail(4);
		assertEquals(2, myLinkedList.size());
		assertEquals(4, myLinkedList.readFromTail());
	}
	
	@Test
	public void testRemoveFromHead() {
		myLinkedList.addToTail(5); // 5
		myLinkedList.addToHead(1); // 1 -> 5
		myLinkedList.addToHead(3); // 3 -> 1 -> 5
		myLinkedList.addToTail(4); // 3 -> 1 -> 5 -> 4

		assertEquals(4, myLinkedList.size());
		
		int val1 = myLinkedList.removeFromHead();
		assertEquals(3, val1);
		assertEquals(3, myLinkedList.size());
		
		int val2 = myLinkedList.removeFromHead(); 
		assertEquals(1, val2);
		assertEquals(2, myLinkedList.size());
	}
	
	@Test
	public void testRemoveFromTail() {
		myLinkedList.addToTail(5); // 5
		myLinkedList.addToHead(1); // 1 -> 5
		myLinkedList.addToHead(3); // 3 -> 1 -> 5
		myLinkedList.addToTail(4); // 3 -> 1 -> 5 -> 4

		assertEquals(4, myLinkedList.size());
		
		int val1 = myLinkedList.removeFromTail();
		assertEquals(4, val1);
		assertEquals(3, myLinkedList.size());
		
		int val2 = myLinkedList.removeFromTail(); 
		assertEquals(5, val2);
		assertEquals(2, myLinkedList.size());
	}
	
	@Test
	public void testReadFromHead() {
		myLinkedList.addToTail(5); // 5
		myLinkedList.addToHead(1); // 1 -> 5
		myLinkedList.addToHead(3); // 3 -> 1 -> 5
		myLinkedList.addToTail(4); // 3 -> 1 -> 5 -> 4

		assertEquals(4, myLinkedList.size());
		
		int val1 = myLinkedList.removeFromHead();
		assertEquals(3, val1);
		assertEquals(1, myLinkedList.readFromHead());
		
		int val2 = myLinkedList.removeFromHead(); 
		assertEquals(1, val2);
		assertEquals(5, myLinkedList.readFromHead());
	}
	
	@Test
	public void testReadFromTail() {
		myLinkedList.addToTail(5); // 5
		myLinkedList.addToHead(1); // 1 -> 5
		myLinkedList.addToHead(3); // 3 -> 1 -> 5
		myLinkedList.addToTail(4); // 3 -> 1 -> 5 -> 4

		assertEquals(4, myLinkedList.size());
		
		int val1 = myLinkedList.removeFromTail();
		assertEquals(4, val1);
		assertEquals(5, myLinkedList.readFromTail());
		
		int val2 = myLinkedList.removeFromTail(); 
		assertEquals(5, val2);
		assertEquals(1, myLinkedList.readFromTail());
	}
	
	@Test
	public void testSize() {
		myLinkedList.addToTail(5); // 5
		myLinkedList.addToHead(1); // 1 -> 5
		myLinkedList.addToHead(3); // 3 -> 1 -> 5
		myLinkedList.addToTail(4); // 3 -> 1 -> 5 -> 4

		assertEquals(4, myLinkedList.size());
		
		int val1 = myLinkedList.removeFromTail();
		assertEquals(4, val1);
		assertEquals(5, myLinkedList.readFromTail());
		assertEquals(3, myLinkedList.size());
		
		int val2 = myLinkedList.removeFromTail(); 
		assertEquals(5, val2);
		assertEquals(1, myLinkedList.readFromTail());
		assertEquals(2, myLinkedList.size());
	}
	
	@Test
	public void testGet() {
		myLinkedList.addToTail(5); // 5
		myLinkedList.addToHead(1); // 1 -> 5
		myLinkedList.addToHead(3); // 3 -> 1 -> 5
		myLinkedList.addToTail(4); // 3 -> 1 -> 5 -> 4
		
		assertEquals(3, myLinkedList.get(0));
		assertEquals(1, myLinkedList.get(1));
		
		myLinkedList.addToHead(9); // 9 -> 3 -> 1 -> 5 -> 4
		assertEquals(9, myLinkedList.get(0));
		
		myLinkedList.addToTail(10); // 9 -> 3 -> 1 -> 5 -> 4 -> 10
		assertEquals(10, myLinkedList.get(5));
		
	}
}
