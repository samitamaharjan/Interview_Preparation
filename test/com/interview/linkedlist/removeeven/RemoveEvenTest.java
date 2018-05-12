package com.interview.linkedlist.removeeven;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.interview.linkedlist.Node;


public class RemoveEvenTest {
	Node head;
	
	@Before
	public void setup() {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node4 = new Node(4);
		Node node3 = new Node(3);
		Node node5 = new Node(5);
		
		node1.next = node2;
		node2.next = node4;
		node4.next = node3;
		node3.next = node5;
		
		head = node1;
	}
	
	@Test
	public void test1() {
		RemoveEven.removeEven(head);
		Assert.assertEquals(head.value, 1);
		Assert.assertEquals(head.next.value, 3);
		Assert.assertEquals(head.next.next.value, 5);
		Assert.assertNull(head.next.next.next);
	}
}
