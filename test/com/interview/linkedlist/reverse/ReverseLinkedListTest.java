package com.interview.linkedlist.reverse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.interview.linkedlist.Node;

public class ReverseLinkedListTest {
	Node head;
	
	@Before
	public void setup() {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		head = node1;
	}
	
	@Test
	public void test1() {
		head = ReverseLinkedList.reverse(head);
		assertEquals(5, head.value);
		assertEquals(4, head.next.value);
		assertEquals(3, head.next.next.value);
		assertEquals(2, head.next.next.next.value);
		assertEquals(1, head.next.next.next.next.value);
	}
	
	@Test
	public void test2() {
		Node nullNode = ReverseLinkedList.reverse(null);
		assertNull(nullNode);
	}
}
