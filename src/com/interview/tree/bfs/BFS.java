package com.interview.tree.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.interview.tree.TreeNode;

public class BFS {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(9);
		TreeNode node3 = new TreeNode(20);
		TreeNode node4 = new TreeNode(11);
		TreeNode node5 = new TreeNode(12);
		TreeNode node6 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node7.left = node8;
		
		TreeNode root = node1;
		//printInBFS(root);
		System.out.println(TreeToBFSLinkedList(root).toString());
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
	
	public static LinkedList<Integer> TreeToBFSLinkedList(TreeNode node) {
		List<TreeNode> current = new ArrayList<>();
		LinkedList<Integer> list = new LinkedList<>();
		
		if (node != null) {
			current.add(node);
		}
		
		while (current.size() > 0) {
			List<TreeNode> parent = current;
			current = new LinkedList<>();
			
			for (TreeNode tn : parent) {
				list.add(tn.value);
				if (tn.left != null) {
					current.add(tn.left);
				}
				
				if (tn.right != null) {
					current.add(tn.right);
				}
			}
		}
		return list;
	}
}
