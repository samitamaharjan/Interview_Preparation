package com.interview.crackingcode.linkedlist;

import com.interview.linkedlist.Node;

/*
 *  Write code to partition a linked list around a value x, such that all nodes less than x
 *	come before all nodes greater than or equal to x
 */

public class PartitionLinkedList {

	public static void main(String[] args) {
		Node node8 = new Node(80);
		Node node6 = new Node(60);
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node4 = new Node(40);
		Node node3 = new Node(30);
		Node node5 = new Node(50);
		
		node8.next = node6;
		node6.next = node1;
		node1.next = node2;
		node2.next = node4;
		node4.next = node3;
		node3.next = node5;
		
		Node head = node8;
		
		Node output = partitionLinkedlist(head, 25);
		while (output != null) {
			System.out.println(output.value);
			output = output.next;
		}

	}
	
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

}
