package com.interview.tree.dfs;

public class DFS {

	public static void main(String[] args) {
		Integer[] arr = {3, 9, 20, null, null, 15, 7, null, null, null, null, null, null, 8, null};
		printInorder(arr);
	}
	
	public static void printInorder(Integer[] arr) {
		printInorder(arr, 0);
	}
	
	private static void printInorder(Integer[] arr, int n) {
		if (n >= arr.length || arr[n] == null) return;
		
		printInorder(arr, 2 * n + 1);
		System.out.println(arr[n]);
		printInorder(arr, 2 * n + 2);
	}
}
