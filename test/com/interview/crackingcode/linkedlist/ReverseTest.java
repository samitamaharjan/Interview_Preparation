package com.interview.crackingcode.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.interview.linkedlist.Node;

public class ReverseTest {
	
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
		assertEquals(15, Reverse.sum(head)); 
	}
	
	@Test
	public void test2() {
		assertEquals(120, Reverse.product(head));
	}
}
