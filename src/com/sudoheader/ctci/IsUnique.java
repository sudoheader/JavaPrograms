package com.sudoheader.ctci;

public class IsUnique {

	public static void main(String[] args) {

		String test = "asdfghkkl";

		isUniqueChars(test);

		ReducedSpace.isUniqueChars(test);
	}

	boolean isUniqueChars(String str) {
		if(str.length() > 128) return false;

		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) { // Already found this char in string
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

}

class ReducedSpace {
	boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); i++) [
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}
}
