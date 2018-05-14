package com.interview.tree;

public class BinarySearchTree {
	private static TreeNode root;
	
	public static void addNode(int value) {
		TreeNode newNode = new TreeNode(value);
		
		if (root == null) {
			root = newNode;
		} else {
			TreeNode node = root;
			TreeNode parent;
			
			while (true) {
				parent = node;
				
				if (value < node.value) {
					node = node.left;
					
					if (node == null) {
						parent.left = newNode;
						return;
					}
				} else {
					node = node.right;
					
					if (node == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	public static void preOrderTraverse(TreeNode node) {
		if (node == null) return;
		
		// VLR
		System.out.println(node.value);
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
	}
	
	public static void inOrderTraverse(TreeNode node) {
		if (node == null) return;
		
		// LVR
		inOrderTraverse(node.left);
		System.out.println(node.value);
		inOrderTraverse(node.right);
	}
	
	public static void postOrderTraverse(TreeNode node) {
		if (node == null) return;
		
		// LRV
		postOrderTraverse(node.left);
		postOrderTraverse(node.right);
		System.out.println(node.value);
	}
	
	public static TreeNode findNode(TreeNode root, int value) {
		TreeNode node = root;
		
		while (node.value != value) {
			if (value < node.value) {
				node = node.left;
			} else {
				node = node.right;
			}
			
			if (node == null) return null;
		}
		
		return node;
	}
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		int[] arr = {12, 18, 6, 7, 26, 3, 19};
		for (int val : arr) {
			tree.addNode(val);
		}
		System.out.println("Pre-order traverse: ");
		preOrderTraverse(tree.root);
		
		System.out.println("\nIn-order traverse: ");
		inOrderTraverse(tree.root);
		
		System.out.println("\nPost-order traverse: ");
		postOrderTraverse(tree.root);
	}
}
