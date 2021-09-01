package com.sudoheader.java;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		double rand = Math.random() * 1_000_000;
		int rng = (int) rand;
		
		System.out.println(rng);
	}
}
