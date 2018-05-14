package com.interview.crackingcode.linkedlist;

import com.interview.linkedlist.Node;

/*
 * Implement an algorithm to find the kth to last element of a singly linked list.
 */
public class KthToLastElement {
	// Fast runner and slow runner approach
	public static int findKthLastElement(Node node, int k) {
		if (node == null) return 0;
		Node slow = node;
		Node fast = node;
		
		while (k > 0) {
			fast = fast.next;
			k--;
		}
		
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.value;
	}
	
	// Recursive approach
	public static int findKthLastElementRecursively(Node node, int k) {
		if (node == null) return 0;
		int num = findKthLastElementRecursively(node.next, k) + 1;
		return num;
	}
}
