package com.interview.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.interview.crackingcode.linkedlist.RecursiveNodeOperation;

public class RecursiveNodeOperationTest {
	Node head;
	
	@Before
	public void setup() {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		head = node1;
	}
	
	@Test
	public void testSum() {
		Assert.assertEquals(10, RecursiveNodeOperation.sum(head));
	}
	
	@Test
	public void testProduct() {
		Assert.assertEquals(24, RecursiveNodeOperation.product(head));
	}
	
	@Test
	public void testFactorial() {
		Assert.assertEquals(24, RecursiveNodeOperation.factorial(4));
	}
	
	@Test
	public void testReverseInt() {
		Assert.assertEquals(4321, RecursiveNodeOperation.reverseInt(head));
	}
	
	@Test
	public void testFib() {
		Assert.assertEquals(13, RecursiveNodeOperation.fib(8));
	}
}
