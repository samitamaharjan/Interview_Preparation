package com.interview.crackingcode.tree;

import com.interview.tree.TreeNode;

public class TreeOperation {
	
	/*
	 * Length of a linkedlist node = return length(Node.next) + 1;
	 * Height of a tree node = maximum of left tree node and right tree node + 1.
	 */
	
	public static int height(TreeNode node) {
		if (node == null) return 0;
		
		return Math.max(height(node.left), height(node.right)) + 1;
	}
	
	public static boolean isBalanced(TreeNode node) {
		if (node == null) return true;
		
		int diff = Math.abs(height(node.left) - height(node.right));
		if (diff > 1) return false;
		return isBalanced(node.left) && isBalanced(node.right);
	}
}
