package com.interview.crackingcode.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.interview.tree.TreeNode;

public class TreeOperationTest {
	
	TreeNode n1, n2, n3, n4, n5, n6;
	TreeNode b1, b2, b3, b4, b5, b6, b7, b8, b9;
	
	@Before
	public void setup() {
		n1 = new TreeNode(1);
		n2 = new TreeNode(2);
		n3 = new TreeNode(3);
		n4 = new TreeNode(4);
		n5 = new TreeNode(5);
		n6 = new TreeNode(6);
		
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right = n5;
		n5.right = n6;
		
		b1 = new TreeNode(1);
		b2 = new TreeNode(2);
		b3 = new TreeNode(3);
		b4 = new TreeNode(4);
		b5 = new TreeNode(5);
		b6 = new TreeNode(6);
		b7 = new TreeNode(7);
		b8 = new TreeNode(8);
		b9 = new TreeNode(9);
		
		b1.left = b2;
		b2.left = b3;
		b3.left = b4;
		b1.right = b5;
		b5.left = b6;
		b5.right = b7;
		b6.left = b8;
		b6.right = b9;
	}
	
	@Test
	public void testHeight() {
		assertEquals(4, TreeOperation.height(n1));
		assertEquals(1, TreeOperation.height(n2));
		assertEquals(3, TreeOperation.height(n3));
		assertEquals(1, TreeOperation.height(n4));
		assertEquals(2, TreeOperation.height(n5));
		assertEquals(1, TreeOperation.height(n6));
	}
	
	@Test
	public void testBalanced() {
		assertEquals(false, TreeOperation.isBalanced(b1));
		assertEquals(false, TreeOperation.isBalanced(b2));
		assertEquals(true, TreeOperation.isBalanced(b3));
		assertEquals(true, TreeOperation.isBalanced(b4));
		assertEquals(true, TreeOperation.isBalanced(b5));
		assertEquals(true, TreeOperation.isBalanced(b6));
		assertEquals(true, TreeOperation.isBalanced(b7));
		assertEquals(true, TreeOperation.isBalanced(b8));
		assertEquals(true, TreeOperation.isBalanced(b9));		
	}
}
