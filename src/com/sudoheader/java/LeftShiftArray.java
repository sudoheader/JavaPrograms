package com.sudoheader.java;

import java.util.Arrays;

public class LeftShiftArray {
   
    public static void main(String[] args) {  
        int [] arr = new int [] {1, 2, 3, 4};  
        int [] arr2 = new int [] {1, 2, 3};  

        // change this for number of steps
        int numberOfSteps = 1;  
        System.out.println("Starting array: ");  
        for (int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();
        System.out.println("\nStarting array: ");  
        for (int i = 0; i < arr2.length; i++) { 
            System.out.print(arr2[i] + " ");  
        }  

        System.out.println();
        System.out.println();
        System.out.println("Left shifting the array " + Arrays.toString(arr) + ": ");
        leftShift(arr, numberOfSteps);
        for(int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();
        System.out.println("\nLeft shifting the array " + Arrays.toString(arr2) + ": ");
        leftShift(arr2, numberOfSteps);
        for(int i = 0; i < arr2.length; i++) {  
            System.out.print(arr2[i] + " ");  
        }  
    }  
    
    private static void leftShift(int[] arr, int numberOfSteps) {
         for(int i = 0; i < numberOfSteps; i++) {  
            int j, firstElement;  

            // not the "Fifth Element" :)
            firstElement = arr[0];  
            for(j = 0; j < arr.length - 1; j++) {  
                arr[j] = arr[j + 1];  
            }  
            arr[j] = firstElement;  
        }     	
	}
}