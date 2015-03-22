package com.example.test.chpt1;

import org.junit.Assert;
import org.junit.Test;

import com.example.chpt1.Problem5;

public class TestProblem5 {

	@Test
	public void rotate() {
		int[][] solution = Problem5.rotate(this.createMatrix(5));
		int[][] result1 = Problem5.rotateAttempt1(this.createMatrix(5));
		int[][] result2 = Problem5.rotateAttempt2(this.createMatrix(5));

		Assert.assertArrayEquals(solution, result1);
		Assert.assertArrayEquals(solution, result2);
	}

	private int[][] createMatrix(int n) {
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				matrix[i][j] = (i * n) + j + 1;
		return matrix;
	}
}
