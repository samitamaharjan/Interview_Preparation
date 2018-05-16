package com.interview.crackingcode.linkedlist;

import com.interview.linkedlist.Node;

public class AddLinkedList {
	
	public static Node addLinkLists(Node node1, Node node2, int carryover) {
		if (node1 == null && node2 == null) return null;
		
		Node result = new Node(carryover);
		int sum = carryover;
		if (node1 != null) {
			sum += node1.value;
		}
		if (node2 != null) {
			sum += node2.value;
		}
		
		// take only second digit
		result.value = sum % 10;
		
		// recurse
		if (node1 != null || node2 != null) {
			Node node = addLinkLists(node1 == null ? null : node1.next, node2 == null ? null : node2.next, sum >= 10 ? 1 : 0);
		
			result.next = node;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(7);
		Node n2 = new Node(1);
		Node n3 = new Node(6);
		
		n1.next = n2;
		n2.next = n3;
		
		Node m1 = new Node(5);
		Node m2 = new Node(9);
		Node m3 = new Node(2);
		
		m1.next = m2;
		m2.next = m3;
		
		Node result = addLinkLists(n1, n2, 0);
		
		while(result != null) {
			System.out.println(result.value);
			result = result.next;
		}
	}
}
