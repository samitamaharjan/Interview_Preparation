package com.interview.tree.bfs;

import java.util.LinkedList;

import com.interview.tree.TreeNode;

public class BFS {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(9);
		TreeNode node3 = new TreeNode(20);
		TreeNode node4 = new TreeNode(15);
		TreeNode node5 = new TreeNode(7);
		TreeNode node6 = new TreeNode(8);
		
		node1.left = node2;
		node2.right = node3;
		node3.left = node4;
		node3.right = node5;
		node5.left = node6;
		
		TreeNode root = node1;
		printInBFS(root);
	}
	
	public static void printInBFS(TreeNode node) {
		LinkedList<TreeNode> current = new LinkedList<>();
		
		if (node != null) {
			current.add(node);
		}
		
		while (current.size() > 0) {
			LinkedList<TreeNode> parent = current;
			current = new LinkedList<>();
			
			for (TreeNode tn : parent) {
				System.out.println(tn.value);
				if (tn.left != null) {
					current.add(tn.left);
				}
				
				if (tn.right != null) {
					current.add(tn.right);
				}
			}
		}
	}
}
