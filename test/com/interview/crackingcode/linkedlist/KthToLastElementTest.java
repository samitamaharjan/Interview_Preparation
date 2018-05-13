package com.interview.crackingcode.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.interview.linkedlist.Node;

public class KthToLastElementTest {
	Node head;
	
	@Before
	public void setup() {
		Node node8 = new Node(8);
		Node node6 = new Node(6);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node4 = new Node(4);
		Node node3 = new Node(3);
		Node node5 = new Node(5);
		
		node8.next = node6;
		node6.next = node1;
		node1.next = node2;
		node2.next = node4;
		node4.next = node3;
		node3.next = node5;
		
		head = node8;
	}
	
	@Test
	public void testIteratively() {
		int k = KthToLastElement.findKthLastElement(head, 4);
		assertEquals(2, k);
	}
	
	@Test
	public void testRecursively() {
		int k = KthToLastElement.findKthLastElementRecursively(head, 4);
		assertEquals(2, k);
	}
}
