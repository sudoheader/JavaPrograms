package com.sudoheader.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreatestProductCombination {
	
	public static void main(String[] args) {
		
//		Integer[] arr = { };
		Integer[] arr = { 4, 7, 6, 25 };
		
		List<Integer> sortedArray = Arrays.asList(arr);
		Collections.sort(sortedArray);
		
		System.out.println(findProduct(sortedArray));
	}
	
	private static int findProduct(List<Integer> arr) {
		
		if(arr.size() < 2) return 0;
		
		int last = arr.get(arr.size() - 1);
		int secondToLast = arr.get(arr.size() - 2);
		int result = last * secondToLast;

		return result;
	}

}
