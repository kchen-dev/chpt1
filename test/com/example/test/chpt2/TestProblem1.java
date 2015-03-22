package com.example.test.chpt2;

import org.junit.Test;

import com.example.chpt2.Problem1;
import com.example.chpt2.Problem1.Node;

public class TestProblem1 {

	@Test
	public void testProblem1() {
		Node n5 = this.createNode(5, null);
		Node n4 = this.createNode(4, n5);
		Node n3 = this.createNode(4, n4);
		Node n2 = this.createNode(2, n3);
		Node n1 = this.createNode(4, n2);
		Node root = this.createNode(5, n1);

		Problem1.removeDupAttempt1(root);

		StringBuilder sb = new StringBuilder();
		while (root != null) {
			sb.append(root.getValue()).append(",");
			root = root.getNext();
		}
		sb.setLength(sb.length() - 1);
		System.out.println(sb);

	}

	private Node createNode(int value, Node next) {
		Node n = new Node();
		n.setValue(value);
		n.setNext(next);
		return n;
	}
}
