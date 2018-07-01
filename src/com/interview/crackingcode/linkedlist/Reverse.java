package com.interview.crackingcode.linkedlist;

import com.interview.linkedlist.Node;

public class Reverse {
	
	public static void main(String[] args) {
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node4 = new Node(4);
		Node node3 = new Node(3);
		Node node5 = new Node(5);
		
		node1.next = node2;
		node2.next = node4;
		node4.next = node3;
		node3.next = node5;
		
		Node head = node1;
		
		// print reverse
		printReverse(head);
		
		System.out.println("*********");
		
		// print forward
		printForward(head);
	}
	
	public static void printReverse(Node node) {
		if (node == null) return;
		
		printReverse(node.next);
		System.out.println(node.value);
	}
	
	public static void printForward(Node node) {
		if (node == null) return;
		System.out.println(node.value);
		printForward(node.next);
	}
	
	public static int sum(Node node) {
		if (node == null) return 0;
		return sum(node.next) + node.value;
	}
	
	public static int product(Node node) {
		if (node == null) return 1;
		
		return product(node.next) * node.value;
	}
}
