package com.example.chpt1;

import java.util.HashSet;

public class Problem6 {
	public static int[][] zeroAttempt1(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;

		Integer[][] newMat = new Integer[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0)
					helpAttempt1(newMat, i, j);
				else if (newMat[i][j] == null)
					newMat[i][j] = matrix[i][j];
			}
		}

		int[][] primMat = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				primMat[i][j] = newMat[i][j].intValue();
			}
		}
		return primMat;
	}

	private static void helpAttempt1(Integer[][] matrix, int i, int j) {
		for (int n = 0; n < matrix[0].length; n++) {
			matrix[i][n] = 0;
		}
		for (int n = 0; n < matrix.length; n++) {
			matrix[n][j] = 0;
		}
	}

	public static int[][] zeroAttempt2(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;

		HashSet<Integer> rowZero = new HashSet<>();
		HashSet<Integer> colZero = new HashSet<>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					rowZero.add(i);
					colZero.add(j);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (rowZero.contains(i) || colZero.contains(j))
					matrix[i][j] = 0;
			}
		}

		return matrix;
	}

	public static int[][] zero(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}

		for (int i = 0; i < row.length; i++) {
			if (row[i]) {
				zeroRow(matrix, i);
			}
		}

		for (int j = 0; j < column.length; j++) {
			if (column[j]) {
				zeroCol(matrix, j);
			}
		}

		return matrix;
	}

	private static void zeroRow(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}
	}

	private static void zeroCol(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}
}
