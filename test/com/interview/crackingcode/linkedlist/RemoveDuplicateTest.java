package com.interview.crackingcode.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.interview.linkedlist.CharNode;

public class RemoveDuplicateTest {
	CharNode head;
	
	@Before
	public void setup() {
		CharNode node0 = new CharNode('F');
		CharNode node1 = new CharNode('O');
		CharNode node2 = new CharNode('L');
		CharNode node3 = new CharNode('L');
		CharNode node4 = new CharNode('O');
		CharNode node5 = new CharNode('W');
		CharNode node6 = new CharNode('U');
		CharNode node7 = new CharNode('P');
		
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
		head = node0;
	}
	
	@Test
	public void test1() {
		head = RemoveDuplicates.removeDuplicated(head);
		Assert.assertEquals('F', head.value);
		Assert.assertEquals('O', head.next.value);
		Assert.assertEquals('L', head.next.next.value);
		Assert.assertEquals('W', head.next.next.next.value);
		Assert.assertEquals('U', head.next.next.next.next.value);
		Assert.assertEquals('P', head.next.next.next.next.next.value);
		Assert.assertNull(head.next.next.next.next.next.next);
	}
}
