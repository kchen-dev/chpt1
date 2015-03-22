package com.example.test.chpt1;

import org.junit.Assert;
import org.junit.Test;

import com.example.chpt1.Problem6;

public class TestProblem6 {

	@Test
	public void rotate() {
		int[][] solution = Problem6.zero(this.createMatrix(5));
		int[][] result1 = Problem6.zeroAttempt1(this.createMatrix(5));
		int[][] result2 = Problem6.zeroAttempt2(this.createMatrix(5));

		Assert.assertArrayEquals(solution, result1);
		Assert.assertArrayEquals(solution, result2);
	}

	private int[][] createMatrix(int n) {
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				matrix[i][j] = (i * n) + j + 1;
		matrix[n / 2][n / 2] = 0;
		matrix[0][n / 2] = 0;
		matrix[n / 2][0] = 0;
		return matrix;
	}
}
