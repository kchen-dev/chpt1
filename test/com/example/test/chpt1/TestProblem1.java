package com.example.test.chpt1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.chpt1.Problem1;

public class TestProblem1 {

	@Test
	public void test() {
		assertTrue(Problem1.isAllUnique(""));
		assertTrue(Problem1.isAllUnique("A"));
		assertFalse(Problem1.isAllUnique("AA"));
		assertTrue(Problem1.isAllUnique("ABC"));
		assertFalse(Problem1.isAllUnique("ABCA"));
	}
}
