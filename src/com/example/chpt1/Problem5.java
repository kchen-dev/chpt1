package com.example.chpt1;


public class Problem5 {
	public static int[][] rotate(int[][] matrix) {
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; ++i) {
				int offset = i - first;

				int top = matrix[first][i];

				matrix[first][i] = matrix[last - offset][first];

				matrix[last - offset][first] = matrix[last][last - offset];

				matrix[last][last - offset] = matrix[i][last];

				matrix[i][last] = top;
			}
		}
		return matrix;
	}

	public static int[][] rotateAttempt1(int[][] matrix) {
		int n = matrix.length;
		int[][] newMat = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				newMat[j][n - i - 1] = matrix[i][j];

		return newMat;
	}

	public static int[][] rotateAttempt2(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - i - 1][j];
				matrix[n - i - 1][j] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		return matrix;
	}
}
