package com.interview.crackingcode.linkedlist;

import com.interview.linkedlist.Node;

public class RecursiveNodeOperation {
	
	public static int sum(Node node) {
		if (node == null) return 0;
		return sum(node.next) + node.value;
	}
	
	public static int product(Node node) {
		if (node == null) return 1;
		return product(node.next) * node.value;
	}
	
	public static int factorial(int n) {
		if (n == 0) return 1;
		return factorial(n - 1) * n;
	}
	
	// Return 1 -> 2 -> 3 -> 4 -> 5 as 54321
	public static int reverseInt(Node node) {
		if (node == null) return 0;
		return reverseInt(node.next) * 10 + node.value;
	}
	
	public static int fib(int n) {
		if (n == 1) return 0;
		if (n == 2) return 1;
		
		return fib(n - 1) + fib(n - 2);
	}
}
