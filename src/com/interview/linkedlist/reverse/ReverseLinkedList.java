package com.interview.linkedlist.reverse;

import com.interview.linkedlist.Node;

public class ReverseLinkedList {
	
	// https://www.youtube.com/watch?time_continue=36&v=D7y_hoT_YZI
	public static Node reverse(Node head) {
		if (head == null) return null;
		
		Node n1 = null;
		Node n2 = head;
		Node n3 = head.next;
		
		while (n3 != null) {
			n1 = n2;
			n2 = n3;
			n3 = n3.next;
			n2.next = n1;
		}
		
		return n2;
	}
}
