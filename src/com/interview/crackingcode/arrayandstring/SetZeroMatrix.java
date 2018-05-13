package com.interview.crackingcode.arrayandstring;

public class SetZeroMatrix {
	
	public int[][] matrix(int[][] mat) {
		boolean[] row = new boolean[mat.length];
		boolean[] col = new boolean[mat[0].length];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; i < mat[i].length; i++) {
				if (mat[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; i < mat[i].length; i++) {
				if (row[i] || col[j]) {
					mat[i][j] = 0;
				}
			}
		}
		
		return mat;
	}

}
