package com.interview.crackingcode.linkedlist;

import com.interview.linkedlist.Node;

/*
 *  Write code to partition a linked list around a value x, such that all nodes less than x
 *	come before all nodes greater than or equal to x
 */

public class PartitionLinkedList {
	public static Node partitionLinkedListMethodII(Node node, int x) {
		Node head = null;
		Node tail = null;
		
		// adding values in front of head and tail then merge them.
		while (node != null) {
			Node nextNode = node.next; // must store the nextNode in the beginning otherwise node.next = head = null. 
			if (node.value < x) {
				node.next = head;
				head = node;
			} else {
				node.next = tail;
				tail = node;
			}
			node = nextNode;
		}
		
		if (head == null) return tail;
		Node travelNode = head;
		while (head.next != null) {
			head = head.next;
		}
		
		head.next = tail;
		
		return travelNode;
	}
	
	// include the node with partitioning value
	public static Node partitionLinkedlist(Node node, int n) {
		Node baseNode = new Node(n);
		Node head = baseNode;
		Node tail = baseNode;
		Node node1 = node;
		
		while (node1 != null) {
			int num = node1.value;
			Node newNode = new Node(num);
			if (n < num) { 
				tail.next = newNode;
				tail = newNode;
			} else {
				newNode.next = head;
				head = newNode;
			}
			node1 = node1.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
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
		
		Node head = node1;
		
		Node output = partitionLinkedlist(head, 25);
		while (output != null) {
			System.out.println(output.value);
			output = output.next;
		}
		
		System.out.println("*************************");
		Node output1 = partitionLinkedListMethodII(head, 25);
		while (output1 != null) {
			System.out.println(output1.value);
			output1 = output1.next;
		}

	}

}
