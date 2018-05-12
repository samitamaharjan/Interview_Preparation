package com.interview.linkedlist.removeeven;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.interview.linkedlist.Node;


public class RemoveEvenTest {
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
	public void test1() {
		head = RemoveEven.removeEven(head);
		Assert.assertEquals(1, head.value);
		Assert.assertEquals(3, head.next.value);
		Assert.assertEquals(5, head.next.next.value);
		Assert.assertNull(head.next.next.next);
	}
}
