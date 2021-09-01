package com.sudoheader.java;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = sc.nextInt();
		sc.close();
		if(powerOfTwo(input))
			System.out.println("The number " + input + " is a power of two.");
		else
			System.out.println("The number " + input + " is not a power of two.");
	}
	
	static boolean powerOfTwo(int x) {
        return x != 0 && ((x & (x - 1)) == 0);
	}
}
