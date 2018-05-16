package com.interview.crackingcode.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.interview.linkedlist.Node;

public class PartitionLinkedListTest {
	
Node head;
	
	@Before
	public void setup() {
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node6 = new Node(60);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		head = node1;
	}
	
	@Test
	public void test1() {
		head = PartitionLinkedList.partitionLinkedListMethodII(head, 25);
		Assert.assertEquals(20, head.value);
		Assert.assertEquals(10, head.next.value);
		Assert.assertEquals(60, head.next.next.value);
		Assert.assertEquals(50, head.next.next.next.value);
		Assert.assertEquals(40, head.next.next.next.next.value);
	}
}
