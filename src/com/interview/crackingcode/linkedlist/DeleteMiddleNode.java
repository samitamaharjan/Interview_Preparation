package com.interview.crackingcode.linkedlist;

import com.interview.linkedlist.Node;

/*
 * Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.
 */

public class DeleteMiddleNode {
	
	public static Node deleteMiddleNode(Node node) {
		Node nextNode = node.next;
		node.value = nextNode.value;
		node.next = nextNode.next;
		nextNode = null;
		return node;
	}
}
