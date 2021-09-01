package com.sudoheader.java;

public class DigitsRunner {

	public static void main(String[] args) {

		String check = "1234567890";
		String check2 = "123456789";
		int len = check.length();

		if (checker(check, len))
			System.out.println("The number " + check + " contains all digits from 0-9 ");
		else
			System.out.println("The number " + check + " does not contain all digits from 0-9 ");
	}

	public static boolean checker(String check, int len) {
		
		int num = Integer.parseInt(check);
		boolean b = true;
		char[] ch = new char[len];
		
		if(len < 10) return false;

		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
//				if(isDigit(ch[i]))return true;
			}
		}
		return true;
	}

	public static boolean isDigit(String ch) {
		try {
			int d = Integer.parseInt(ch);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}
