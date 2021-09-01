package com.sudoheader.java;

import java.util.Arrays;

public class Condense {

    public static void main(String[] args) {
        String str = "aaabbbccccaa";
        System.out.println(str + " condensing will be: ");
        compressString(str);
    }

    public static void compressString(String str) {

        int len = str.length();
        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray));

        for(int i = 0; i < len; i++) {

            int count = 1;
            while(i < len - 1 && charArray[i] == charArray[i + 1]) {
                count++;
                i++;
            }

            if(count == 1) {
            	String one = String.valueOf(charArray[i]);
                System.out.print(one);
            }
            else {
            	String moreThanOne = String.valueOf(charArray[i]);
                System.out.print(moreThanOne + count);
            }
        }
    }
}
