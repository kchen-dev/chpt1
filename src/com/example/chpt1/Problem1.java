package com.example.chpt1;

import java.util.HashSet;

public class Problem1 {

	public static boolean isAllUnique(String s) {
		if (s == null || s.isEmpty())
			return true;

		HashSet<Character> seenChars = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			if (!seenChars.add(s.charAt(i)))
				return false;
		}
		return true;
	}
}
