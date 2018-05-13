package com.interview.linkedlist.queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MyQueueTest {
	
	@Test
	public void testEnqueue() {
		MyQueue queue = new MyQueue();
		queue.enqueue(1); // 1
		queue.enqueue(2); // 2 -> 1
		queue.enqueue(3); // 3 -> 2 -> 1
		assertEquals(3, queue.size());
	}
	
	@Test
	public void testDequeue() {
		MyQueue queue = new MyQueue();
		queue.enqueue(1); // 1
		queue.enqueue(2); // 2 -> 1
		queue.enqueue(3); // 3 -> 2 -> 1
		
		assertEquals(1, queue.dequeue());
		assertEquals(2, queue.dequeue());
		assertEquals(3, queue.dequeue());
		//assertEquals(-1, queue.dequeue());
	}
	
	@Test
	public void testPeek() {
		MyQueue queue = new MyQueue();
		queue.enqueue(1); // 1
		queue.enqueue(2); // 2 -> 1
		queue.enqueue(3); // 3 -> 2 -> 1
		assertEquals(1, queue.dequeue());
		assertEquals(2, queue.peek());
		
		assertEquals(2, queue.dequeue());
		assertEquals(3, queue.peek());
		
		assertEquals(3, queue.dequeue());
		assertEquals(-1, queue.peek());
	}
	
	@Test
	public void testIsEmpty() {
		MyQueue queue = new MyQueue();
		queue.enqueue(1); // 1
		queue.enqueue(2); // 2 -> 1
		queue.enqueue(3); // 3 -> 2 -> 1

		assertEquals(1, queue.dequeue());
		assertEquals(false, queue.isEmpty());
		assertEquals(2, queue.dequeue());
		assertEquals(false, queue.isEmpty());
		assertEquals(3, queue.dequeue());
		assertEquals(true, queue.isEmpty());
	}
	
	@Test
	public void testSize() {
		MyQueue queue = new MyQueue();
		queue.enqueue(1); // 1
		assertEquals(1, queue.size());
		
		queue.enqueue(2); // 2 -> 1
		assertEquals(2, queue.size());
		
		queue.enqueue(3); // 3 -> 2 -> 1
		assertEquals(3, queue.size());
		
		
	}
}
