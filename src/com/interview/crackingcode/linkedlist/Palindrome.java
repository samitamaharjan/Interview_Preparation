package com.interview.crackingcode.linkedlist;

import java.util.Stack;

import com.interview.linkedlist.Node;

public class Palindrome {
	
	public boolean isPalindrome(Node head) {
		Node fast = head;
		Node slow = head;
		Stack<Integer> stack = new Stack<Integer>();
		
		while(fast != null && fast.next != null) {
			stack.push(slow.value);
			fast = fast.next.next;
			slow = slow.next;
			
		}
		// if the linkedlist length is odd, skip the middle element.
		if (fast != null) {
			slow = slow.next;
		}
		while (slow != null) {
			// get value from stack
			int top = stack.pop().intValue();
			
			// if the values are different, then it's not a palindrome
			if (top != slow.value) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
}
