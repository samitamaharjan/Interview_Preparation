package com.interview.linkedlist.removeeven;

import com.interview.linkedlist.Node;

public class RemoveEven {

	public static Node removeEven(Node head) {
		
		while (head.value % 2 == 0) {
			head = head.next;
		}
		
		Node node = head;
		while (node.next != null) {
			Node node2 = node.next;
			if (node2.value % 2 == 0) {
				node.next = node2.next;
				node2 = null;
			} else {
				node = node.next;
			}
		}
		return head;
	}
}
