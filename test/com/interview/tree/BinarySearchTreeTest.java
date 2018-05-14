package com.interview.tree;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {
	BinarySearchTree tree = new BinarySearchTree();
	
	@Test
	public void testAddNode() {
		int[] arr = {12, 18, 6, 7, 26, 3, 19};
		for (int val : arr) {
			tree.addNode(val);
		}
	}
	
	@Test
	public void testPreOrderTraverse() {
		// Assert.assertEquals(12, tree.preOrderTraverse(tree.));
	}
}
