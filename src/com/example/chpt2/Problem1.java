package com.example.chpt2;

import java.util.HashSet;

public class Problem1 {

	public static void removeDupAttempt1(Node root) {
		HashSet<Integer> seenInts = new HashSet<Integer>();
		Node previous = null;
		Node current = root;
		while (current != null) {
			if (previous != null && seenInts.contains(current.getValue())) {
				previous.setNext(current.getNext());
				current = current.getNext();
			} else {
				seenInts.add(current.getValue());
				previous = current;
				current = current.getNext();
			}
		}
	}

	public static class Node {
		private int value;
		private Node next;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
}
